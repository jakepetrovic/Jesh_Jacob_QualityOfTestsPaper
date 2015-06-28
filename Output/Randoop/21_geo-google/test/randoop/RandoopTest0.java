package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.fromValue("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    geo.google.mapping.XmlToAddressFunctor var0 = new geo.google.mapping.XmlToAddressFunctor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = var0.execute("hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    geo.google.utils.XmlUtils var0 = new geo.google.utils.XmlUtils();

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    javax.xml.xpath.XPath var0 = geo.google.utils.XmlUtils.newXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.valueOf("geo.google.GeoException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    java.lang.String var4 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAltitude.GeoAltitudeMode var1 = geo.google.datamodel.GeoAltitude.GeoAltitudeMode.valueOf("geo.google.GeoException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    geo.google.datamodel.GeoAltitude.GeoAltitudeMode[] var0 = geo.google.datamodel.GeoAltitude.GeoAltitudeMode.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    geo.google.datamodel.GeoStatusCode[] var0 = geo.google.datamodel.GeoStatusCode.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.getPostOffice();
    java.lang.String var3 = var0.getType();
    java.util.List var4 = var0.getAdministrativeAreaName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var3 = var0.createBuildingNameType();
    java.lang.String var4 = var3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    var1.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.lang.String var8 = var7.getPremiseThoroughfareConnector();
    var1.setPremise(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var11 = var10.createPremise();
    java.lang.String var12 = var11.getPremiseThoroughfareConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var13 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var11.setPremiseLocation(var13);
    var1.setPremiseLocation(var13);
    java.lang.String var16 = var13.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var2 = var0.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var3 = var0.getPostBoxNumberSuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAltitude.GeoAltitudeMode var1 = geo.google.datamodel.GeoAltitude.GeoAltitudeMode.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    java.lang.String var5 = var4.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.createThoroughfare();
    var3.setDependentThoroughfares("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var3 = var1.standardizeToGeoCoordinate("Uknown Status");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    var5.setType("G_GEO_UNKOWN_STATUS");
    var5.setCode("geo.google.GeoException: geo.google.GeoException: ");
    
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

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    var4.setUsageType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    java.util.List var7 = var6.getAny();
    
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

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.valueOf("geo.google.GeoException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.valueOf("Uknown Status");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    java.util.Map var4 = var3.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var5 = var0.createAddressLinesType();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAddressLine();
    
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

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressLine();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setType("Uknown Status");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    var5.setType("");
    java.lang.String var9 = var5.getType();
    java.lang.String var10 = var5.getCode();
    
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("hi!");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.util.List var2 = var0.getSupplementaryPostalServiceData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    java.util.List var3 = var1.getAny();
    var1.setType("");
    var1.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var8 = var1.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var10 = var9.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var11 = var9.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var9.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var13 = var9.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var14 = var9.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var15 = var9.createFirmType();
    var1.setFirm(var15);
    java.util.List var17 = var15.getAddressLine();
    java.util.Map var18 = var15.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var9 = var8.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var10 = var8.createDependentLocalityTypeDependentLocalityNumber();
    var0.setDependentLocalityNumber(var10);
    java.util.Map var12 = var0.getOtherAttributes();
    var0.setUsageType("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var3 = var0.createPremisePremiseName();
    java.lang.String var4 = var3.getTypeOccurrence();
    var3.setCode("hi!");
    java.lang.String var7 = var3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var3 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var4 = var0.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var5 = var4.getIndicator();
    var4.setCode("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.fromValue("Uknown Status");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    java.lang.String var9 = var4.getContent();
    var4.setType("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var0.setCode("hi!");
    var0.setContent("");
    var0.setContent("");

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var3 = var1.standardizeToGeoUsAddress("geo.google.GeoException: ");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    geo.google.GeoException var1 = new geo.google.GeoException("(default) Indicates to ignore an altitude specification");

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var1.standardizeToGeoUsAddresses("(default) Indicates to ignore an altitude specification");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var3 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var4 = var0.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var5 = var4.getIndicator();
    var4.setIndicator("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    java.util.List var5 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var7 = var6.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var8 = var6.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var9 = var6.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var10 = var6.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var11 = var10.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var10.getDependentLocalityNumber();
    var0.setDependentLocality(var10);
    java.util.List var14 = var0.getThoroughfareNumberPrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var2.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var5 = var2.getNameNumberOccurrence();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    var1.setPremise(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var7 = var6.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var8 = var7.getMailStopNumber();
    var1.setMailStop(var7);
    java.util.List var10 = var1.getPremiseNumberSuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var3 = var0.getPostalCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    java.lang.String var1 = var0.getCode();
    var0.setType("hi!");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getContent();
    java.util.Map var7 = var0.getOtherAttributes();
    java.util.Map var8 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    var1.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.lang.String var8 = var7.getPremiseThoroughfareConnector();
    var1.setPremise(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var11 = var10.createPremise();
    java.lang.String var12 = var11.getPremiseThoroughfareConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var13 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var11.setPremiseLocation(var13);
    var1.setPremiseLocation(var13);
    var13.setContent("Uknown Status");
    var13.setCode("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setCode("");
    java.lang.String var3 = var0.getIndicator();
    var0.setNumberType("G_GEO_UNKOWN_STATUS");
    var0.setIndicatorOccurrence("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setCode("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var12.createPremise();
    java.util.List var14 = var13.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var15 = var13.getFirm();
    var13.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var19 = var18.createPremise();
    java.lang.String var20 = var19.getPremiseThoroughfareConnector();
    var13.setPremise(var19);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var23 = var22.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var24 = var22.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var25 = var22.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var26 = var25.getType();
    java.util.List var27 = var25.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var29 = var28.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var30 = var28.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var31 = var28.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var32 = var28.createThoroughfare();
    java.util.List var33 = var32.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var34 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var35 = var34.getPostTown();
    var32.setPostalCode(var34);
    var25.setPostalCode(var34);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var38 = var25.getPostalCode();
    var13.setPostalCode(var38);
    boolean var40 = var0.equals((java.lang.Object)var13);
    double var41 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1.0d));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix();
    var0.setContent("Uknown Status");

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("geo.google.GeoException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var3.setContent("");
    java.util.Map var6 = var3.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var3 = var1.standardizeToGeoAddress("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var3 = var0.getPostBoxNumberPrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    var1.setPremise(var4);
    java.lang.String var6 = var1.getType();
    var1.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    var0.setType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getContent();
    var0.setType("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom();
    java.util.List var1 = var0.getPremiseNumber();
    java.util.List var2 = var0.getAddressLine();
    java.util.List var3 = var0.getPremiseNumberSuffix();
    java.util.List var4 = var0.getPremiseNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    var2.setContent("geo.google.GeoException: ");
    java.lang.String var5 = var2.getType();
    var2.setType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var2 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var3 = var0.createBuildingNameType();
    var3.setContent("geo.google.GeoException: ");
    java.lang.String var6 = var3.getContent();
    java.lang.String var7 = var3.getTypeOccurrence();
    var3.setType("geo.google.GeoException: ");
    var3.setTypeOccurrence("geo.google.GeoException: ");
    java.lang.String var12 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "geo.google.GeoException: "+ "'", var12.equals("geo.google.GeoException: "));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var5 = var1.standardizeToGeoUsAddress("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    geo.google.datamodel.GeoStatusCode var2 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var3 = new geo.google.GeoException("", var2);
    java.lang.String var4 = var2.getCodeName();
    java.lang.String var5 = var2.name();
    java.lang.String var6 = var2.getDescription();
    java.lang.String var7 = var2.name();
    java.lang.String var8 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var4.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var5.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Uknown Status"+ "'", var6.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var7.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Uknown Status"+ "'", var8.equals("Uknown Status"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var5 = var1.standardizeToGeoAddress("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    var0.setNumberSuffixSeparator("G_GEO_UNKOWN_STATUS");
    var0.setNumberSuffixSeparator("hi!");
    java.lang.String var5 = var0.getCode();
    var0.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var1 = geo.google.mapping.MappingUtils.stringToCoordinate("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var3 = var1.equals((java.lang.Object)10L);
    java.lang.Class var4 = var1.getDeclaringClass();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var5.setThoroughfarePostDirection(var6);
    java.lang.String var8 = var6.getCode();
    boolean var9 = var1.equals((java.lang.Object)var6);
    java.lang.String var10 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Uknown Status"+ "'", var10.equals("Uknown Status"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getCode();
    var5.setThoroughfareTrailingType(var6);
    var0.setDependentThoroughfare(var5);
    var0.setDependentThoroughfaresType("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var13.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var15 = var13.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var16 = var13.createThoroughfareLeadingTypeType();
    java.lang.String var17 = var16.getType();
    var0.setThoroughfareLeadingType(var16);
    java.util.Map var19 = var16.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var2.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var5 = var4.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var4.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var7 = var4.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var8 = var4.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var9 = var4.createLargeMailUserTypeLargeMailUserIdentifier();
    var2.setLargeMailUserIdentifier(var9);
    java.lang.String var11 = var2.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var12.setIndicator("G_GEO_UNKOWN_STATUS");
    var2.setPostBox(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var16 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var17 = var16.getAddressLine();
    var2.setPostBox(var16);
    java.util.List var19 = var16.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    geo.google.datamodel.GeoAltitude var0 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var1 = var0.clone();
    var1.setAltitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getContent();
    var0.setType("geo.google.GeoException: ");
    java.lang.String var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    geo.google.mapping.PointToCoordinateFunctor var0 = geo.google.mapping.PointToCoordinateFunctor.getInstance();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var1.createPremise();
    java.util.List var3 = var2.getAddressLine();
    geo.google.mapping.FunctionChain var4 = new geo.google.mapping.FunctionChain(var3);
    geo.google.mapping.FunctionChain var5 = new geo.google.mapping.FunctionChain((geo.google.mapping.Functor)var0, var4);
    geo.google.mapping.PointToCoordinateFunctor var6 = geo.google.mapping.PointToCoordinateFunctor.getInstance();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var8 = var7.createPremise();
    java.util.List var9 = var8.getAddressLine();
    geo.google.mapping.FunctionChain var10 = new geo.google.mapping.FunctionChain(var9);
    geo.google.mapping.FunctionChain var11 = new geo.google.mapping.FunctionChain((geo.google.mapping.Functor)var6, var10);
    var5.setHead((geo.google.mapping.Functor)var6);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var5.execute((java.lang.Object)var13);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var5 = var1.standardizeToGeoUsAddress("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    var0.setValidFromDate("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    java.lang.String var4 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var3.setCode("hi!");
    var1.setPremiseLocation(var3);
    java.lang.String var7 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    java.lang.String var1 = var0.getType();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var4 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var2.standardizeToGeoUsAddresses("Uknown Status");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var1 = var0.getValidToDate();
    var0.setAddressDetailsKey("hi!");
    java.util.Map var4 = var0.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var6 = var5.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var7 = var5.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var8 = var5.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var9 = var5.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var10 = var5.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var11 = var5.createLocality();
    var0.setLocality(var11);
    java.lang.String var13 = var0.getUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var5 = var2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.lang.String var3 = var1.getCode();
    java.lang.String var4 = var1.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName();
    var0.setCode("Uknown Status");
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setContent("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    java.lang.String var7 = var5.getType();
    java.lang.String var8 = var5.getType();
    java.util.Map var9 = var5.getOtherAttributes();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var2 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var3 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var4 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    java.lang.String var5 = var4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    var5.setIndicator("G_GEO_UNKOWN_STATUS");
    var5.setNumberRangeOccurence("G_GEO_UNKOWN_STATUS");
    
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    java.lang.String var7 = var6.getVersion();
    
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
    assertNull(var7);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.GeoException: ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var5 = var1.standardizeToGeoCoordinate("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setScheme("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var5 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    var0.setIndicator("hi!");
    var0.setCode("(default) Indicates to ignore an altitude specification");

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var1.getMailStop();
    var1.setPremiseDependencyType("");
    java.lang.String var8 = var1.getPremiseDependency();
    java.lang.String var9 = var1.getPremiseDependency();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var10 = var1.getPremiseNumberRange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setCode("Uknown Status");
    java.lang.String var4 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier();
    java.lang.String var1 = var0.getIndicator();
    java.util.Map var2 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setRangeType("");
    java.lang.String var7 = var0.getType();
    java.util.Map var8 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Uknown Status"+ "'", var7.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setScheme("geo.google.GeoException: geo.google.GeoException: ");
    var0.setCode("geo.google.GeoException: geo.google.GeoException: ");
    java.util.Map var7 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.valueOf("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    var4.setIndicator("hi!");
    java.lang.String var7 = var4.getContent();
    var2.setPostOfficeNumber(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var9 = var2.getPostalCode();
    java.util.Map var10 = var2.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var3 = var0.createPremisePremiseName();
    var3.setTypeOccurrence("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    var6.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var9 = var6.getOtherAttributes();
    var6.setNameNumberSeparator("hi!");
    
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
    assertNotNull(var9);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var9 = var0.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var11 = var10.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var12 = var10.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var13 = var10.createAddressDetailsCountry();
    java.util.List var14 = var13.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var15 = var13.getThoroughfare();
    java.util.List var16 = var13.getCountryNameCode();
    java.util.List var17 = var13.getCountryNameCode();
    var0.setCountry(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var19 = var13.getAdministrativeArea();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    geo.google.datamodel.GeoAltitude var3 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var4 = var3.getMode();
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate(0.0d, 1.0d, var3);
    double var6 = var3.getAltitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10.0d);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    org.apache.commons.httpclient.params.HttpClientParams var3 = var2.getHttpClientParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var5 = var2.standardizeToGeoUsAddress("Uknown Status");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix();
    var0.setCode("geo.google.GeoException: ");

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    geo.google.datamodel.GeoAddressAccuracy[] var0 = geo.google.datamodel.GeoAddressAccuracy.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName();

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    var2.setContent("geo.google.GeoException: ");
    var2.setCode("Uknown Status");
    java.lang.String var7 = var2.getNumberPrefixSeparator();
    var2.setContent("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    geo.google.datamodel.GeoAltitude var1 = new geo.google.datamodel.GeoAltitude(100.0d);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var6 = var0.createPostalCodePostalCodeNumber();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getContent();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.Integer var2 = var0.getAccuracy();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var3 = var0.getAddressLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    var1.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.lang.String var8 = var7.getPremiseThoroughfareConnector();
    var1.setPremise(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var11 = var10.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var12 = var10.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var13 = var10.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var14 = var13.getType();
    java.util.List var15 = var13.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var17 = var16.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var18 = var16.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var19 = var16.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var20 = var16.createThoroughfare();
    java.util.List var21 = var20.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var22 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var23 = var22.getPostTown();
    var20.setPostalCode(var22);
    var13.setPostalCode(var22);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var26 = var13.getPostalCode();
    var1.setPostalCode(var26);
    java.util.List var28 = var26.getPostalCodeNumberExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    var5.setIndicator("G_GEO_UNKOWN_STATUS");
    var5.setType("hi!");
    var5.setType("geo.google.GeoException: geo.google.GeoException: ");
    
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

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getCurrentStatus();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = var0.getAddress();
    var0.setValidFromDate("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var0.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var3 = var0.getCode();
    java.util.Map var4 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    geo.google.datamodel.GeoStatusCode var5 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var6 = new geo.google.GeoException("", var5);
    java.lang.String var7 = var6.toString();
    geo.google.datamodel.GeoStatusCode var11 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var12 = new geo.google.GeoException("", var11);
    geo.google.datamodel.GeoStatusCode var15 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var16 = new geo.google.GeoException("", var15);
    geo.google.GeoException var17 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var12, var15);
    var6.addSuppressed((java.lang.Throwable)var17);
    geo.google.datamodel.GeoStatusCode var20 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var22 = var20.equals((java.lang.Object)10L);
    java.lang.String var23 = var20.name();
    int var24 = var20.getCode();
    geo.google.GeoException var25 = new geo.google.GeoException("", (java.lang.Throwable)var6, var20);
    geo.google.GeoException var26 = new geo.google.GeoException("(default) Indicates to ignore an altitude specification", (java.lang.Throwable)var25);
    geo.google.datamodel.GeoStatusCode var30 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var31 = new geo.google.GeoException("", var30);
    geo.google.datamodel.GeoStatusCode var34 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var35 = new geo.google.GeoException("", var34);
    geo.google.GeoException var36 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var31, var34);
    geo.google.GeoException var37 = new geo.google.GeoException((java.lang.Throwable)var36);
    geo.google.datamodel.GeoStatusCode var38 = var36.getStatus();
    geo.google.GeoException var39 = new geo.google.GeoException("hi!", (java.lang.Throwable)var25, var38);
    int var40 = var38.getCode();
    int var41 = var38.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "geo.google.GeoException: "+ "'", var7.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var23.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 9);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setSeparator("geo.google.GeoException: ");

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    geo.google.datamodel.GeoAltitude var13 = new geo.google.datamodel.GeoAltitude(0.0d);
    var0.setAltitude(var13);
    geo.google.datamodel.GeoCoordinate var15 = new geo.google.datamodel.GeoCoordinate();
    double var16 = var15.getLongitude();
    geo.google.datamodel.GeoCoordinate var17 = new geo.google.datamodel.GeoCoordinate();
    double var18 = var17.getLongitude();
    double var19 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var15, var17);
    double var20 = var17.getLatitude();
    var17.setLatitude(0.0d);
    double var23 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var17);
    double var24 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 69.09332413987235d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1.0d));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = var0.createPostBox();
    java.lang.String var6 = var5.getType();
    
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
    assertNull(var6);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    java.lang.String var7 = var6.getType();
    java.lang.String var8 = var6.getCode();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var1 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var0.setMailStopName(var1);
    java.lang.String var3 = var1.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var10 = var9.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var11 = var9.createDependentLocalityTypeDependentLocalityNumber();
    var11.setCode("G_GEO_UNKOWN_STATUS");
    var4.setDependentLocalityNumber(var11);
    var11.setContent("geo.google.GeoException: ");
    var11.setCode("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber();

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var6 = var5.createAddressDetailsPostalServiceElementsSortingCode();
    var0.setSortingCode(var6);
    var6.setCode("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode();
    var0.setType("");
    var0.setContent("G_GEO_UNKOWN_STATUS");

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    geo.google.datamodel.GeoAltitude var13 = new geo.google.datamodel.GeoAltitude(0.0d);
    var0.setAltitude(var13);
    geo.google.datamodel.GeoAltitude var15 = var0.getAltitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var3 = var0.createAddressDetailsCountry();
    java.util.List var4 = var3.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = var3.getThoroughfare();
    java.util.List var6 = var3.getCountryNameCode();
    java.util.List var7 = var3.getCountryNameCode();
    java.util.Map var8 = var3.getOtherAttributes();
    java.util.List var9 = var3.getCountryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    geo.google.datamodel.GeoStatusCode var3 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var4 = new geo.google.GeoException("", var3);
    geo.google.datamodel.GeoStatusCode var7 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var8 = new geo.google.GeoException("", var7);
    geo.google.GeoException var9 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var4, var7);
    java.lang.String var10 = var7.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var10.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var3 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var1 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var2 = var1.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var3 = var1.getAddressLines();
    var1.setUsage("");
    var1.setCode("G_GEO_UNKOWN_STATUS");
    var0.setAddressDetails(var1);
    var0.setAddress("geo.google.GeoException: ");
    var0.setAddress("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    org.xml.sax.InputSource var1 = geo.google.utils.XmlUtils.stringToInputSource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var2.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var5 = var4.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var4.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var7 = var4.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var8 = var4.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var9 = var4.createLargeMailUserTypeLargeMailUserIdentifier();
    var2.setLargeMailUserIdentifier(var9);
    java.lang.String var11 = var2.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var12.setIndicator("G_GEO_UNKOWN_STATUS");
    var2.setPostBox(var12);
    java.util.List var16 = var12.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var17 = var12.getPostBoxNumberSuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getScheme();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    java.util.List var3 = var1.getAny();
    var1.setType("");
    var1.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var8 = var1.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var10 = var9.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var11 = var9.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var9.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var13 = var9.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var14 = var9.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var15 = var9.createFirmType();
    var1.setFirm(var15);
    java.util.List var17 = var15.getAddressLine();
    var15.setType("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var17);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    var0.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var4 = var0.getSubPremiseLocation();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    com.google.earth.kml._2.StatusType var0 = new com.google.earth.kml._2.StatusType();
    java.lang.String var1 = var0.getRequest();
    int var2 = var0.getCode();
    var0.setCode((-1));
    java.lang.String var5 = var0.getRequest();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    java.lang.Class var12 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "geo.google.GeoException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var4 = var0.createLocalityLocalityName();
    java.lang.String var5 = var4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var6 = var5.getAny();
    java.lang.String var7 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var8 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var5.setAddressLatitude(var8);
    var0.setAddressLatitude(var8);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var12 = var11.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var11.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var14 = var11.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var15 = var11.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var16 = var11.createAddressDetailsPostalServiceElementsBarcode();
    var16.setType("G_GEO_UNKOWN_STATUS");
    var0.setBarcode(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var20 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var21 = var20.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var22 = var20.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var23 = var20.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var24 = var20.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    var0.setEndorsementLineCode(var24);
    var24.setType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var6 = var5.getAny();
    java.lang.String var7 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var8 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var5.setAddressLatitude(var8);
    var0.setAddressLatitude(var8);
    java.lang.String var11 = var8.getType();
    java.util.Map var12 = var8.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    var3.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    var0.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var4 = var3.getValidToDate();
    var3.setAddressDetailsKey("hi!");
    var0.setAddressDetails(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var0.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var9 = var8.getPostalServiceElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var8 = var1.getThoroughfarePostDirection();
    java.util.Map var9 = var8.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var1 = new geo.google.datamodel.GeoCoordinate();
    double var2 = var1.getLongitude();
    double var3 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var1);
    geo.google.datamodel.GeoAltitude var4 = var1.getAltitude();
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var6 = new geo.google.datamodel.GeoCoordinate();
    double var7 = var6.getLongitude();
    double var8 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var5, var6);
    double var9 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var1, var6);
    geo.google.datamodel.GeoCoordinate var10 = new geo.google.datamodel.GeoCoordinate();
    double var11 = var10.getLongitude();
    geo.google.datamodel.GeoCoordinate var12 = new geo.google.datamodel.GeoCoordinate();
    double var13 = var12.getLongitude();
    double var14 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var10, var12);
    geo.google.datamodel.GeoCoordinate var15 = new geo.google.datamodel.GeoCoordinate();
    double var16 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var10, var15);
    geo.google.datamodel.GeoStatusCode var19 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var20 = new geo.google.GeoException("", var19);
    boolean var21 = var10.equals((java.lang.Object)var19);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var23 = var22.createPremise();
    java.util.List var24 = var23.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var25 = var23.getFirm();
    var23.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var29 = var28.createPremise();
    java.lang.String var30 = var29.getPremiseThoroughfareConnector();
    var23.setPremise(var29);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var32 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var33 = var32.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var34 = var32.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var35 = var32.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var36 = var35.getType();
    java.util.List var37 = var35.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var38 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var39 = var38.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var40 = var38.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var41 = var38.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var42 = var38.createThoroughfare();
    java.util.List var43 = var42.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var44 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var45 = var44.getPostTown();
    var42.setPostalCode(var44);
    var35.setPostalCode(var44);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var48 = var35.getPostalCode();
    var23.setPostalCode(var48);
    boolean var50 = var10.equals((java.lang.Object)var23);
    geo.google.datamodel.GeoCoordinate var51 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var52 = new geo.google.datamodel.GeoCoordinate();
    double var53 = var52.getLongitude();
    double var54 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var51, var52);
    geo.google.datamodel.GeoAltitude var55 = var52.getAltitude();
    geo.google.datamodel.GeoCoordinate var56 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var57 = new geo.google.datamodel.GeoCoordinate();
    double var58 = var57.getLongitude();
    double var59 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var56, var57);
    double var60 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var52, var57);
    double var61 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var10, var57);
    double var62 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var1, var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getUsage();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var5 = var4.getContent();
    var4.setType("Uknown Status");
    var0.setAddress(var4);
    var4.setContent("Uknown Status");
    java.lang.String var11 = var4.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Uknown Status"+ "'", var11.equals("Uknown Status"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getType();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setType("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var4 = var3.getType();
    java.util.List var5 = var3.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var7 = var6.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var8 = var6.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var9 = var6.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var10 = var6.createThoroughfare();
    java.util.List var11 = var10.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var13 = var12.getPostTown();
    var10.setPostalCode(var12);
    var3.setPostalCode(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var16 = var3.getPostOffice();
    java.lang.String var17 = var3.getIndicator();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var5 = var2.getSubPremiseLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    geo.google.GeoException var1 = new geo.google.GeoException("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    var0.setDependentThoroughfaresIndicator("hi!");
    var0.setDependentThoroughfaresType("");
    java.util.List var8 = var0.getThoroughfareNumberPrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    var4.setContent("hi!");
    var4.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var3 = var2.getCode();
    java.util.Map var4 = var2.getOtherAttributes();
    var2.setType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var4 = var0.createSubPremiseTypeSubPremiseNumber();
    var4.setContent("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    org.xml.sax.InputSource var1 = geo.google.utils.XmlUtils.stringToInputSource("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getCode();
    var5.setThoroughfareTrailingType(var6);
    var0.setDependentThoroughfare(var5);
    var0.setDependentThoroughfaresType("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var13.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var15 = var13.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var16 = var13.createThoroughfareLeadingTypeType();
    java.lang.String var17 = var16.getType();
    var0.setThoroughfareLeadingType(var16);
    java.lang.String var19 = var0.getDependentThoroughfaresType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "geo.google.GeoException: "+ "'", var19.equals("geo.google.GeoException: "));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var7 = var0.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var8 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.getPostOffice();
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var5 = var0.getLocality();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    java.util.Map var2 = var1.getOtherAttributes();
    java.util.Map var3 = var1.getOtherAttributes();
    var1.setCode("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    java.lang.String var1 = var0.getType();
    var0.setIndicator("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var10 = var9.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var11 = var9.createDependentLocalityTypeDependentLocalityNumber();
    var11.setCode("G_GEO_UNKOWN_STATUS");
    var4.setDependentLocalityNumber(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var16 = var15.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var17 = var15.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var18 = var15.createDependentLocalityTypeDependentLocalityNumber();
    var18.setContent("");
    var18.setNameNumberOccurrence("");
    var18.setContent("hi!");
    var4.setDependentLocalityNumber(var18);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var26 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var27 = var26.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var28 = var26.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var29 = var26.createDependentLocalityTypeDependentLocalityNumber();
    var29.setContent("");
    var4.setDependentLocalityNumber(var29);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var33 = var4.getDependentLocalityNumber();
    var4.setConnector("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var3 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var4 = var0.createThoroughfareNameType();
    java.util.Map var5 = var4.getOtherAttributes();
    java.lang.String var6 = var4.getCode();
    
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
    assertNull(var6);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber();
    java.lang.String var1 = var0.getNameNumberOccurrence();
    java.util.Map var2 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var6 = var0.createPostalCodePostTownPostTownName();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getCode();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setType("");
    var2.setContent("geo.google.GeoException: ");
    var2.setCode("(default) Indicates to ignore an altitude specification");
    var2.setCode("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var5 = var4.getCode();
    java.lang.String var6 = var4.getCode();
    var0.setThoroughfareTrailingType(var4);
    java.util.List var8 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var10 = var9.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var11 = var9.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var12 = var9.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var13 = var9.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var14 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var15 = var14.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var16 = var14.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var18 = var17.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var19 = var17.createPostBoxPostBoxNumberExtension();
    var14.setPostBoxNumberExtension(var19);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var21 = var14.getPostBoxNumberExtension();
    java.util.List var22 = var14.getAny();
    var13.setPostBox(var14);
    var13.setType("");
    var0.setDependentLocality(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var27 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var28 = var27.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var29 = var27.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var30 = var27.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var31 = var27.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var32 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var33 = var32.getAddressLine();
    java.util.List var34 = var32.getAny();
    var31.setPostBox(var32);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var36 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var31.setPostBox(var36);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var38 = var31.getDependentLocalityNumber();
    var13.setDependentLocality(var31);
    java.util.List var40 = var13.getDependentLocalityName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setContent("");
    java.lang.String var4 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom();
    java.util.List var1 = var0.getPremiseNumberPrefix();
    java.util.List var2 = var0.getPremiseNumberPrefix();
    java.util.List var3 = var0.getPremiseNumberPrefix();
    java.util.List var4 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    var1.setRateLimitInterval(100L);
    java.lang.String var6 = var1.getApiKey();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var8 = var1.standardizeToGeoAddress("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setNumberSuffixSeparator("hi!");
    var3.setContent("geo.google.GeoException: ");
    java.lang.String var8 = var3.getNumberSuffixSeparator();
    var3.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName();
    java.util.Map var1 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    java.lang.String var3 = var2.getCode();
    var2.setContent("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.List var5 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var7 = var6.getContent();
    var0.setThoroughfarePreDirection(var6);
    java.lang.String var9 = var6.getType();
    java.util.Map var10 = var6.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    java.lang.String var4 = var3.getNumberSuffixSeparator();
    java.lang.String var5 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setType("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var4 = var0.getMailStopName();
    java.util.Map var5 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var2 = var1.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var1.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var4 = var1.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var5 = var1.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var6 = var1.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var7 = var1.createFirmType();
    var0.setFirm(var7);
    var0.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var11 = var0.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber();
    var0.setPostBoxNumber(var12);
    java.util.List var14 = var0.getAddressLine();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    var0.setAccuracy((java.lang.Integer)1);
    java.lang.String var4 = var0.getCode();
    java.lang.String var5 = var0.getValidFromDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var6 = var5.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var7 = var5.getAddressLines();
    var5.setUsage("");
    javax.xml.bind.JAXBElement var10 = var0.createAddressDetails(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var11 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var12 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var3 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var4 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var5 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var6 = var0.createPostOffice();
    java.util.List var7 = var6.getAddressLine();
    
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

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var3 = var0.createAddressDetailsCountry();
    java.util.List var4 = var3.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = var3.getThoroughfare();
    java.util.List var6 = var3.getCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var7 = var3.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var8 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var8.setThoroughfarePostDirection(var9);
    java.util.List var11 = var8.getThoroughfareNumberSuffix();
    var8.setDependentThoroughfaresIndicator("hi!");
    var8.setDependentThoroughfaresType("");
    var3.setThoroughfare(var8);
    java.util.List var17 = var3.getCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var18 = var3.getLocality();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    var3.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var6 = var3.getOtherAttributes();
    java.lang.String var7 = var3.getContent();
    java.util.Map var8 = var3.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var7.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var1.setPremiseLocation(var4);
    var1.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var9 = var8.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var10 = var8.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var11 = var8.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var12 = var8.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var13 = var8.createPremisePremiseNumberRange();
    java.lang.String var14 = var13.getSeparator();
    var1.setPremiseNumberRange(var13);
    java.lang.String var16 = var13.getSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var4 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var5 = var3.getPostOffice();
    var3.setUsageType("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var3 = var2.getCode();
    var2.setCode("hi!");
    var2.setCode("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getCode();
    var0.setCode("");
    java.lang.String var5 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ResponseType var2 = var0.createResponseType();
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    var5.setType("");
    java.lang.String var9 = var5.getType();
    java.util.Map var10 = var5.getOtherAttributes();
    
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getCode();
    var5.setThoroughfareTrailingType(var6);
    var0.setDependentThoroughfare(var5);
    var0.setDependentThoroughfaresType("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var13.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var15 = var13.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var16 = var13.createThoroughfareLeadingTypeType();
    java.lang.String var17 = var16.getType();
    var0.setThoroughfareLeadingType(var16);
    java.util.List var19 = var0.getThoroughfareName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getCurrentStatus();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    java.lang.String var4 = var0.getValidFromDate();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var5 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var1 = geo.google.mapping.MappingUtils.stringToCoordinate("");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var6 = var5.getAny();
    java.lang.String var7 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var8 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var5.setAddressLatitude(var8);
    var0.setAddressLatitude(var8);
    java.util.Map var11 = var8.getOtherAttributes();
    var8.setContent("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    var5.setIndicator("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var8 = var5.getPremiseNumberRangeFrom();
    java.lang.String var9 = var5.getRangeType();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var1 = var0.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var2 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var4 = var3.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var5 = var3.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var6 = var3.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var7 = var3.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var8 = var3.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var9 = var3.createFirmType();
    var2.setFirm(var9);
    var2.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var13 = var2.getPostalCode();
    java.lang.String var14 = var2.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var15 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var17 = var16.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var18 = var16.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var19 = var16.createPostalCode();
    var15.setPostalCode(var19);
    var2.setPostalCode(var19);
    var0.setPostalCode(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.valueOf("UNKNOWN_LOCATION");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    com.google.earth.kml._2.AltitudeModeType[] var0 = com.google.earth.kml._2.AltitudeModeType.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var3 = var2.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var2.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var5 = var4.getCode();
    java.util.Map var6 = var4.getOtherAttributes();
    var4.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var11 = var10.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var13 = var12.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var12.createAddressDetailsPostalServiceElementsSortingCode();
    var10.setSortingCode(var14);
    var0.setSortingCode(var14);
    java.util.List var17 = var0.getAny();
    java.lang.String var18 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var19 = var0.getKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var20 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var21 = var20.getOtherAttributes();
    var20.setCode("");
    var20.setCode("");
    var20.setCode("(default) Indicates to ignore an altitude specification");
    var0.setAddressLongitude(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var1.getMailStop();
    var1.setPremiseDependencyType("");
    java.lang.String var8 = var1.getPremiseDependency();
    java.util.List var9 = var1.getSubPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var10 = var1.getPremiseLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getContent();
    var0.setType("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    var2.setApiKey("Uknown Status");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var6 = var2.standardizeToGeoUsAddress("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var6 = var0.createBuildingNameType();
    var6.setContent("(default) Indicates to ignore an altitude specification");
    java.lang.String var9 = var6.getType();
    java.lang.String var10 = var6.getContent();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var10.equals("(default) Indicates to ignore an altitude specification"));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    java.lang.Class var12 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    java.util.Map var7 = var6.getOtherAttributes();
    java.util.Map var8 = var6.getOtherAttributes();
    java.lang.String var9 = var6.getNameNumberSeparator();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix();
    java.lang.String var1 = var0.getCode();
    var0.setCode("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var4 = var0.createSubPremiseTypeSubPremiseName();
    var4.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var7 = var4.getType();
    var4.setCode("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var7.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    var5.setCode("");
    java.lang.String var8 = var5.getCode();
    java.util.Map var9 = var5.getOtherAttributes();
    var5.setType("geo.google.GeoException: ");
    
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
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    java.lang.String var1 = var0.getContent();
    var0.setContent("(default) Indicates to ignore an altitude specification");
    var0.setContent("");
    java.lang.String var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    java.util.List var3 = var1.getAny();
    var1.setType("");
    var1.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var8 = var1.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var10 = var9.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var11 = var9.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var9.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var13 = var9.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var14 = var9.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var15 = var9.createFirmType();
    var1.setFirm(var15);
    java.lang.String var17 = var1.getPremiseThoroughfareConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var18 = var1.getPremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var19 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var20 = var19.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var21 = var19.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var22 = var19.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var23 = var19.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var24 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var25 = var24.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var26 = var24.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var27 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var28 = var27.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var29 = var27.createPostBoxPostBoxNumberExtension();
    var24.setPostBoxNumberExtension(var29);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var31 = var24.getPostBoxNumberExtension();
    java.util.List var32 = var24.getAny();
    var23.setPostBox(var24);
    var23.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var36 = var23.getDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var37 = var23.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var38 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var39 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var40 = var39.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var41 = var39.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var42 = var39.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var43 = var39.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var44 = var39.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var45 = var39.createFirmType();
    var38.setFirm(var45);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var47 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var48 = var47.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var49 = var47.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var50 = var47.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var51 = var47.createThoroughfare();
    java.util.List var52 = var51.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var53 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var54 = var53.getPostTown();
    var51.setPostalCode(var53);
    var45.setPostalCode(var53);
    var23.setPostalCode(var53);
    var1.setPostalCode(var53);
    java.util.List var59 = var53.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertTrue("'" + var17 + "' != '" + "geo.google.GeoException: "+ "'", var17.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var6 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom();
    java.util.List var7 = var6.getPremiseNumberPrefix();
    java.util.List var8 = var6.getAddressLine();
    java.util.List var9 = var6.getAddressLine();
    var5.setPremiseNumberRangeFrom(var6);
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var11 = var5.getPremiseNumberRangeFrom();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    java.lang.String var2 = var1.getType();
    java.lang.String var3 = var1.getType();
    var1.setType("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.getSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var6 = var5.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var7 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var8 = var7.getOtherAttributes();
    var5.setAddressLongitude(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var11 = var10.getAny();
    java.lang.String var12 = var10.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var13 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var10.setAddressLatitude(var13);
    var5.setAddressLatitude(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var17 = var16.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var18 = var16.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var19 = var16.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var20 = var16.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var21 = var16.createAddressDetailsPostalServiceElementsBarcode();
    var21.setType("G_GEO_UNKOWN_STATUS");
    var5.setBarcode(var21);
    var3.setBarcode(var21);
    java.lang.String var26 = var3.getType();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
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
    assertNull(var26);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    geo.google.mapping.FunctionChain var3 = new geo.google.mapping.FunctionChain(var2);
    geo.google.mapping.FunctionChain var4 = var3.getTail();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAddressLine();
    geo.google.mapping.FunctionChain var8 = new geo.google.mapping.FunctionChain(var7);
    var3.setTail(var8);
    geo.google.mapping.XmlToUsAddressFunctor var10 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    var3.setHead((geo.google.mapping.Functor)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var10.execute("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.getSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var6 = var5.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var7 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var8 = var7.getOtherAttributes();
    var5.setAddressLongitude(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var11 = var10.getAny();
    java.lang.String var12 = var10.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var13 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var10.setAddressLatitude(var13);
    var5.setAddressLatitude(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var17 = var16.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var18 = var16.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var19 = var16.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var20 = var16.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var21 = var16.createAddressDetailsPostalServiceElementsBarcode();
    var21.setType("G_GEO_UNKOWN_STATUS");
    var5.setBarcode(var21);
    var3.setBarcode(var21);
    java.lang.String var26 = var21.getType();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
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
    assertTrue("'" + var26 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var26.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var9 = var0.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = var0.getPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var11 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var11.setThoroughfarePostDirection(var12);
    java.lang.String var14 = var11.getDependentThoroughfares();
    var0.setThoroughfare(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var16 = var0.getPostalServiceElements();
    var0.setValidFromDate("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var19 = var0.getAddressType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var4 = var0.createSubPremiseTypeSubPremiseName();
    var4.setCode("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var2 = var1.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var3 = var1.createPostOffice();
    java.util.List var4 = var3.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var5 = var3.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var6 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var7 = var6.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var8 = var6.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var10 = var9.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var11 = var9.createPostBoxPostBoxNumberExtension();
    var6.setPostBoxNumberExtension(var11);
    var3.setPostBox(var6);
    var0.setPostOffice(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var15 = var0.getLocality();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setCode("");
    var0.setNumberOccurrence("hi!");
    var0.setIndicatorOccurrence("");
    var0.setIndicatorOccurrence("Uknown Status");
    java.lang.String var9 = var0.getIndicatorOccurrence();
    var0.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Uknown Status"+ "'", var9.equals("Uknown Status"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    java.util.List var1 = var0.getDepartmentName();
    java.util.List var2 = var0.getDepartmentName();
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.valueOf("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    java.lang.String var7 = var6.getContent();
    java.util.Map var8 = var6.getOtherAttributes();
    java.lang.String var9 = var6.getNameNumberSeparator();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.getStatusCode(10);
    int var2 = var1.ordinal();
    java.lang.String var3 = var1.getCodeName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var3.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var2.getMailStop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var3 = var1.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var4 = var3.getCode();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var9 = var0.getAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var10 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var12 = var11.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var13 = var11.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var14 = var11.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var15 = var11.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    var0.setEndorsementLineCode(var15);
    java.lang.String var17 = var15.getCode();
    java.lang.String var18 = var15.getCode();
    var15.setContent("hi!");
    java.lang.String var21 = var15.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    geo.google.mapping.FunctionChain var3 = new geo.google.mapping.FunctionChain(var2);
    geo.google.mapping.FunctionChain var4 = var3.getTail();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAddressLine();
    geo.google.mapping.FunctionChain var8 = new geo.google.mapping.FunctionChain(var7);
    var3.setTail(var8);
    geo.google.mapping.XmlToUsAddressFunctor var10 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    var3.setHead((geo.google.mapping.Functor)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var10.execute("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    java.lang.String var3 = var2.getCode();
    java.lang.String var4 = var2.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var4 = var3.getType();
    java.util.List var5 = var3.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var7 = var6.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var8 = var6.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var9 = var6.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var10 = var6.createThoroughfare();
    java.util.List var11 = var10.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var13 = var12.getPostTown();
    var10.setPostalCode(var12);
    var3.setPostalCode(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var16 = var3.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var17 = var3.getLocality();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    java.lang.String var7 = var6.getCode();
    
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
    assertNull(var7);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var2.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var5 = var4.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var4.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var7 = var4.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var8 = var4.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var9 = var4.createLargeMailUserTypeLargeMailUserIdentifier();
    var2.setLargeMailUserIdentifier(var9);
    java.lang.String var11 = var2.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var12.setIndicator("G_GEO_UNKOWN_STATUS");
    var2.setPostBox(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var17 = var16.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var18 = var16.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var19 = var16.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var20 = var16.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var21 = var16.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var22 = var16.createFirmType();
    var12.setFirm(var22);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var24 = var22.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var25 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var22.setMailStop(var25);
    java.util.List var27 = var25.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var28 = var25.getMailStopName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setCode("");
    var0.setNumberOccurrence("Uknown Status");
    var0.setCode("");
    var0.setIndicator("geo.google.GeoException: hi!");

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    geo.google.mapping.FunctionChain var3 = new geo.google.mapping.FunctionChain(var2);
    geo.google.mapping.FunctionChain var4 = var3.getTail();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAddressLine();
    geo.google.mapping.FunctionChain var8 = new geo.google.mapping.FunctionChain(var7);
    var3.setTail(var8);
    geo.google.mapping.XmlToUsAddressFunctor var10 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    var3.setHead((geo.google.mapping.Functor)var10);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var12 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var12.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var15 = var12.getThoroughfareNumberFrom();
    var12.setSeparator("");
    var12.setCode("Uknown Status");
    var12.setIndicatorOccurrence("(default) Indicates to ignore an altitude specification");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var3.execute((java.lang.Object)"(default) Indicates to ignore an altitude specification");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var3 = var0.createPostalCode();
    java.util.List var4 = var3.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.fromValue("geo.google.GeoException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var5 = var0.getCode();
    var0.setCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var1.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    geo.google.mapping.PointToCoordinateFunctor var0 = geo.google.mapping.PointToCoordinateFunctor.getInstance();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var1.createPremise();
    java.util.List var3 = var2.getAddressLine();
    geo.google.mapping.FunctionChain var4 = new geo.google.mapping.FunctionChain(var3);
    geo.google.mapping.FunctionChain var5 = new geo.google.mapping.FunctionChain((geo.google.mapping.Functor)var0, var4);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.util.List var8 = var7.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var10 = var9.createPremise();
    var7.setPremise(var10);
    var10.setPremiseThoroughfareConnector("hi!");
    java.util.List var14 = var10.getPremiseName();
    geo.google.mapping.FunctionChain var15 = new geo.google.mapping.FunctionChain(var14);
    var5.setTail(var15);
    geo.google.mapping.FunctionChain var17 = var15.getTail();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var2 = var1.getCode();
    var0.setThoroughfarePreDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var4 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var6 = var5.getCode();
    java.lang.String var7 = var5.getCode();
    var4.setThoroughfareTrailingType(var5);
    java.util.List var9 = var4.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var11 = var10.getContent();
    var4.setThoroughfarePreDirection(var10);
    var0.setThoroughfarePreDirection(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var14 = var0.getThoroughfareTrailingType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    var7.setType("geo.google.GeoException: geo.google.GeoException: ");
    var7.setContent("G_GEO_UNKOWN_STATUS");
    
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

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var3.setContent("");
    var3.setNameNumberOccurrence("");
    var3.setContent("hi!");
    var3.setNameNumberOccurrence("");
    var3.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var14 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    var2.setCode("hi!");
    java.util.Map var5 = var2.getOtherAttributes();
    java.lang.String var6 = var2.getCode();
    var2.setContent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    var0.setIndicator("hi!");
    java.lang.String var3 = var0.getIndicator();
    java.lang.String var4 = var0.getIndicator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    var0.setNumberSuffixSeparator("G_GEO_UNKOWN_STATUS");
    var0.setNumberSuffixSeparator("hi!");
    java.lang.String var5 = var0.getCode();
    java.lang.String var6 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.util.List var4 = var3.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var6 = var5.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var7 = var5.createPostOffice();
    java.util.List var8 = var7.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var9 = var7.getPostOfficeNumber();
    var7.setType("G_GEO_UNKOWN_STATUS");
    java.util.List var12 = var7.getPostOfficeName();
    var3.setPostOffice(var7);
    java.util.List var14 = var7.getPostOfficeName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var16 = var15.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var17 = var15.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var18 = var15.createPostOfficePostOfficeNumber();
    var18.setContent("Uknown Status");
    var7.setPostOfficeNumber(var18);
    java.util.Map var22 = var7.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    com.google.earth.kml._2.StatusType var0 = new com.google.earth.kml._2.StatusType();
    int var1 = var0.getCode();
    var0.setRequest("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    geo.google.datamodel.GeoStatusCode var3 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var4 = new geo.google.GeoException("", var3);
    geo.google.GeoException var5 = new geo.google.GeoException("geo.google.GeoException: ", var3);
    java.lang.String var6 = var3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Uknown Status"+ "'", var6.equals("Uknown Status"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    java.lang.String var3 = var1.getContent();
    java.util.Map var4 = var1.getOtherAttributes();
    java.lang.String var5 = var1.getCode();
    java.lang.String var6 = var1.getContent();
    var1.setNumberSuffixSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var8 = var0.createPostalCodePostTown();
    java.lang.String var9 = var8.getType();
    java.util.Map var10 = var8.getOtherAttributes();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var1 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var0.setMailStopName(var1);
    var1.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var5 = var1.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAny();
    var6.setType("");
    var1.setPremise(var6);
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var11 = var1.getPremiseNumberRange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getCode();
    java.lang.String var4 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    geo.google.mapping.PointToCoordinateFunctor var0 = geo.google.mapping.PointToCoordinateFunctor.getInstance();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var1.createPremise();
    java.util.List var3 = var2.getAddressLine();
    geo.google.mapping.FunctionChain var4 = new geo.google.mapping.FunctionChain(var3);
    geo.google.mapping.FunctionChain var5 = new geo.google.mapping.FunctionChain((geo.google.mapping.Functor)var0, var4);
    geo.google.mapping.Functor var6 = var5.getHead();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.execute((java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var4 = var2.standardizeToGeoUsAddress("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getIndicator();
    var0.setContent("hi!");
    var0.setContent("UNKNOWN_LOCATION");
    var0.setIndicator("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.getSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var4 = var0.getPostalCode();
    java.lang.String var5 = var0.getUsageType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType();
    java.util.List var1 = var0.getAddressLine();
    java.util.List var2 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var3 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var4 = var3.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var5 = var3.getPostalCode();
    var0.setPostBox(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var7 = var3.getPostBoxNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var9 = var8.createPremise();
    java.util.List var10 = var9.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var12 = var11.createPremise();
    var9.setPremise(var12);
    java.util.List var14 = var9.getPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var15 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var15.setThoroughfarePostDirection(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var18 = var15.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var19 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var20 = var19.getCode();
    java.lang.String var21 = var19.getCode();
    var15.setThoroughfareTrailingType(var19);
    java.util.List var23 = var15.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var24 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var25 = var24.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var26 = var24.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var27 = var24.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var28 = var24.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var29 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var30 = var29.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var31 = var29.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var32 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var33 = var32.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var34 = var32.createPostBoxPostBoxNumberExtension();
    var29.setPostBoxNumberExtension(var34);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var36 = var29.getPostBoxNumberExtension();
    java.util.List var37 = var29.getAny();
    var28.setPostBox(var29);
    var28.setType("");
    var15.setDependentLocality(var28);
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var42 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var43 = var42.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var44 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var45 = var44.createPremise();
    java.util.List var46 = var45.getAddressLine();
    java.util.List var47 = var45.getAny();
    var45.setType("");
    var45.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var52 = var45.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var53 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var54 = var53.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var55 = var53.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var56 = var53.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var57 = var53.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var58 = var53.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var59 = var53.createFirmType();
    var45.setFirm(var59);
    java.util.List var61 = var59.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var62 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var63 = var62.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var64 = var62.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var65 = var62.createPostalCode();
    var59.setPostalCode(var65);
    java.util.List var67 = var65.getAddressLine();
    var42.setPostalCode(var65);
    var28.setPostalCode(var65);
    var9.setPostalCode(var65);
    var3.setPostalCode(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    java.util.List var5 = var0.getSubPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.util.List var8 = var7.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var9 = var7.getFirm();
    var7.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var12.createPremise();
    java.lang.String var14 = var13.getPremiseThoroughfareConnector();
    var7.setPremise(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var17 = var16.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var18 = var16.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var19 = var16.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var20 = var19.getType();
    java.util.List var21 = var19.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var23 = var22.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var24 = var22.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var25 = var22.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var26 = var22.createThoroughfare();
    java.util.List var27 = var26.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var28 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var29 = var28.getPostTown();
    var26.setPostalCode(var28);
    var19.setPostalCode(var28);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var32 = var19.getPostalCode();
    var7.setPostalCode(var32);
    var0.setPostalCode(var32);
    java.util.List var35 = var32.getAny();
    java.util.List var36 = var32.getPostalCodeNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var1 = var0.getContent();
    var0.setCode("");
    java.lang.String var4 = var0.getType();
    var0.setType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var4 = var0.createSubPremiseTypeSubPremiseNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = var0.createPostBox();
    java.lang.String var6 = var5.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var8 = var7.createPremise();
    java.util.List var9 = var8.getAddressLine();
    java.util.List var10 = var8.getAny();
    var8.setType("");
    var8.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var15 = var8.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var17 = var16.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var18 = var16.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var19 = var16.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var20 = var16.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var21 = var16.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var22 = var16.createFirmType();
    var8.setFirm(var22);
    java.util.List var24 = var22.getAddressLine();
    var22.setType("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var5.setFirm(var22);
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var3 = var1.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var4 = var3.getCode();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var9 = var0.getAddressLatitude();
    java.lang.String var10 = var0.getType();
    java.util.Map var11 = var0.getOtherAttributes();
    java.util.Map var12 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    java.util.Map var7 = var6.getOtherAttributes();
    java.lang.String var8 = var6.getContent();
    java.lang.String var9 = var6.getType();
    var6.setCode("(default) Indicates to ignore an altitude specification");
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    geo.google.mapping.XmlToAddressFunctor var0 = geo.google.mapping.XmlToAddressFunctor.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = var0.execute("geo.google.GeoException: geo.google.GeoException: ");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var5 = var4.getCode();
    java.lang.String var6 = var4.getCode();
    var0.setThoroughfareTrailingType(var4);
    java.util.List var8 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var10 = var9.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var11 = var9.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var12 = var9.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var13 = var9.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var14 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var15 = var14.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var16 = var14.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var18 = var17.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var19 = var17.createPostBoxPostBoxNumberExtension();
    var14.setPostBoxNumberExtension(var19);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var21 = var14.getPostBoxNumberExtension();
    java.util.List var22 = var14.getAny();
    var13.setPostBox(var14);
    var13.setType("");
    var0.setDependentLocality(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var27 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var28 = var27.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var29 = var27.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var30 = var27.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var31 = var27.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var32 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var33 = var32.getAddressLine();
    java.util.List var34 = var32.getAny();
    var31.setPostBox(var32);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var36 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var31.setPostBox(var36);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var38 = var31.getDependentLocalityNumber();
    var13.setDependentLocality(var31);
    var31.setUsageType("G_GEO_UNKOWN_STATUS");
    java.lang.String var42 = var31.getUsageType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var43 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var44 = var43.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var45 = var43.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var46 = var43.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var47 = var43.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var48 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var49 = var48.getAddressLine();
    java.util.List var50 = var48.getAny();
    var47.setPostBox(var48);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var52 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var53 = var52.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var54 = var52.createDependentLocalityTypeDependentLocalityNumber();
    var54.setCode("G_GEO_UNKOWN_STATUS");
    var47.setDependentLocalityNumber(var54);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var58 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var59 = var58.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var60 = var58.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var61 = var58.createDependentLocalityTypeDependentLocalityNumber();
    var61.setContent("");
    var61.setNameNumberOccurrence("");
    var61.setContent("hi!");
    var47.setDependentLocalityNumber(var61);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var69 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var70 = var69.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var71 = var69.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var72 = var69.createDependentLocalityTypeDependentLocalityNumber();
    var72.setContent("");
    var47.setDependentLocalityNumber(var72);
    var31.setDependentLocalityNumber(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var42.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    java.lang.String var1 = var0.getCode();
    var0.setContent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    var0.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var4 = var3.getValidToDate();
    var3.setAddressDetailsKey("hi!");
    var0.setAddressDetails(var3);
    java.lang.String var8 = var3.getAddressDetailsKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    java.lang.String var6 = var5.getType();
    var5.setType("UNKNOWN_LOCATION");
    
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
    assertNull(var6);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var4 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var5 = var4.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var6 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var7 = var6.getOtherAttributes();
    var4.setAddressLongitude(var6);
    java.lang.String var9 = var6.getCode();
    var3.setAddressLongitude(var6);
    var6.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var3 = var1.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var4 = var3.getCode();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var3);
    java.util.Map var9 = var3.getOtherAttributes();
    var3.setCode("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    var1.setRateLimitInterval(100L);
    java.lang.String var6 = var1.getApiKey();
    var1.setApiKey("(default) Indicates to ignore an altitude specification");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var1.standardizeToGeoUsAddresses("geo.google.GeoException: hi!");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var3 = var0.getBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var4 = var0.getKeyLineCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    var1.setPremise(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var4.getPostalCode();
    var4.setPremiseDependency("G_GEO_UNKOWN_STATUS");
    java.util.List var9 = var4.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var6 = var0.createLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.getPremise();
    var6.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var11 = var10.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var12 = var10.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var13 = var12.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var16 = var14.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var17 = var14.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var18 = var14.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var19 = var14.createLargeMailUserTypeLargeMailUserIdentifier();
    var12.setLargeMailUserIdentifier(var19);
    java.lang.String var21 = var12.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var22 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var22.setIndicator("G_GEO_UNKOWN_STATUS");
    var12.setPostBox(var22);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var26 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var27 = var26.getAddressLine();
    var12.setPostBox(var26);
    var6.setLargeMailUser(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var30 = var6.getPostalCode();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var6 = var5.getAny();
    java.lang.String var7 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var8 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var5.setAddressLatitude(var8);
    var0.setAddressLatitude(var8);
    java.util.Map var11 = var8.getOtherAttributes();
    var8.setType("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var9 = var4.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var10 = var4.getDependentLocalityNumber();
    var4.setUsageType("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var13 = var4.getDependentLocalityNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var4.setThoroughfarePostDirection(var5);
    java.util.List var7 = var4.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var8 = var4.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var9 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var11 = var10.getCode();
    java.lang.String var12 = var10.getCode();
    var9.setThoroughfareTrailingType(var10);
    var4.setDependentThoroughfare(var9);
    var3.setDependentThoroughfare(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var17 = var16.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var18 = var16.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var19 = var16.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var20 = var16.createThoroughfareLeadingTypeType();
    var9.setThoroughfareLeadingType(var20);
    var20.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix();
    var0.setCode("hi!");
    var0.setCode("Uknown Status");
    java.lang.String var5 = var0.getContent();
    var0.setContent("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    var2.setCode("hi!");
    java.lang.String var5 = var2.getScheme();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType();
    java.util.List var1 = var0.getAddressLine();
    java.util.List var2 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var3 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var4 = var3.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var5 = var3.getPostalCode();
    var0.setPostBox(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var7 = var0.getPostalRouteNumber();
    java.util.Map var8 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    java.lang.String var4 = var2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    java.util.List var5 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var7 = var6.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var8 = var6.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var9 = var6.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var10 = var6.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var11 = var10.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var10.getDependentLocalityNumber();
    var0.setDependentLocality(var10);
    java.lang.String var14 = var0.getType();
    java.util.List var15 = var0.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    var2.setApiKey("Uknown Status");
    org.apache.commons.httpclient.params.HttpClientParams var5 = var2.getHttpClientParams();
    geo.google.datamodel.GeoCoordinate var20 = new geo.google.datamodel.GeoCoordinate();
    double var21 = var20.getLongitude();
    geo.google.datamodel.GeoCoordinate var22 = new geo.google.datamodel.GeoCoordinate();
    double var23 = var22.getLongitude();
    double var24 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var20, var22);
    double var25 = var22.getLatitude();
    var22.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var29 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var30 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var22, var29);
    geo.google.datamodel.GeoAddressAccuracy var32 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var33 = var32.getName();
    geo.google.datamodel.GeoUsAddress var34 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var22, var32);
    var34.setPostalCode("(default) Indicates to ignore an altitude specification");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var37 = var2.standardizeToGeoAddresses(var34);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "UNKNOWN_LOCATION"+ "'", var33.equals("UNKNOWN_LOCATION"));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    java.lang.String var4 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var3.setPostalRouteNumber(var5);
    var5.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var9 = var5.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var9.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix();
    java.lang.String var1 = var0.getNumberPrefixSeparator();
    var0.setNumberPrefixSeparator("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var3 = var0.getType();
    var0.setCode("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setType("");
    var2.setContent("geo.google.GeoException: ");
    var2.setType("Uknown Status");
    java.lang.String var9 = var2.getTypeOccurrence();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var1 = var0.getType();
    var0.setCode("hi!");
    java.lang.String var4 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    java.lang.String var6 = var5.getScheme();
    
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
    assertNull(var6);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var2 = var0.createPostBoxPostBoxNumberPrefix();
    java.lang.String var3 = var2.getContent();
    java.lang.String var4 = var2.getContent();
    java.lang.String var5 = var2.getNumberPrefixSeparator();
    var2.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var2.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var8.equals("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var4 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var5 = var4.getAddressLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    geo.google.GeoException var3 = new geo.google.GeoException("hi!");
    geo.google.datamodel.GeoStatusCode var6 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var7 = new geo.google.GeoException("", var6);
    java.lang.String var8 = var7.toString();
    geo.google.datamodel.GeoStatusCode var12 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var13 = new geo.google.GeoException("", var12);
    geo.google.datamodel.GeoStatusCode var16 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var17 = new geo.google.GeoException("", var16);
    geo.google.GeoException var18 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var13, var16);
    var7.addSuppressed((java.lang.Throwable)var18);
    var3.addSuppressed((java.lang.Throwable)var7);
    geo.google.datamodel.GeoStatusCode var24 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var25 = new geo.google.GeoException("", var24);
    java.lang.String var26 = var25.toString();
    geo.google.datamodel.GeoStatusCode var30 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var31 = new geo.google.GeoException("", var30);
    geo.google.datamodel.GeoStatusCode var34 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var35 = new geo.google.GeoException("", var34);
    geo.google.GeoException var36 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var31, var34);
    var25.addSuppressed((java.lang.Throwable)var36);
    geo.google.datamodel.GeoStatusCode var39 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var41 = var39.equals((java.lang.Object)10L);
    java.lang.String var42 = var39.name();
    int var43 = var39.getCode();
    geo.google.GeoException var44 = new geo.google.GeoException("", (java.lang.Throwable)var25, var39);
    java.lang.String var45 = var39.getDescription();
    geo.google.GeoException var46 = new geo.google.GeoException("Uknown Status", (java.lang.Throwable)var3, var39);
    geo.google.GeoException var47 = new geo.google.GeoException("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (java.lang.Throwable)var3);
    java.lang.String var48 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "geo.google.GeoException: "+ "'", var8.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "geo.google.GeoException: "+ "'", var26.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var42.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Uknown Status"+ "'", var45.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "geo.google.GeoException: hi!"+ "'", var48.equals("geo.google.GeoException: hi!"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var3 = var0.getType();
    java.util.Map var4 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var3.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var7 = var0.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var0.createAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType();
    var8.setAddressLines(var9);
    
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
    assertNotNull(var8);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    java.util.List var3 = var1.getBuildingName();
    java.lang.String var4 = var1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var3.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var6 = var3.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var7 = var3.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var8 = var7.getIndicator();
    var2.setLargeMailUserIdentifier(var7);
    java.lang.String var10 = var7.getType();
    var7.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var13 = var7.getType();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var2 = var0.createPostBoxPostBoxNumberPrefix();
    java.lang.String var3 = var2.getNumberPrefixSeparator();
    var2.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var6 = var2.getContent();
    var2.setNumberPrefixSeparator("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var6 = var5.getAny();
    java.lang.String var7 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var8 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var5.setAddressLatitude(var8);
    var0.setAddressLatitude(var8);
    java.lang.String var11 = var8.getCode();
    var8.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var14 = var8.getType();
    java.lang.String var15 = var8.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var14.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var15.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getCode();
    var5.setThoroughfareTrailingType(var6);
    var0.setDependentThoroughfare(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var11 = var5.getThoroughfareLeadingType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber();
    var0.setNumberTypeOccurrence("hi!");
    var0.setIndicator("geo.google.GeoException: ");
    java.lang.String var5 = var0.getType();
    var0.setCode("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.GeoException: hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var1.standardizeToGeoAddresses("Uknown Status");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var1 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var1.getPostOffice();
    java.lang.String var3 = var1.getType();
    java.lang.String var4 = var1.getIndicator();
    var0.setAdministrativeArea(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var6 = var1.getSubAdministrativeArea();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("");
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    geo.google.datamodel.GeoCoordinate var11 = new geo.google.datamodel.GeoCoordinate();
    double var12 = var11.getLongitude();
    double var13 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var9, var11);
    double var14 = var11.getLatitude();
    var11.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var18 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var19 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var11, var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var20 = var1.standardizeToGeoAddress(var19);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var3 = var0.createPostOfficePostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var4 = var0.createThoroughfareNumber();
    java.lang.String var5 = var4.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    geo.google.datamodel.GeoAltitude var13 = new geo.google.datamodel.GeoAltitude(0.0d);
    var0.setAltitude(var13);
    java.lang.String var15 = var13.toString();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var17 = var16.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var18 = var16.createMailStopTypeMailStopName();
    boolean var19 = var13.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    var1.setRateLimitInterval(100L);
    java.lang.String var6 = var1.getApiKey();
    var1.setApiKey("(default) Indicates to ignore an altitude specification");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var10 = var1.standardizeToGeoAddress("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    java.lang.String var1 = var0.getIndicator();
    java.util.List var2 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var2 = var0.createAdministrativeAreaAdministrativeAreaName();
    java.lang.String var3 = var2.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    org.xml.sax.InputSource var1 = geo.google.utils.XmlUtils.stringToInputSource("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode((-1));
    int var2 = var1.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var5 = var4.getCode();
    java.lang.String var6 = var4.getCode();
    var0.setThoroughfareTrailingType(var4);
    java.util.List var8 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var10 = var9.getCode();
    java.lang.String var11 = var9.getCode();
    var0.setThoroughfareTrailingType(var9);
    var9.setContent("hi!");
    java.lang.String var15 = var9.getType();
    java.util.Map var16 = var9.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var1 = var0.getPostalRoute();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    var5.setType("");
    java.lang.String var9 = var5.getType();
    java.lang.String var10 = var5.getContent();
    java.lang.String var11 = var5.getCode();
    
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setNumberSuffixSeparator("hi!");
    java.lang.String var6 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var4 = var0.createCountryName();
    java.lang.String var5 = var4.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    java.lang.String var4 = var3.getType();
    java.lang.String var5 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var6 = var3.getPostBox();
    java.util.List var7 = var3.getAny();
    java.lang.String var8 = var3.getType();
    java.lang.String var9 = var3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    java.util.List var5 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    var0.setDependentThoroughfaresConnector("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    long var4 = var1.getRateLimitInterval();
    geo.google.datamodel.GeoCoordinate var19 = new geo.google.datamodel.GeoCoordinate();
    double var20 = var19.getLongitude();
    geo.google.datamodel.GeoCoordinate var21 = new geo.google.datamodel.GeoCoordinate();
    double var22 = var21.getLongitude();
    double var23 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var19, var21);
    double var24 = var21.getLatitude();
    var21.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var28 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var29 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var21, var28);
    geo.google.datamodel.GeoAddressAccuracy var31 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var32 = var31.getName();
    geo.google.datamodel.GeoUsAddress var33 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var21, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var34 = var1.standardizeToGeoAddress(var33);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5769L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "UNKNOWN_LOCATION"+ "'", var32.equals("UNKNOWN_LOCATION"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    var0.setDependentThoroughfaresIndicator("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var6 = var0.getThoroughfareTrailingType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setContent("geo.google.GeoException: ");
    var0.setIndicatorOccurrence("");
    java.lang.String var5 = var0.getType();
    var0.setIndicator("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setRangeType("");
    java.lang.String var7 = var0.getRangeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var8 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo();
    java.util.List var9 = var8.getContent();
    java.util.Map var10 = var8.getOtherAttributes();
    var0.setThoroughfareNumberTo(var8);
    java.lang.String var12 = var0.getSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    var2.setContent("geo.google.GeoException: ");
    java.lang.String var5 = var2.getType();
    var2.setNumberPrefixSeparator("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.util.List var4 = var3.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var6 = var5.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var7 = var5.createPostOffice();
    java.util.List var8 = var7.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var9 = var7.getPostOfficeNumber();
    var7.setType("G_GEO_UNKOWN_STATUS");
    java.util.List var12 = var7.getPostOfficeName();
    var3.setPostOffice(var7);
    java.util.List var14 = var7.getPostOfficeName();
    java.util.List var15 = var7.getAddressLine();
    java.util.Map var16 = var7.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var1 = geo.google.mapping.MappingUtils.stringToCoordinate("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var2 = var1.getCode();
    var0.setThoroughfarePreDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var4 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var6 = var5.getCode();
    java.lang.String var7 = var5.getCode();
    var4.setThoroughfareTrailingType(var5);
    java.util.List var9 = var4.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var11 = var10.getContent();
    var4.setThoroughfarePreDirection(var10);
    var0.setThoroughfarePreDirection(var10);
    java.lang.String var14 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var4.getThoroughfarePreDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var7 = var4.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var8 = var4.getPremise();
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var6 = var0.createPostalCodePostalCodeNumber();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setCode("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var10 = var6.getContent();
    var6.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.util.Map var13 = var6.getOtherAttributes();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    java.util.List var5 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var7 = var6.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var8 = var6.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var9 = var6.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var10 = var6.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var11 = var10.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var10.getDependentLocalityNumber();
    var0.setDependentLocality(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = var14.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var16 = var14.createPostOffice();
    java.util.List var17 = var16.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var18 = var16.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var19 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var20 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var21 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var20.setThoroughfarePostDirection(var21);
    java.util.List var23 = var20.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var24 = var20.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var25 = var20.getPostalCode();
    var19.setThoroughfare(var20);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var27 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var28 = var27.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var29 = var27.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var30 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var31 = var30.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var32 = var30.createPostBoxPostBoxNumberExtension();
    var27.setPostBoxNumberExtension(var32);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var34 = var27.getPostBoxNumberExtension();
    java.util.List var35 = var27.getAny();
    var19.setPostBox(var27);
    var16.setPostBox(var27);
    var10.setPostOffice(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var39 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var40 = var39.getPostTown();
    java.util.Map var41 = var39.getOtherAttributes();
    java.util.List var42 = var39.getPostalCodeNumberExtension();
    var10.setPostalCode(var39);
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var44 = var10.getPostOffice();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var4 = var3.getIndicator();
    java.util.Map var5 = var3.getOtherAttributes();
    
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

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom();
    java.util.List var1 = var0.getPremiseNumberPrefix();
    java.util.List var2 = var0.getAddressLine();
    java.util.List var3 = var0.getAddressLine();
    java.util.List var4 = var0.getPremiseNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var1 = geo.google.mapping.MappingUtils.stringToCoordinate("geo.google.GeoException: hi!");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setType("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setContent("geo.google.GeoException: hi!");
    java.util.Map var6 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setCode("G_GEO_UNKOWN_STATUS");
    var2.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var8 = var2.getContent();
    var2.setCode("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    var3.setCode("geo.google.GeoException: ");
    java.lang.String var6 = var3.getType();
    java.util.Map var7 = var3.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    java.util.List var4 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    java.util.Map var6 = var5.getOtherAttributes();
    java.util.List var7 = var5.getThoroughfareName();
    var0.setDependentThoroughfare(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setCode("geo.google.GeoException: ");
    java.util.Map var6 = var0.getOtherAttributes();
    java.lang.String var7 = var0.getType();
    java.lang.String var8 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.getMailStop();
    var0.setType("");
    java.util.Map var4 = var0.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var0.getMailStop();
    var0.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var9 = var8.createPremise();
    java.util.List var10 = var9.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var11 = var9.getFirm();
    var9.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var15 = var14.createPremise();
    java.lang.String var16 = var15.getPremiseThoroughfareConnector();
    var9.setPremise(var15);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var19 = var18.createPremise();
    java.lang.String var20 = var19.getPremiseThoroughfareConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var21 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var19.setPremiseLocation(var21);
    var9.setPremiseLocation(var21);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var24 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var25 = var24.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var26 = var24.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var27 = var26.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var29 = var28.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var30 = var28.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var31 = var28.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var32 = var28.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var33 = var28.createLargeMailUserTypeLargeMailUserIdentifier();
    var26.setLargeMailUserIdentifier(var33);
    java.lang.String var35 = var26.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var36 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var36.setIndicator("G_GEO_UNKOWN_STATUS");
    var26.setPostBox(var36);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var40 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var41 = var40.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var42 = var40.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var43 = var40.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var44 = var40.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var45 = var40.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var46 = var40.createFirmType();
    var36.setFirm(var46);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var48 = var46.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var49 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var46.setMailStop(var49);
    java.util.List var51 = var49.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var52 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var53 = var52.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var54 = var52.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var55 = var52.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var56 = var52.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var57 = var52.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var58 = var52.createMailStopTypeMailStopNumber();
    var49.setMailStopNumber(var58);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var60 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var61 = var60.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var62 = var60.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var63 = var62.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var64 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var65 = var64.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var66 = var64.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var67 = var64.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var68 = var64.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var69 = var64.createLargeMailUserTypeLargeMailUserIdentifier();
    var62.setLargeMailUserIdentifier(var69);
    java.lang.String var71 = var62.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var72 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var72.setIndicator("G_GEO_UNKOWN_STATUS");
    var62.setPostBox(var72);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var76 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var77 = var76.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var78 = var76.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var79 = var76.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var80 = var76.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var81 = var76.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var82 = var76.createFirmType();
    var72.setFirm(var82);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var84 = var82.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var85 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var82.setMailStop(var85);
    java.lang.String var87 = var85.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var88 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    java.lang.String var89 = var88.getContent();
    var88.setContent("(default) Indicates to ignore an altitude specification");
    var85.setMailStopName(var88);
    java.util.Map var93 = var88.getOtherAttributes();
    var49.setMailStopName(var88);
    var9.setMailStop(var49);
    var0.setMailStop(var49);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var97 = var49.getMailStopNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    java.lang.String var6 = var5.getType();
    var5.setIndicator("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var6);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setCode("");
    var0.setNumberOccurrence("hi!");
    var0.setIndicatorOccurrence("");
    var0.setIndicatorOccurrence("Uknown Status");
    var0.setCode("");
    var0.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var4 = var0.createPremiseNumber();
    java.lang.String var5 = var4.getIndicator();
    var4.setNumberTypeOccurrence("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    var0.setType("UNKNOWN_LOCATION");
    java.lang.String var5 = var0.getContent();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var2.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var5 = var4.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var4.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var7 = var4.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var8 = var4.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var9 = var4.createLargeMailUserTypeLargeMailUserIdentifier();
    var2.setLargeMailUserIdentifier(var9);
    java.lang.String var11 = var2.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var12.setIndicator("G_GEO_UNKOWN_STATUS");
    var2.setPostBox(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var17 = var16.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var18 = var16.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var19 = var16.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var20 = var16.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var21 = var16.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var22 = var16.createFirmType();
    var12.setFirm(var22);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var24 = var22.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var25 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var22.setMailStop(var25);
    java.lang.String var27 = var25.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var28 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    java.lang.String var29 = var28.getContent();
    var28.setContent("(default) Indicates to ignore an altitude specification");
    var25.setMailStopName(var28);
    var28.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    var1.setPremise(var4);
    java.util.List var6 = var1.getPremiseNumberPrefix();
    java.util.List var7 = var1.getPremiseNumberSuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    geo.google.mapping.AddressToUsAddressFunctor var0 = new geo.google.mapping.AddressToUsAddressFunctor();
    geo.google.mapping.Functor[] var1 = new geo.google.mapping.Functor[] { var0};
    geo.google.mapping.FunctionChain var2 = new geo.google.mapping.FunctionChain(var1);
    geo.google.mapping.Functor var3 = var2.getHead();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = var2.getPostOfficeNumber();
    java.lang.String var5 = var2.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var2.getPostalCode();
    java.util.List var7 = var2.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var5 = var1.standardizeToGeoAddress("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var1.createPremise();
    java.util.List var3 = var2.getAddressLine();
    java.util.List var4 = var2.getAny();
    var2.setType("");
    var2.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var9 = var2.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var11 = var10.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var12 = var10.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var13 = var10.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var14 = var10.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var15 = var10.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var16 = var10.createFirmType();
    var2.setFirm(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var18 = var2.getMailStop();
    var2.setType("hi!");
    var0.setPremise(var2);
    java.lang.String var22 = var0.getUsageType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var1.getMailStop();
    var1.setPremiseDependencyType("");
    java.lang.String var8 = var1.getPremiseDependency();
    java.lang.String var9 = var1.getPremiseDependency();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var11 = var10.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var12 = var10.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var13 = var12.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var16 = var14.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var17 = var14.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var18 = var14.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var19 = var14.createLargeMailUserTypeLargeMailUserIdentifier();
    var12.setLargeMailUserIdentifier(var19);
    java.lang.String var21 = var12.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var22 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var22.setIndicator("G_GEO_UNKOWN_STATUS");
    var12.setPostBox(var22);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var26 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var27 = var26.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var28 = var26.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var29 = var26.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var30 = var26.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var31 = var26.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var32 = var26.createFirmType();
    var22.setFirm(var32);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var34 = var32.getPostalCode();
    var1.setFirm(var32);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var36 = var32.getMailStop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var7 = var0.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var0.createAddressDetails();
    java.lang.String var9 = var8.getCode();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var0.createLargeMailUserType();
    java.util.List var4 = var3.getBuildingName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var4.getThoroughfarePreDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    var4.setDependentThoroughfare(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    java.lang.String var10 = var9.getType();
    var9.setContent("G_GEO_UNKOWN_STATUS");
    var7.setThoroughfarePostDirection(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var14 = var7.getThoroughfareTrailingType();
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    var2.setApiKey("Uknown Status");
    geo.google.datamodel.GeoCoordinate var19 = new geo.google.datamodel.GeoCoordinate();
    double var20 = var19.getLongitude();
    geo.google.datamodel.GeoCoordinate var21 = new geo.google.datamodel.GeoCoordinate();
    double var22 = var21.getLongitude();
    double var23 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var19, var21);
    double var24 = var21.getLatitude();
    var21.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var28 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var29 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var21, var28);
    geo.google.datamodel.GeoAddressAccuracy var31 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var32 = var31.getName();
    geo.google.datamodel.GeoUsAddress var33 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var21, var31);
    var33.setState("");
    var33.setCountry("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var38 = var2.standardizeToGeoUsAddresses(var33);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "UNKNOWN_LOCATION"+ "'", var32.equals("UNKNOWN_LOCATION"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setType("");
    java.lang.String var6 = var3.getContent();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var3.setType("UNKNOWN_LOCATION");
    var3.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    java.util.Map var3 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var4 = var0.createAddressLine();
    java.lang.String var5 = var4.getContent();
    var4.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    java.util.Map var7 = var6.getOtherAttributes();
    java.util.Map var8 = var6.getOtherAttributes();
    java.lang.String var9 = var6.getCode();
    java.lang.String var10 = var6.getContent();
    java.lang.String var11 = var6.getType();
    var6.setCode("");
    java.lang.String var14 = var6.getCode();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    java.util.List var5 = var0.getSubPremiseNumberSuffix();
    java.util.Map var6 = var0.getOtherAttributes();
    var0.setType("(default) Indicates to ignore an altitude specification");
    java.util.List var9 = var0.getAddressLine();
    geo.google.mapping.FunctionChain var10 = new geo.google.mapping.FunctionChain(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var5);
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    boolean var11 = var0.equals((java.lang.Object)var9);
    java.lang.Class var12 = var9.getDeclaringClass();
    java.lang.String var13 = var9.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Uknown Status"+ "'", var13.equals("Uknown Status"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    var6.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var9 = var6.getOtherAttributes();
    java.lang.String var10 = var6.getContent();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var10.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    var3.setCode("geo.google.GeoException: ");
    var3.setCode("");
    java.lang.String var8 = var3.getContent();
    var3.setContent("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var6 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var7 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var8 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    var8.setCode("geo.google.GeoException: hi!");
    
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
    assertNotNull(var8);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    var5.setIndicator("G_GEO_UNKOWN_STATUS");
    var5.setNumberRangeOccurence("");
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var10 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo();
    java.util.List var11 = var10.getAddressLine();
    java.util.List var12 = var10.getPremiseNumberPrefix();
    var5.setPremiseNumberRangeTo(var10);
    java.util.List var14 = var10.getPremiseNumberSuffix();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var3 = var0.createThoroughfareNameType();
    java.util.Map var4 = var3.getOtherAttributes();
    
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

    if (debug) System.out.printf("%nRandoopTest0.test367");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var2 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var3 = var0.createFirmTypeFirmName();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var4 = var0.createBuildingNameType();
    java.lang.String var5 = var4.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var2 = var0.createPostBoxPostBoxNumberPrefix();
    java.lang.String var3 = var2.getContent();
    java.lang.String var4 = var2.getContent();
    java.lang.String var5 = var2.getNumberPrefixSeparator();
    var2.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var2.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var2.setCode("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var0.setAddressLatitude(var3);
    java.lang.String var5 = var3.getContent();
    var3.setContent("");
    java.lang.String var8 = var3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.lang.String var5 = var1.getCode();
    java.lang.String var6 = var1.getType();
    var1.setType("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var6 = var0.createDepartment();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var7 = var0.createBuildingNameType();
    java.lang.String var8 = var7.getContent();
    
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
    assertNull(var8);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setType("");
    var2.setContent("geo.google.GeoException: ");
    var2.setCode("(default) Indicates to ignore an altitude specification");
    var2.setType("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    var0.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var5 = var4.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var6 = var4.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var7 = var6.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var9 = var8.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var10 = var8.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var11 = var8.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var12 = var8.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var13 = var8.createLargeMailUserTypeLargeMailUserIdentifier();
    var6.setLargeMailUserIdentifier(var13);
    java.lang.String var15 = var6.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var16 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var16.setIndicator("G_GEO_UNKOWN_STATUS");
    var6.setPostBox(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var20 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var21 = var20.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var22 = var20.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var23 = var20.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var24 = var20.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var25 = var20.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var26 = var20.createFirmType();
    var16.setFirm(var26);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var28 = var26.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var29 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var26.setMailStop(var29);
    var0.setMailStop(var29);
    java.util.Map var32 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var7 = var6.getCode();
    java.lang.String var8 = var6.getCode();
    var5.setThoroughfareTrailingType(var6);
    var0.setDependentThoroughfare(var5);
    var0.setDependentThoroughfaresType("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var13.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var15 = var13.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var16 = var13.createThoroughfareLeadingTypeType();
    java.lang.String var17 = var16.getType();
    var0.setThoroughfareLeadingType(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var19 = var0.getDependentLocality();
    java.lang.String var20 = var0.getDependentThoroughfaresIndicator();
    java.util.List var21 = var0.getThoroughfareName();
    java.lang.String var22 = var0.getDependentThoroughfaresType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "geo.google.GeoException: "+ "'", var22.equals("geo.google.GeoException: "));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    java.util.Map var5 = var4.getOtherAttributes();
    var4.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var8 = var4.getOtherAttributes();
    java.lang.String var9 = var4.getCode();
    var4.setCode("hi!");
    java.lang.String var12 = var4.getCode();
    java.lang.String var13 = var4.getNumberSuffixSeparator();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    java.util.List var5 = var4.getAddressLine();
    geo.google.mapping.FunctionChain var6 = new geo.google.mapping.FunctionChain(var5);
    geo.google.mapping.FunctionChain var7 = var6.getTail();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var9 = var8.createPremise();
    java.util.List var10 = var9.getAddressLine();
    geo.google.mapping.FunctionChain var11 = new geo.google.mapping.FunctionChain(var10);
    var6.setTail(var11);
    geo.google.mapping.XmlToUsAddressFunctor var13 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    var6.setHead((geo.google.mapping.Functor)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var1.standardize("", (geo.google.mapping.XmlMappingFunctor)var13);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getContent();
    var0.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    var4.setConnector("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var12 = var11.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var13 = var11.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var14 = var11.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var15 = var11.createPostalRouteType();
    var4.setPostalRoute(var15);
    java.lang.String var17 = var4.getIndicator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var4 = var0.createSubPremiseTypeSubPremiseNumber();
    var4.setIndicator("hi!");
    var4.setNumberTypeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var9 = var4.getPremiseNumberSeparator();
    java.util.Map var10 = var4.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var6 = var0.createPostalCodePostalCodeNumber();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setCode("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var10 = var6.getContent();
    var6.setContent("(default) Indicates to ignore an altitude specification");
    java.lang.String var13 = var6.getContent();
    var6.setContent("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var13.equals("(default) Indicates to ignore an altitude specification"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var6 = var5.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var7 = var5.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var9 = var8.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var10 = var8.createPostBoxPostBoxNumberExtension();
    var5.setPostBoxNumberExtension(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var12 = var5.getPostBoxNumberExtension();
    java.util.List var13 = var5.getAny();
    var4.setPostBox(var5);
    java.lang.String var15 = var5.getType();
    java.util.List var16 = var5.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("Uknown Status");
    var0.setType("UNKNOWN_LOCATION");
    java.util.List var5 = var0.getAddressLine();
    java.lang.String var6 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var6 = var0.createFirmType();
    java.util.List var7 = var6.getDepartment();
    
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

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var7 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var8 = var0.createAddressDetailsPostalServiceElementsSupplementaryPostalServiceData();
    java.lang.String var9 = var8.getType();
    var8.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var8.setContent("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.Integer var2 = var0.getAccuracy();
    java.lang.String var3 = var0.getCode();
    var0.setCode("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var2 = var0.createPostBoxPostBoxNumberExtension();
    var2.setNumberExtensionSeparator("G_GEO_UNKOWN_STATUS");
    var2.setContent("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ResponseType var2 = var0.createResponseType();
    com.google.earth.kml._2.StatusType var3 = var0.createStatusType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var1 = var0.getMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.getMailStopName();
    java.lang.String var3 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    geo.google.mapping.PointToCoordinateFunctor var0 = geo.google.mapping.PointToCoordinateFunctor.getInstance();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var1.createPremise();
    java.util.List var3 = var2.getAddressLine();
    geo.google.mapping.FunctionChain var4 = new geo.google.mapping.FunctionChain(var3);
    geo.google.mapping.FunctionChain var5 = new geo.google.mapping.FunctionChain((geo.google.mapping.Functor)var0, var4);
    geo.google.mapping.FunctionChain var6 = geo.google.mapping.FunctionChain.getChain((geo.google.mapping.Functor)var0);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var8 = var7.createPremise();
    java.util.List var9 = var8.getAddressLine();
    geo.google.mapping.FunctionChain var10 = new geo.google.mapping.FunctionChain(var9);
    var6.setTail(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var12 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var13 = var12.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var14 = var12.getAddressLines();
    var12.setUsage("");
    var12.setCode("G_GEO_UNKOWN_STATUS");
    var12.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var21 = var12.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var22 = var12.getPostalServiceElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var6.execute((java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getCode();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var4 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var4.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo();
    java.lang.String var6 = var5.getCode();
    var0.setThoroughfareNumberTo(var5);
    var5.setCode("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var5.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var3 = var2.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var2.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var5 = var4.getCode();
    java.util.Map var6 = var4.getOtherAttributes();
    var4.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var11 = var10.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var13 = var12.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var12.createAddressDetailsPostalServiceElementsSortingCode();
    var10.setSortingCode(var14);
    var0.setSortingCode(var14);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var18 = var17.createAddressDetailsPostalServiceElementsSortingCode();
    java.lang.String var19 = var18.getCode();
    var0.setSortingCode(var18);
    java.lang.String var21 = var18.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var5 = var4.getCode();
    java.lang.String var6 = var4.getCode();
    var0.setThoroughfareTrailingType(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var8 = var0.getFirm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.getSubAdministrativeArea();
    var0.setType("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName();
    java.lang.String var1 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getIndicator();
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getContent();
    var0.setCode("hi!");
    var0.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var9 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var5 = var0.createSubPremiseTypeSubPremiseNumberSuffix();
    var5.setNumberSuffixSeparator("hi!");
    var5.setCode("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.List var5 = var0.getAny();
    var0.setType("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var8 = var0.getThoroughfareTrailingType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var2 = var1.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var1.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var4 = var1.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var5 = var1.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var6 = var1.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var7 = var1.createFirmType();
    var0.setFirm(var7);
    var0.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var11 = var0.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber();
    var0.setPostBoxNumber(var12);
    java.lang.String var14 = var12.getCode();
    java.util.Map var15 = var12.getOtherAttributes();
    var12.setContent("geo.google.GeoException: ");
    java.lang.String var18 = var12.getContent();
    var12.setCode("Uknown Status");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "geo.google.GeoException: "+ "'", var18.equals("geo.google.GeoException: "));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var5 = var0.createPostalRouteTypePostalRouteName();
    java.lang.String var6 = var5.getContent();
    
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
    assertNull(var6);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    var0.setNumberSuffixSeparator("G_GEO_UNKOWN_STATUS");
    java.lang.String var3 = var0.getType();
    java.util.Map var4 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var3 = var1.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var4 = var3.getCode();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var9 = var0.getAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var10 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var12 = var11.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var13 = var11.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var14 = var11.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var15 = var11.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    var0.setEndorsementLineCode(var15);
    java.util.List var17 = var0.getAddressIdentifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var3 = var1.equals((java.lang.Object)10L);
    java.lang.String var4 = var1.name();
    java.lang.String var5 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var4.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Uknown Status"+ "'", var5.equals("Uknown Status"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var3 = var1.equals((java.lang.Object)10L);
    int var4 = var1.ordinal();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var6 = var5.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var7 = var5.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var8 = var5.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var9 = var5.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var10 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var11 = var10.getAddressLine();
    java.util.List var12 = var10.getAny();
    var9.setPostBox(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var15 = var14.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var16 = var14.createDependentLocalityTypeDependentLocalityNumber();
    var16.setCode("G_GEO_UNKOWN_STATUS");
    var9.setDependentLocalityNumber(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var20 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var21 = var20.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var22 = var20.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var23 = var20.createDependentLocalityTypeDependentLocalityNumber();
    var23.setContent("");
    var23.setNameNumberOccurrence("");
    var23.setContent("hi!");
    var9.setDependentLocalityNumber(var23);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var31 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var32 = var31.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var33 = var31.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var34 = var31.createDependentLocalityTypeDependentLocalityNumber();
    var34.setContent("");
    var9.setDependentLocalityNumber(var34);
    boolean var38 = var1.equals((java.lang.Object)var9);
    java.lang.String var39 = var9.getUsageType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    geo.google.datamodel.GeoCoordinate var14 = new geo.google.datamodel.GeoCoordinate();
    double var15 = var14.getLongitude();
    geo.google.datamodel.GeoCoordinate var16 = new geo.google.datamodel.GeoCoordinate();
    double var17 = var16.getLongitude();
    double var18 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var14, var16);
    double var19 = var16.getLatitude();
    var16.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var23 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var24 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var16, var23);
    geo.google.datamodel.GeoAddressAccuracy var26 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var27 = var26.getName();
    geo.google.datamodel.GeoUsAddress var28 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var16, var26);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var29 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var30 = var29.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var31 = var29.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var32 = var29.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var33 = var29.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var34 = var29.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var35 = var29.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var36 = var29.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var37 = var29.createAddressDetailsPostalServiceElementsSortingCode();
    boolean var38 = var28.equals((java.lang.Object)var37);
    geo.google.datamodel.GeoAddress var39 = new geo.google.datamodel.GeoAddress();
    java.lang.String var40 = var39.toString();
    geo.google.datamodel.GeoAddressAccuracy var41 = var39.getAccuracy();
    geo.google.datamodel.GeoAddressAccuracy var43 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(10);
    var39.setAccuracy(var43);
    java.lang.String var45 = var43.getName();
    var28.setAccuracy(var43);
    java.lang.String var47 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "UNKNOWN_LOCATION"+ "'", var27.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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
    assertTrue("'" + var40 + "' != '" + "geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var40.equals("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "UNKNOWN_LOCATION"+ "'", var45.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var47.equals("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var2 = var0.createPostalCodePostTownPostTownSuffix();
    var2.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var5 = var2.getOtherAttributes();
    java.lang.String var6 = var2.getCode();
    java.util.Map var7 = var2.getOtherAttributes();
    java.util.Map var8 = var2.getOtherAttributes();
    var2.setContent("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var4 = var0.createSubPremiseTypeSubPremiseNumber();
    java.lang.String var5 = var4.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var5 = var4.getContent();
    var4.setType("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setContent("geo.google.GeoException: ");
    var0.setIndicatorOccurrence("");
    java.lang.String var5 = var0.getType();
    java.lang.String var6 = var0.getType();
    var0.setType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection();
    java.lang.String var1 = var0.getCode();
    java.util.Map var2 = var0.getOtherAttributes();
    var0.setCode("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var5.setThoroughfarePostDirection(var6);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var8 = var5.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var10 = var9.getCode();
    java.lang.String var11 = var9.getCode();
    var5.setThoroughfareTrailingType(var9);
    java.util.List var13 = var5.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var16 = var14.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var17 = var14.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var18 = var14.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var19 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var20 = var19.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var21 = var19.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var23 = var22.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var24 = var22.createPostBoxPostBoxNumberExtension();
    var19.setPostBoxNumberExtension(var24);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var26 = var19.getPostBoxNumberExtension();
    java.util.List var27 = var19.getAny();
    var18.setPostBox(var19);
    var18.setType("");
    var5.setDependentLocality(var18);
    var4.setDependentLocality(var18);
    java.util.List var33 = var4.getThoroughfareNumberSuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    java.util.List var5 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var7 = var6.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var8 = var6.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var9 = var6.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var10 = var6.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var11 = var10.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var10.getDependentLocalityNumber();
    var0.setDependentLocality(var10);
    java.lang.String var14 = var0.getType();
    java.util.Map var15 = var0.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var16 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var18 = var17.getCode();
    java.lang.String var19 = var17.getCode();
    var16.setThoroughfareTrailingType(var17);
    java.util.List var21 = var16.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var23 = var22.getContent();
    var16.setThoroughfarePreDirection(var22);
    java.lang.String var25 = var22.getCode();
    var22.setType("");
    var0.setThoroughfarePreDirection(var22);
    java.util.Map var29 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var5 = var4.getCode();
    java.lang.String var6 = var4.getCode();
    var0.setThoroughfareTrailingType(var4);
    java.util.List var8 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var10 = var9.getCode();
    java.lang.String var11 = var9.getCode();
    var0.setThoroughfareTrailingType(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var13 = var0.getThoroughfareLeadingType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    geo.google.datamodel.GeoStatusCode var3 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var4 = new geo.google.GeoException("", var3);
    geo.google.datamodel.GeoStatusCode var7 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var8 = new geo.google.GeoException("", var7);
    geo.google.GeoException var9 = new geo.google.GeoException((java.lang.Throwable)var8);
    var4.addSuppressed((java.lang.Throwable)var9);
    geo.google.GeoException var11 = new geo.google.GeoException("geo.google.GeoException: ", (java.lang.Throwable)var4);
    geo.google.datamodel.GeoStatusCode var14 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var15 = new geo.google.GeoException("", var14);
    geo.google.GeoException var16 = new geo.google.GeoException((java.lang.Throwable)var15);
    var4.addSuppressed((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var6 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    java.lang.String var7 = var6.getType();
    java.lang.String var8 = var6.getContent();
    var6.setType("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    java.util.List var1 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var3 = var2.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var4 = var2.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = var2.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var6 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var6.setThoroughfarePostDirection(var7);
    java.util.List var9 = var6.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var10 = var6.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var11 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var13 = var12.getCode();
    java.lang.String var14 = var12.getCode();
    var11.setThoroughfareTrailingType(var12);
    var6.setDependentThoroughfare(var11);
    var5.setDependentThoroughfare(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var19 = var18.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var20 = var18.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var21 = var18.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var22 = var18.createThoroughfareLeadingTypeType();
    var11.setThoroughfareLeadingType(var22);
    var0.setThoroughfareLeadingType(var22);
    java.lang.String var25 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    geo.google.mapping.XmlToAddressFunctor var4 = geo.google.mapping.XmlToAddressFunctor.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.standardize("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (geo.google.mapping.XmlMappingFunctor)var4);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    var2.setApiKey("Uknown Status");
    org.apache.commons.httpclient.params.HttpClientParams var5 = var2.getHttpClientParams();
    geo.google.mapping.XmlToUsAddressFunctor var7 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var2.standardize("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (geo.google.mapping.XmlMappingFunctor)var7);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var1 = var0.getAddressDetails();
    com.google.earth.kml._2.PointType var2 = var0.getPoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.List var5 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var7 = var6.getContent();
    var0.setThoroughfarePreDirection(var6);
    java.lang.String var9 = var6.getCode();
    var6.setType("");
    java.lang.String var12 = var6.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var4.getThoroughfarePreDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    var4.setDependentThoroughfare(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    java.lang.String var10 = var9.getType();
    var9.setContent("G_GEO_UNKOWN_STATUS");
    var7.setThoroughfarePostDirection(var9);
    java.util.Map var14 = var7.getOtherAttributes();
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    java.lang.String var1 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var9 = var0.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = var0.getPostalServiceElements();
    java.util.Map var11 = var0.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var12 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var14 = var13.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var15 = var13.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var16 = var15.getCode();
    java.util.Map var17 = var15.getOtherAttributes();
    var15.setCode("G_GEO_UNKOWN_STATUS");
    var12.setEndorsementLineCode(var15);
    var0.setPostalServiceElements(var12);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var22 = var12.getAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var23 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var24 = var23.getCode();
    java.lang.String var25 = var23.getCode();
    var12.setBarcode(var23);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var27 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var28 = var27.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var29 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var30 = var29.getOtherAttributes();
    var27.setAddressLongitude(var29);
    var29.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var29.setContent("UNKNOWN_LOCATION");
    var12.setAddressLongitude(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var3 = var0.getLocality();
    java.util.Map var4 = var0.getOtherAttributes();
    var0.setIndicator("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    java.lang.String var9 = var4.getCode();
    java.util.Map var10 = var4.getOtherAttributes();
    var4.setType("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    var0.setIndicator("hi!");
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getIndicatorOccurrence();
    java.lang.String var5 = var0.getIndicator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var1 = var0.getPostalCode();
    java.util.List var2 = var0.getAny();
    java.util.List var3 = var0.getSubAdministrativeAreaName();
    java.util.List var4 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var2 = var0.createPostBoxPostBoxNumberPrefix();
    java.lang.String var3 = var2.getNumberPrefixSeparator();
    var2.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.util.Map var6 = var2.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    var4.setIndicator("hi!");
    java.lang.String var7 = var4.getContent();
    var2.setPostOfficeNumber(var4);
    var4.setIndicatorOccurrence("");
    var4.setCode("");
    var4.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var2 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var3 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var4 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var5 = var0.createLocality();
    java.util.List var6 = var5.getLocalityName();
    
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

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    geo.google.mapping.XmlToUsAddressFunctor var0 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = var0.execute("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName();
    java.lang.String var1 = var0.getType();
    var0.setContent("");
    var0.setType("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    double var1 = var0.getLongitude();
    geo.google.datamodel.GeoCoordinate var2 = new geo.google.datamodel.GeoCoordinate();
    double var3 = var2.getLongitude();
    double var4 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var2);
    double var5 = var2.getLatitude();
    var2.setLatitude(0.0d);
    var2.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1.0d));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setContent("");
    java.lang.String var4 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getCode();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var4 = var0.getNumberExtensionSeparator();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    long var4 = var1.getRateLimitInterval();
    geo.google.mapping.XmlToUsAddressFunctor var6 = new geo.google.mapping.XmlToUsAddressFunctor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.standardize("geo.google.datamodel.GeoAddress@5ff907ee[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (geo.google.mapping.XmlMappingFunctor)var6);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5769L);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.getThoroughfare();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var1 = var0.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var3 = var0.getPostOffice();
    java.util.Map var4 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var6 = var0.createPostalCodePostTownPostTownName();
    var6.setType("(default) Indicates to ignore an altitude specification");
    java.util.Map var9 = var6.getOtherAttributes();
    
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
    assertNotNull(var9);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getCode();
    java.lang.String var4 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var4 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var5 = var3.getPostOffice();
    java.lang.String var6 = var3.getUsageType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var7 = var3.getPostOffice();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    var2.setContent("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    java.util.List var1 = var0.getContent();
    var0.setCode("");
    java.util.Map var4 = var0.getOtherAttributes();
    java.util.List var5 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var7 = var0.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var8 = var0.createAddressDetailsPostalServiceElementsBarcode();
    
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
    assertNotNull(var8);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressLine();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setCode("(default) Indicates to ignore an altitude specification");
    var0.setType("G_GEO_UNKOWN_STATUS");
    var0.setType("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    geo.google.datamodel.GeoAltitude var1 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var3 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var4 = var3.getMode();
    var1.setMode(var4);
    geo.google.datamodel.GeoAltitude var6 = new geo.google.datamodel.GeoAltitude(100.0d, var4);
    geo.google.datamodel.GeoAltitude var8 = new geo.google.datamodel.GeoAltitude(10.0d);
    var8.setAltitude((-1.0d));
    java.lang.String var11 = var8.toString();
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var12 = var8.getMode();
    int var13 = var12.ordinal();
    var6.setMode(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    java.lang.String var7 = var6.getType();
    java.util.Map var8 = var6.getOtherAttributes();
    java.lang.String var9 = var6.getType();
    java.util.Map var10 = var6.getOtherAttributes();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    java.lang.String var3 = var1.getNumberSuffixSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var8 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var9 = var8.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var10 = var8.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var12 = var11.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var13 = var11.createPostBoxPostBoxNumberExtension();
    var8.setPostBoxNumberExtension(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var15 = var8.getPostBoxNumberExtension();
    java.util.List var16 = var8.getAny();
    var0.setPostBox(var8);
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var18 = var8.getFirm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var2 = var0.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var4 = var3.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var5 = var3.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var6 = var3.createAddressDetailsCountry();
    java.util.List var7 = var6.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var8 = var6.getThoroughfare();
    var0.setCountry(var6);
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var10 = var0.getAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var11 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var12 = var11.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var13 = var11.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var15 = var14.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var16 = var14.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var17 = var14.createAddressDetailsCountry();
    java.util.List var18 = var17.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var19 = var17.getThoroughfare();
    var11.setCountry(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var21 = var17.getAdministrativeArea();
    var0.setCountry(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var23 = var17.getThoroughfare();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var1 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var0.setMailStopName(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var3 = var0.getMailStopNumber();
    java.util.List var4 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setScheme("geo.google.GeoException: geo.google.GeoException: ");
    var0.setCode("geo.google.GeoException: geo.google.GeoException: ");
    var0.setContent("geo.google.GeoException: geo.google.GeoException: ");

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var4 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    var5.setType("CLAMP_TO_GROUND");
    
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

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var1 = var0.getPostalCode();
    java.util.List var2 = var0.getDependentLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var3 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var4.createPremise();
    java.util.List var6 = var5.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var7 = var5.getFirm();
    var5.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var11 = var10.createPremise();
    java.lang.String var12 = var11.getPremiseThoroughfareConnector();
    var5.setPremise(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = var14.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var16 = var14.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var17 = var14.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var18 = var17.getType();
    java.util.List var19 = var17.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var20 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var21 = var20.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var22 = var20.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var23 = var20.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var24 = var20.createThoroughfare();
    java.util.List var25 = var24.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var26 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var27 = var26.getPostTown();
    var24.setPostalCode(var26);
    var17.setPostalCode(var26);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var30 = var17.getPostalCode();
    var5.setPostalCode(var30);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var32 = var30.getPostTown();
    var3.setPostalCode(var30);
    java.util.List var34 = var30.getAddressLine();
    var0.setPostalCode(var30);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var36 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var37 = var36.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var38 = var36.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var39 = var36.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var40 = var36.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var41 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var42 = var41.getAddressLine();
    java.util.List var43 = var41.getAny();
    var40.setPostBox(var41);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var45 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var46 = var45.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var47 = var45.createDependentLocalityTypeDependentLocalityNumber();
    var47.setCode("G_GEO_UNKOWN_STATUS");
    var40.setDependentLocalityNumber(var47);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var51 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var52 = var51.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var53 = var51.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var54 = var51.createDependentLocalityTypeDependentLocalityNumber();
    var54.setContent("");
    var54.setNameNumberOccurrence("");
    var54.setContent("hi!");
    var40.setDependentLocalityNumber(var54);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var62 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var63 = var62.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var64 = var62.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var65 = var62.createDependentLocalityTypeDependentLocalityNumber();
    var65.setContent("");
    var40.setDependentLocalityNumber(var65);
    var0.setDependentLocalityNumber(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    java.util.List var3 = var2.getAddressLine();
    java.util.List var4 = var2.getLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = var2.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var7 = var6.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var8 = var6.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var9 = var6.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var10 = var6.createThoroughfare();
    java.util.List var11 = var10.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var12 = var10.getPremise();
    var2.setThoroughfare(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var14 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var14.setThoroughfarePostDirection(var15);
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var17 = var14.getPremise();
    java.util.List var18 = var14.getThoroughfareNumberOrThoroughfareNumberRange();
    var2.setThoroughfare(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var8 = var0.createPostalCodePostTown();
    java.lang.String var9 = var8.getType();
    java.lang.String var10 = var8.getType();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var4 = var0.createPremiseNumber();
    var4.setType("hi!");
    var4.setType("geo.google.GeoException: ");
    java.lang.String var9 = var4.getNumberTypeOccurrence();
    var4.setContent("geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getType();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getCode();
    var0.setContent("CLAMP_TO_GROUND");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var4 = var0.createPostOfficePostOfficeName();
    java.lang.String var5 = var4.getContent();
    java.lang.String var6 = var4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var4 = var0.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var5 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var6 = var0.createSubPremiseTypeSubPremiseLocation();
    java.lang.String var7 = var6.getCode();
    var6.setContent("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var7);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var3 = var1.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var4 = var3.getCode();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var9 = var0.getAddressLongitude();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var10 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var11 = var10.getAny();
    java.util.List var12 = var10.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var13 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode();
    java.lang.String var14 = var13.getContent();
    var10.setEndorsementLineCode(var13);
    var0.setEndorsementLineCode(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    geo.google.mapping.PointToCoordinateFunctor var0 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var1 = new com.google.earth.kml._2.PointType();
    var1.setTessellate((java.lang.Boolean)true);
    var1.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var6 = var0.execute(var1);
    com.google.earth.kml._2.PointType var7 = new com.google.earth.kml._2.PointType();
    var7.setTessellate((java.lang.Boolean)true);
    var7.setExtrude((java.lang.Boolean)false);
    java.lang.Boolean var12 = var7.isExtrude();
    var7.setCoordinates("Uknown Status");
    java.lang.Boolean var15 = var7.isExtrude();
    var7.setExtrude((java.lang.Boolean)false);
    java.lang.Boolean var18 = var7.isTessellate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var19 = var0.execute(var7);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + true+ "'", var18.equals(true));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getType();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    var1.setType("");
    var1.setCode("hi!");
    java.lang.String var6 = var1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode();
    var0.setScheme("geo.google.datamodel.GeoAddress@5ff907ee[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAltitude.GeoAltitudeMode var1 = geo.google.datamodel.GeoAltitude.GeoAltitudeMode.valueOf("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    var0.setType("geo.google.GeoException: geo.google.GeoException: ");

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getCode();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var4 = var0.getNumberExtensionSeparator();
    var0.setNumberExtensionSeparator("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var5 = var0.getCode();
    java.lang.String var6 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var6.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType();
    java.util.Map var1 = var0.getOtherAttributes();
    java.util.Map var2 = var0.getOtherAttributes();
    java.util.Map var3 = var0.getOtherAttributes();
    java.lang.String var4 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier();
    java.lang.String var1 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    java.lang.String var7 = var5.getType();
    var5.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var10 = var5.getType();
    java.lang.String var11 = var5.getContent();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var11.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    geo.google.mapping.PointToCoordinateFunctor var0 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var1 = new com.google.earth.kml._2.PointType();
    var1.setTessellate((java.lang.Boolean)true);
    var1.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var6 = var0.execute(var1);
    geo.google.datamodel.GeoCoordinate var7 = new geo.google.datamodel.GeoCoordinate();
    double var8 = var7.getLongitude();
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    double var11 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var7, var9);
    geo.google.datamodel.GeoCoordinate var12 = new geo.google.datamodel.GeoCoordinate();
    double var13 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var7, var12);
    geo.google.datamodel.GeoStatusCode var16 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var17 = new geo.google.GeoException("", var16);
    boolean var18 = var7.equals((java.lang.Object)var16);
    geo.google.datamodel.GeoAltitude var20 = new geo.google.datamodel.GeoAltitude(0.0d);
    var7.setAltitude(var20);
    double var22 = var6.distanceTo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var5 = var1.standardizeToGeoAddress("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    java.util.List var3 = var2.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var4 = var2.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var5 = var2.getDepartment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    var7.setType("geo.google.GeoException: geo.google.GeoException: ");
    java.util.Map var10 = var7.getOtherAttributes();
    
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
    assertNotNull(var10);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.util.Map var1 = var0.getOtherAttributes();
    java.util.Map var2 = var0.getOtherAttributes();
    var0.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setType("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var3 = var0.getThoroughfareNumberFrom();
    java.lang.String var4 = var0.getIndicatorOccurrence();
    var0.setRangeType("hi!");
    var0.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@26f2d88c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressLine();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setCode("(default) Indicates to ignore an altitude specification");
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var7 = var0.getCode();
    var0.setContent("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var7.equals("(default) Indicates to ignore an altitude specification"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getUsage();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.getThoroughfare();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    var5.setIndicator("G_GEO_UNKOWN_STATUS");
    var5.setType("hi!");
    var5.setType("geo.google.GeoException: ");
    var5.setIndicatorOccurence("hi!");
    var5.setSeparator("geo.google.GeoException: ");
    java.lang.String var16 = var5.getIndicatorOccurence();
    java.lang.String var17 = var5.getSeparator();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "geo.google.GeoException: "+ "'", var17.equals("geo.google.GeoException: "));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var3.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var6 = var3.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var7 = var3.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var8 = var7.getIndicator();
    var2.setLargeMailUserIdentifier(var7);
    java.lang.String var10 = var7.getType();
    java.lang.String var11 = var7.getType();
    var7.setContent("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var7 = var0.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var8 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var9 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var10 = var9.getType();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var4 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var5 = var0.createSubPremiseTypeSubPremiseNumber();
    java.lang.String var6 = var5.getCode();
    java.lang.String var7 = var5.getIndicatorOccurrence();
    
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var3.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var6 = var3.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var7 = var3.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var8 = var7.getIndicator();
    var2.setLargeMailUserIdentifier(var7);
    java.lang.String var10 = var7.getType();
    java.lang.String var11 = var7.getContent();
    var7.setContent("Uknown Status");
    var7.setContent("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getContent();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var3 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    java.lang.String var5 = var4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    com.google.earth.kml._2.PointType var1 = var0.getPoint();
    var0.setId("");
    var0.setId("geo.google.GeoException: hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var6 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var7 = var6.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var8 = var6.getAddressLines();
    var6.setUsage("");
    var6.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var13 = var6.getAddressDetailsKey();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = var14.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var16 = var14.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var17 = var14.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var18 = var14.createThoroughfareThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var19 = var14.createAddressLinesType();
    var6.setAddressLines(var19);
    var0.setAddressDetails(var6);
    java.lang.String var22 = var0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
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
    assertNull(var22);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var9 = var8.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var10 = var8.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var11 = var8.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var12 = var8.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var13 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var14 = var13.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var15 = var13.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var17 = var16.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var18 = var16.createPostBoxPostBoxNumberExtension();
    var13.setPostBoxNumberExtension(var18);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var20 = var13.getPostBoxNumberExtension();
    java.util.List var21 = var13.getAny();
    var12.setPostBox(var13);
    var12.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var25 = var12.getDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var26 = var12.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var27 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var29 = var28.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var30 = var28.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var31 = var28.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var32 = var28.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var33 = var28.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var34 = var28.createFirmType();
    var27.setFirm(var34);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var36 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var37 = var36.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var38 = var36.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var39 = var36.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var40 = var36.createThoroughfare();
    java.util.List var41 = var40.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var42 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var43 = var42.getPostTown();
    var40.setPostalCode(var42);
    var34.setPostalCode(var42);
    var12.setPostalCode(var42);
    var1.setPostalCode(var42);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var48 = var1.getDependentLocality();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var3 = var0.getType();
    var0.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setIdentifierType("hi!");
    var0.setContent("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    java.util.List var1 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = var0.getThoroughfarePostDirection();
    java.lang.String var3 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    var0.setCode("(default) Indicates to ignore an altitude specification");
    java.util.Map var5 = var0.getOtherAttributes();
    java.lang.String var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var8 = var0.createPostalCodePostTown();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var9 = var0.createAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var10 = var0.createThoroughfare();
    java.util.List var11 = var10.getThoroughfareNumberOrThoroughfareNumberRange();
    java.util.List var12 = var10.getAny();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.CountryName();
    var0.setCode("hi!");
    var0.setType("hi!");
    var0.setType("G_GEO_UNKOWN_STATUS");
    var0.setType("");
    var0.setContent("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var4.setThoroughfarePostDirection(var5);
    java.util.List var7 = var4.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var8 = var4.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var9 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var11 = var10.getCode();
    java.lang.String var12 = var10.getCode();
    var9.setThoroughfareTrailingType(var10);
    var4.setDependentThoroughfare(var9);
    var3.setDependentThoroughfare(var9);
    var3.setDependentThoroughfares("geo.google.GeoException: ");
    java.util.List var18 = var3.getThoroughfareNumberPrefix();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.valueOf("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
