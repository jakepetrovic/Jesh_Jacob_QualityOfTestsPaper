package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


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
    java.util.List var22 = var12.getAddressIdentifier();
    
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
    assertNotNull(var22);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix();
    var0.setCode("hi!");
    var0.setNumberSuffixSeparator("Uknown Status");
    java.lang.String var5 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


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
    java.util.Map var18 = var13.getOtherAttributes();
    var13.setContent("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNotNull(var18);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType();
    java.util.List var1 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var2 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var0.setPostalRouteNumber(var2);
    java.lang.String var4 = var0.getType();
    java.util.List var5 = var0.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getUsage();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var5 = var4.getContent();
    var4.setType("Uknown Status");
    var0.setAddress(var4);
    java.lang.String var9 = var4.getType();
    var4.setType("hi!");
    var4.setContent("geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Uknown Status"+ "'", var9.equals("Uknown Status"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    geo.google.datamodel.GeoCoordinate var7 = new geo.google.datamodel.GeoCoordinate();
    double var8 = var7.getLongitude();
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    double var11 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var7, var9);
    double var12 = var9.getLatitude();
    var9.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var16 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var17 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var9, var16);
    java.lang.String var18 = var17.getPostalCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "UNKNOWN_LOCATION"+ "'", var18.equals("UNKNOWN_LOCATION"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


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
    var6.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var12 = var6.getType();
    
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
    assertTrue("'" + var12 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var12.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setCode("");
    var0.setCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.fromValue("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setContent("");
    java.lang.String var6 = var2.getNumberPrefixSeparator();
    java.lang.String var7 = var2.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAny();
    var6.setType("");
    var1.setPremise(var6);
    java.lang.String var11 = var6.getPremiseDependencyType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var12.createPremise();
    java.util.List var14 = var13.getAddressLine();
    java.util.List var15 = var13.getAny();
    var13.setType("");
    var13.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var20 = var13.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var21 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var22 = var21.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var23 = var21.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var24 = var21.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var25 = var21.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var26 = var21.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var27 = var21.createFirmType();
    var13.setFirm(var27);
    var6.setFirm(var27);
    java.util.Map var30 = var27.getOtherAttributes();
    var27.setType("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var3 = var0.getThoroughfareNumberFrom();
    java.lang.String var4 = var0.getIndicatorOccurrence();
    java.util.Map var5 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    java.util.Map var8 = var1.getOtherAttributes();
    java.util.List var9 = var1.getAny();
    var1.setType("geo.google.GeoException: ");
    
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix();
    var0.setCode("hi!");
    java.util.Map var3 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setContent("geo.google.GeoException: ");
    var0.setIndicatorOccurrence("");
    java.lang.String var5 = var0.getIndicatorOccurrence();
    var0.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    var0.setCode("(default) Indicates to ignore an altitude specification");
    var0.setCode("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var6 = var0.createPostalCodePostalCodeNumber();
    java.lang.String var7 = var6.getCode();
    var6.setContent("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var6.setType("geo.google.datamodel.GeoAddress@26f2d88c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    geo.google.mapping.PointToCoordinateFunctor var0 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var1 = new com.google.earth.kml._2.PointType();
    var1.setTessellate((java.lang.Boolean)true);
    var1.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var6 = var0.execute(var1);
    com.google.earth.kml._2.PointType var7 = new com.google.earth.kml._2.PointType();
    var7.setTessellate((java.lang.Boolean)true);
    java.lang.Boolean var10 = var7.isTessellate();
    geo.google.datamodel.GeoCoordinate var11 = var0.execute(var7);
    var7.setCoordinates("Uknown Status");
    var7.setExtrude((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + true+ "'", var10.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    var5.setType("geo.google.GeoException: ");
    java.lang.String var8 = var5.getIndicator();
    var5.setType("UNKNOWN_LOCATION");
    java.lang.String var11 = var5.getRangeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var12 = var5.getPremiseNumberRangeTo();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.lang.String var5 = var1.getCode();
    java.util.Map var6 = var1.getOtherAttributes();
    var1.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var9 = var1.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAny();
    var6.setType("");
    var1.setPremise(var6);
    java.util.List var11 = var6.getPremiseNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var4 = var0.createAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var5 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var6 = var0.createPremisePremiseLocation();
    
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

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    java.util.Map var6 = var5.getOtherAttributes();
    var5.setContent("hi!");
    var5.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var6 = var0.createDepartment();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var7 = var0.createBuildingNameType();
    var7.setTypeOccurrence("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    long var4 = var1.getRateLimitInterval();
    geo.google.mapping.XmlToAddressFunctor var6 = new geo.google.mapping.XmlToAddressFunctor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.standardize("hi!", (geo.google.mapping.XmlMappingFunctor)var6);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5769L);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


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
    java.util.List var28 = var25.getAddressLine();
    
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
    assertNotNull(var28);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var3 = var0.createPremisePremiseName();
    var3.setContent("");
    var3.setTypeOccurrence("geo.google.GeoException: ");
    var3.setContent("hi!");
    var3.setCode("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setContent("geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var3 = var2.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var4 = var2.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var5 = var2.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var6 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var7 = var5.getPostOffice();
    java.lang.String var8 = var5.getUsageType();
    java.util.List var9 = var5.getAddressLine();
    var0.setSubAdministrativeArea(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var11 = var0.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var12 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var13 = var12.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = var14.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var16 = var14.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var17 = var14.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var18 = var17.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var19 = var17.getPostOffice();
    java.lang.String var20 = var17.getUsageType();
    java.util.List var21 = var17.getAddressLine();
    var12.setSubAdministrativeArea(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var23 = var12.getLocality();
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
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var41 = var28.getDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var42 = var28.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var43 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var44 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var45 = var44.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var46 = var44.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var47 = var44.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var48 = var44.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var49 = var44.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var50 = var44.createFirmType();
    var43.setFirm(var50);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var52 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var53 = var52.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var54 = var52.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var55 = var52.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var56 = var52.createThoroughfare();
    java.util.List var57 = var56.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var58 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var59 = var58.getPostTown();
    var56.setPostalCode(var58);
    var50.setPostalCode(var58);
    var28.setPostalCode(var58);
    var12.setPostalCode(var58);
    var0.setPostalCode(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNull(var59);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var6 = var0.createBuildingNameType();
    var6.setContent("(default) Indicates to ignore an altitude specification");
    java.lang.String var9 = var6.getType();
    var6.setType("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var3 = var0.createThoroughfareLeadingTypeType();
    java.lang.String var4 = var3.getType();
    var3.setContent("hi!");
    java.lang.String var7 = var3.getContent();
    java.lang.String var8 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setType("hi!");
    var0.setType("geo.google.GeoException: ");
    java.lang.String var5 = var0.getContent();
    var0.setCode("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getContent();
    var0.setContent("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var18 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var1.setPremiseLocation(var18);
    java.util.List var20 = var1.getBuildingName();
    java.util.List var21 = var1.getPremiseNumberSuffix();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ResponseType var2 = var0.createResponseType();
    com.google.earth.kml._2.PointType var3 = var0.createPointType();
    java.lang.String var4 = var3.getCoordinates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var3.setContent("");
    var3.setNameNumberOccurrence("");
    var3.setContent("hi!");
    java.util.Map var10 = var3.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    java.util.Map var4 = var3.getOtherAttributes();
    var3.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var7 = var3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var7.equals("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var2 = var0.getAddressLatitudeDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    var4.setCode("hi!");
    java.lang.String var10 = var4.getContent();
    var4.setCode("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var10);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


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
    var6.setType("G_GEO_UNKOWN_STATUS");
    java.util.Map var12 = var6.getOtherAttributes();
    java.lang.String var13 = var6.getCode();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var5 = var3.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var3.createPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var7 = var3.createAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var8 = var3.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var9 = var3.createThoroughfareThoroughfareNumberRangeThoroughfareNumberFrom();
    var0.setThoroughfareNumberFrom(var9);
    var9.setCode("G_GEO_UNKOWN_STATUS");
    java.util.Map var13 = var9.getOtherAttributes();
    
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
    assertNotNull(var13);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var2.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@25d14add[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var29 = var28.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var30 = var28.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var31 = var28.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var32 = var28.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var33 = var28.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var34 = var28.createMailStopTypeMailStopNumber();
    var25.setMailStopNumber(var34);
    java.lang.String var36 = var34.getNameNumberSeparator();
    
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
    assertNull(var36);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    geo.google.datamodel.GeoAltitude var1 = new geo.google.datamodel.GeoAltitude((-1.0d));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var16 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var18 = var17.getCode();
    var16.setThoroughfarePreDirection(var17);
    var17.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var9.setThoroughfarePreDirection(var17);
    java.lang.String var23 = var17.getContent();
    java.lang.String var24 = var17.getCode();
    java.lang.String var25 = var17.getType();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var23.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var4 = var0.createSubPremiseTypeSubPremiseName();
    var4.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var4.setType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    var5.setCode("UNKNOWN_LOCATION");
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
    assertNotNull(var9);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var5 = var0.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var6 = var5.getIndicator();
    var5.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var3 = var0.createSubPremiseTypeSubPremiseLocation();
    var3.setCode("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var6 = var3.getCode();
    java.lang.String var7 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var7.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    java.lang.String var4 = var3.getContent();
    var3.setType("geo.google.GeoException: geo.google.GeoException: ");
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
    assertTrue("'" + var7 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var7.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var2 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    java.util.List var3 = var2.getContent();
    var0.setThoroughfareNumberFrom(var2);
    var0.setIndicator("geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var7 = var0.createPostalRouteTypePostalRouteName();
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

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setContent("");
    var2.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var2.getType();
    var2.setContent("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var1.setRateLimitInterval(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var5 = var1.standardizeToGeoCoordinate("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var1 = var0.getPostOffice();
    java.lang.String var2 = var0.getUsageType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var4 = var3.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var5 = var3.createPostOffice();
    java.util.List var6 = var5.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var7 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    var7.setIndicator("hi!");
    java.lang.String var10 = var7.getContent();
    var5.setPostOfficeNumber(var7);
    var0.setPostOffice(var5);
    var5.setType("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var10);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var2 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var3 = var0.createBuildingNameType();
    var3.setContent("geo.google.GeoException: ");
    java.lang.String var6 = var3.getContent();
    java.lang.String var7 = var3.getTypeOccurrence();
    java.lang.String var8 = var3.getTypeOccurrence();
    var3.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var8);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var3 = var0.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var4 = var0.createThoroughfareThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var5 = var0.createAddressLinesType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var6 = var0.createAddressDetailsPostalServiceElementsAddressLongitude();
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

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getType();
    var0.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var2 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    java.lang.String var4 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    java.lang.String var1 = var0.getContent();
    var0.setCode("geo.google.GeoException: ");
    java.lang.String var4 = var0.getNumberType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var2 = var0.createAdministrativeAreaAdministrativeAreaName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    var3.setType("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var11 = var0.createThoroughfarePostDirectionType();
    var11.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var4 = var0.createLocalityLocalityName();
    var4.setType("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber();
    var0.setNumberTypeOccurrence("hi!");
    var0.setIndicator("geo.google.GeoException: ");
    java.lang.String var5 = var0.getType();
    java.lang.String var6 = var0.getType();
    var0.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAny();
    var6.setType("");
    var1.setPremise(var6);
    java.lang.String var11 = var6.getPremiseDependencyType();
    var6.setPremiseThoroughfareConnector("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    var1.setPremise(var4);
    var4.setPremiseThoroughfareConnector("hi!");
    java.util.List var8 = var4.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName();
    var0.setCode("Uknown Status");
    java.util.Map var3 = var0.getOtherAttributes();
    java.lang.String var4 = var0.getType();
    java.lang.String var5 = var0.getCode();
    java.util.Map var6 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Uknown Status"+ "'", var5.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    var3.setCode("geo.google.GeoException: ");
    java.lang.String var6 = var3.getContent();
    var3.setCode("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    var5.setType("");
    java.lang.String var9 = var5.getType();
    var5.setType("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    var0.setIndicator("hi!");
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setIndicator("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var0.getNumberTypeOccurrence();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


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
    var4.setConnector("geo.google.datamodel.GeoAddress@5ff907ee[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var28 = var4.getPremise();
    
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
    assertNull(var28);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var4 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var5 = var0.createPostalCodePostTownPostTownName();
    java.lang.String var6 = var5.getType();
    java.util.Map var7 = var5.getOtherAttributes();
    
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
    assertNotNull(var7);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    var1.setRateLimitInterval(100L);
    java.lang.String var6 = var1.getApiKey();
    java.lang.String var7 = var1.getApiKey();
    geo.google.datamodel.GeoCoordinate var22 = new geo.google.datamodel.GeoCoordinate();
    double var23 = var22.getLongitude();
    geo.google.datamodel.GeoCoordinate var24 = new geo.google.datamodel.GeoCoordinate();
    double var25 = var24.getLongitude();
    double var26 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var22, var24);
    double var27 = var24.getLatitude();
    var24.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var31 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var32 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var24, var31);
    geo.google.datamodel.GeoAddressAccuracy var34 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var35 = var34.getName();
    geo.google.datamodel.GeoUsAddress var36 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var24, var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var37 = var1.standardizeToGeoUsAddress(var36);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "geo.google.GeoException: "+ "'", var7.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "UNKNOWN_LOCATION"+ "'", var35.equals("UNKNOWN_LOCATION"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    org.apache.commons.httpclient.params.HttpClientParams var3 = var2.getHttpClientParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var2.standardizeToGeoUsAddresses("geo.google.GeoException: hi!");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.CountryName();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setType("Uknown Status");
    var0.setType("");
    var0.setCode("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName();
    var0.setType("");
    java.lang.String var3 = var0.getCode();
    java.lang.String var4 = var0.getCode();
    java.lang.String var5 = var0.getCode();
    var0.setCode("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


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
    java.lang.String var11 = var4.getIndicator();
    var4.setType("(default) Indicates to ignore an altitude specification");
    
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
    assertNull(var11);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setRangeType("");
    java.lang.String var7 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var8 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    var0.setThoroughfareNumberFrom(var8);
    java.lang.String var10 = var0.getCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var12 = var11.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var13 = var11.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var14 = var11.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var15 = var11.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var16 = var11.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    var0.setThoroughfareNumberTo(var16);
    java.lang.String var18 = var0.getNumberRangeOccurrence();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Uknown Status"+ "'", var7.equals("Uknown Status"));
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var18.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var13 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var13.setThoroughfarePostDirection(var14);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var16 = var13.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var18 = var17.getCode();
    java.lang.String var19 = var17.getCode();
    var13.setThoroughfareTrailingType(var17);
    java.util.List var21 = var13.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var23 = var22.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var24 = var22.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var25 = var22.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var26 = var22.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var27 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var28 = var27.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var29 = var27.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var30 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var31 = var30.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var32 = var30.createPostBoxPostBoxNumberExtension();
    var27.setPostBoxNumberExtension(var32);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var34 = var27.getPostBoxNumberExtension();
    java.util.List var35 = var27.getAny();
    var26.setPostBox(var27);
    var26.setType("");
    var13.setDependentLocality(var26);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var40 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var41 = var40.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var42 = var40.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var43 = var40.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var44 = var40.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var45 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var46 = var45.getAddressLine();
    java.util.List var47 = var45.getAny();
    var44.setPostBox(var45);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var49 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var44.setPostBox(var49);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var51 = var44.getDependentLocalityNumber();
    var26.setDependentLocality(var44);
    var0.setDependentLocality(var44);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var54 = var0.getDependentThoroughfare();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var3 = var0.getNumberRangeOccurrence();
    java.lang.String var4 = var0.getSeparator();
    java.util.Map var5 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var3.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var3.setCode("hi!");
    var1.setPremiseLocation(var3);
    java.lang.String var7 = var3.getCode();
    var3.setContent("geo.google.datamodel.GeoAddress@26f2d88c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getCode();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var4 = var0.getNumberExtensionSeparator();
    java.util.Map var5 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setNumberSuffixSeparator("hi!");
    var3.setContent("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var19 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var20 = var19.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var21 = var19.createLargeMailUserType();
    java.util.List var22 = var21.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var24 = var23.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var25 = var23.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var26 = var23.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var27 = var23.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var28 = var23.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var29 = var28.getCode();
    var21.setLargeMailUserIdentifier(var28);
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var31 = var21.getLargeMailUserIdentifier();
    var2.setLargeMailUserIdentifier(var31);
    java.util.List var33 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var34 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var35 = var34.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var36 = var34.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var37 = var34.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var38 = var34.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var39 = var34.createLargeMailUserTypeLargeMailUserIdentifier();
    var39.setContent("geo.google.GeoException: ");
    var2.setLargeMailUserIdentifier(var39);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var43 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var44 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var45 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var44.setThoroughfarePostDirection(var45);
    java.util.List var47 = var44.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var48 = var44.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var49 = var44.getPostalCode();
    var43.setThoroughfare(var44);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var51 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var52 = var51.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var53 = var51.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var54 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var55 = var54.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var56 = var54.createPostBoxPostBoxNumberExtension();
    var51.setPostBoxNumberExtension(var56);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var58 = var51.getPostBoxNumberExtension();
    java.util.List var59 = var51.getAny();
    var43.setPostBox(var51);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var61 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var62 = var61.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var63 = var61.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var64 = var61.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var65 = var61.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var66 = var61.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var67 = var61.createFirmType();
    java.util.List var68 = var67.getFirmName();
    var51.setFirm(var67);
    java.util.List var70 = var51.getAddressLine();
    java.util.List var71 = var51.getAddressLine();
    var2.setPostBox(var51);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setNumberType("");
    java.lang.String var4 = var0.getNumberTypeOccurrence();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.util.List var2 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var4 = var3.getAny();
    java.lang.String var5 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var6 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var3.setAddressLatitude(var6);
    var6.setCode("Uknown Status");
    var0.setAddressLatitude(var6);
    var6.setContent("geo.google.GeoException: ");
    var6.setContent("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


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
    java.util.List var10 = var2.getBuildingName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var11 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var11.setThoroughfarePostDirection(var12);
    var2.setThoroughfare(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var15 = var2.getLargeMailUserIdentifier();
    java.lang.String var16 = var2.getType();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


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
    java.lang.String var11 = var5.getType();
    java.lang.String var12 = var5.getType();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.StatusType var2 = new com.google.earth.kml._2.StatusType();
    java.lang.String var3 = var2.getRequest();
    var1.setStatus(var2);
    var2.setRequest("hi!");
    var2.setRequest("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    java.util.List var3 = var2.getContent();
    java.util.List var4 = var2.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var5 = var0.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var6 = var0.getDependentThoroughfare();
    var0.setDependentThoroughfaresIndicator("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var3 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var4 = var3.getCode();
    java.lang.String var5 = var3.getContent();
    java.lang.String var6 = var3.getType();
    
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

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setCode("");
    java.lang.String var3 = var0.getIndicator();
    var0.setNumberType("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getNumberType();
    var0.setNumberOccurrence("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var6.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ResponseType var2 = var0.createResponseType();
    com.google.earth.kml._2.PlacemarkType var3 = var0.createPlacemarkType();
    java.lang.String var4 = var3.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    java.lang.String var1 = var0.toString();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var3 = var2.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var4 = var2.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var5 = var4.getType();
    var4.setCode("G_GEO_UNKOWN_STATUS");
    var4.setCode("G_GEO_UNKOWN_STATUS");
    var4.setCode("geo.google.GeoException: geo.google.GeoException: ");
    var4.setType("");
    boolean var14 = var0.equals((java.lang.Object)"");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var15 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var16 = var15.getAddress();
    java.lang.String var17 = var15.getValidToDate();
    java.lang.String var18 = var15.getAddressDetailsKey();
    var0.setAddressDetails(var15);
    java.lang.String var20 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "geo.google.datamodel.GeoAddress@2ea7c82[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var1.equals("geo.google.datamodel.GeoAddress@2ea7c82[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    java.util.Map var9 = var4.getOtherAttributes();
    java.lang.String var10 = var4.getCode();
    java.lang.String var11 = var4.getContent();
    java.lang.String var12 = var4.getCode();
    java.lang.String var13 = var4.getType();
    java.lang.String var14 = var4.getType();
    var4.setCode("CLAMP_TO_GROUND");
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var0.setCode("hi!");
    java.lang.String var3 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber();
    var0.setNumberTypeOccurrence("hi!");
    var0.setIndicator("geo.google.GeoException: ");
    java.lang.String var5 = var0.getType();
    java.lang.String var6 = var0.getType();
    var0.setCode("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var9 = var0.getIndicator();
    java.util.Map var10 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "geo.google.GeoException: "+ "'", var9.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getCurrentStatus();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var4 = var0.getPostalServiceElements();
    var0.setUsage("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAltitude.GeoAltitudeMode var1 = geo.google.datamodel.GeoAltitude.GeoAltitudeMode.valueOf("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    var0.setCode("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    var0.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var4 = var3.getValidToDate();
    var3.setAddressDetailsKey("hi!");
    var0.setAddressDetails(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var0.getAddressDetails();
    com.google.earth.kml._2.PointType var9 = new com.google.earth.kml._2.PointType();
    var9.setTessellate((java.lang.Boolean)true);
    var9.setExtrude((java.lang.Boolean)false);
    var0.setPoint(var9);
    var9.setCoordinates("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var16 = var15.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var17 = var15.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var18 = var15.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var19 = var15.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var20 = var15.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var21 = var15.createPostOfficePostOfficeName();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var22 = var15.createFirmType();
    var5.setFirm(var22);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var24 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var25 = var24.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var26 = var24.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var27 = var24.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var28 = var24.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var29 = var24.createAddressDetailsPostalServiceElementsAddressLongitude();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var30 = var24.createFirmType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var31 = var24.createPostBoxPostBoxNumberSuffix();
    var5.setPostBoxNumberSuffix(var31);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
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

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var7 = var0.createAddressLine();
    
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

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
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

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setType("");
    var2.setTypeOccurrence("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var4 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
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

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    var0.setContent("");
    java.util.Map var3 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    java.util.List var1 = var0.getDepartmentName();
    java.util.List var2 = var0.getDepartmentName();
    java.lang.String var3 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var4.createPremise();
    java.util.List var6 = var5.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var7.setCode("hi!");
    var5.setPremiseLocation(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var11 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    var5.setPostalCode(var11);
    var0.setPostalCode(var11);
    java.util.Map var14 = var0.getOtherAttributes();
    
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
    assertNotNull(var14);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    java.lang.String var3 = var1.getContent();
    java.util.Map var4 = var1.getOtherAttributes();
    java.lang.String var5 = var1.getNumberSuffixSeparator();
    
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

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var4 = var2.standardizeToGeoCoordinate("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var1 = new geo.google.datamodel.GeoCoordinate();
    double var2 = var1.getLongitude();
    double var3 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var1);
    double var4 = var0.getLatitude();
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var6 = new geo.google.datamodel.GeoCoordinate();
    double var7 = var6.getLongitude();
    double var8 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var5, var6);
    geo.google.datamodel.GeoCoordinate var9 = var5.clone();
    double var10 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var0, var9);
    geo.google.datamodel.GeoAltitude var11 = var0.getAltitude();
    double var12 = var11.getAltitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var4 = var0.createPostOfficePostOfficeName();
    java.lang.String var5 = var4.getContent();
    var4.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var4.setContent("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var5 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var6 = var0.createPostalCodePostalCodeNumberExtension();
    var6.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var9 = var6.getContent();
    
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
    assertTrue("'" + var9 + "' != '" + "geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var9.equals("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ObjectFactory var2 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var3 = var2.createResponseType();
    com.google.earth.kml._2.StatusType var4 = new com.google.earth.kml._2.StatusType();
    java.lang.String var5 = var4.getRequest();
    var3.setStatus(var4);
    var1.setStatus(var4);
    var4.setRequest("geo.google.datamodel.GeoUsAddress@2fec0f69[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@32e7cf13[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@10cc0281[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    var4.setUsageType("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var12 = var11.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var13 = var11.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var14 = var13.getLargeMailUserIdentifier();
    var4.setLargeMailUser(var13);
    java.util.List var16 = var4.getAny();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    long var4 = var1.getRateLimitInterval();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var1.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5769L);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.CountryName();
    var0.setCode("hi!");
    var0.setType("hi!");
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.util.Map var7 = var0.getOtherAttributes();
    var0.setType("");
    var0.setCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var12 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


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
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var18 = var3.getFirm();
    java.util.List var19 = var3.getAny();
    java.lang.String var20 = var3.getDependentThoroughfaresType();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    var6.setVersion("G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


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
    geo.google.datamodel.GeoCoordinate var41 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var42 = new geo.google.datamodel.GeoCoordinate();
    double var43 = var42.getLongitude();
    double var44 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var41, var42);
    geo.google.datamodel.GeoAltitude var45 = var42.getAltitude();
    geo.google.datamodel.GeoCoordinate var46 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var47 = new geo.google.datamodel.GeoCoordinate();
    double var48 = var47.getLongitude();
    double var49 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var46, var47);
    double var50 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var42, var47);
    double var51 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var0, var47);
    geo.google.mapping.PointToCoordinateFunctor var52 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var53 = new com.google.earth.kml._2.PointType();
    var53.setTessellate((java.lang.Boolean)true);
    var53.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var58 = var52.execute(var53);
    com.google.earth.kml._2.PointType var59 = new com.google.earth.kml._2.PointType();
    var59.setTessellate((java.lang.Boolean)true);
    java.lang.Boolean var62 = var59.isTessellate();
    geo.google.datamodel.GeoCoordinate var63 = var52.execute(var59);
    double var64 = geo.google.datamodel.GeoUtils.distanceBetweenInKm(var0, var63);
    geo.google.datamodel.GeoStatusCode var66 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var68 = var66.equals((java.lang.Object)10L);
    java.lang.String var69 = var66.name();
    int var70 = var66.getCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var71 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var72 = var71.getIndicator();
    java.util.Map var73 = var71.getOtherAttributes();
    boolean var74 = var66.equals((java.lang.Object)var73);
    boolean var75 = var0.equals((java.lang.Object)var66);
    
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
    assertTrue(var43 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + true+ "'", var62.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var69.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var4 = var0.createFirmType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var5 = var0.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var7 = var6.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var8 = var6.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var9 = var6.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var10 = var6.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var11 = var6.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var12 = var6.createLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var12.getPremise();
    java.lang.String var14 = var12.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var15 = var12.getPostalCode();
    var5.setLocality(var12);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var2 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var4 = var0.createPostBoxPostBoxNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var5 = var0.createPostalRouteTypePostalRouteNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var6 = var0.createAddressDetailsCountryCountryNameCode();
    var6.setCode("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var6.setCode("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var4 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var6 = var0.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var7 = var6.getAdministrativeArea();
    
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

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation();
    var0.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var3 = var0.getContent();
    var0.setCode("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var3.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var0.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var0.setCode("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setContent("geo.google.datamodel.GeoAddress@1dd53212[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


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
    java.lang.String var13 = var6.getCode();
    java.lang.String var14 = var6.getType();
    var6.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var6.setContent("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var19 = var6.getOtherAttributes();
    
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
    assertTrue("'" + var13 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var13.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


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
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var36 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown();
    var36.setType("(default) Indicates to ignore an altitude specification");
    var32.setPostTown(var36);
    java.util.List var40 = var36.getPostTownName();
    
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
    assertNotNull(var40);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    var7.setType("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var10 = var7.getContent();
    
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getContent();
    java.util.Map var5 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var4 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    var4.setContent("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var6 = var5.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var8 = var7.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var9 = var7.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var10 = var9.getCode();
    java.util.Map var11 = var9.getOtherAttributes();
    var9.setCode("G_GEO_UNKOWN_STATUS");
    var5.setEndorsementLineCode(var9);
    java.util.Map var15 = var9.getOtherAttributes();
    var0.setEndorsementLineCode(var9);
    var9.setCode("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    geo.google.datamodel.GeoStatusCode var2 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var3 = new geo.google.GeoException("", var2);
    geo.google.GeoException var4 = new geo.google.GeoException((java.lang.Throwable)var3);
    java.lang.String var5 = var4.toString();
    geo.google.GeoException var6 = new geo.google.GeoException((java.lang.Throwable)var4);
    java.lang.String var7 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var5.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var7.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


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
    java.lang.String var29 = var28.getCounty();
    var28.setAddressLine2("geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertTrue("'" + var29 + "' != '" + "Uknown Status"+ "'", var29.equals("Uknown Status"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


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
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var16 = var3.getPostalCode();
    java.util.Map var17 = var16.getOtherAttributes();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var2 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var3 = var0.createThoroughfareTrailingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var4 = var0.createPremisePremiseName();
    var4.setTypeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var7 = var4.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var3 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName var4 = var0.createAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName();
    var4.setType("(default) Indicates to ignore an altitude specification");
    java.lang.String var7 = var4.getContent();
    java.lang.String var8 = var4.getType();
    var4.setContent("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var8.equals("(default) Indicates to ignore an altitude specification"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    var6.setType("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var6.setContent("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var11 = var6.getOtherAttributes();
    
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
    assertNotNull(var11);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getCode();
    java.lang.String var5 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var4 = var0.createPremiseNumber();
    var4.setType("hi!");
    var4.setType("geo.google.GeoException: ");
    java.lang.String var9 = var4.getNumberTypeOccurrence();
    var4.setContent("geo.google.GeoException: hi!");
    var4.setIndicator("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressLine();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    var0.setCode("(default) Indicates to ignore an altitude specification");
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.util.Map var7 = var0.getOtherAttributes();
    var0.setContent("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var10.equals("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var4 = var0.createThoroughfareNumber();
    var4.setType("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
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
      java.util.List var20 = var1.standardizeToGeoUsAddresses(var19);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
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

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var1 = geo.google.mapping.MappingUtils.stringToCoordinate("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


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
    java.util.List var25 = var22.getAddressLine();
    java.util.Map var26 = var22.getOtherAttributes();
    java.util.List var27 = var22.getAny();
    java.util.Map var28 = var22.getOtherAttributes();
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.getEndorsementLineCode();
    java.util.List var3 = var0.getSupplementaryPostalServiceData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var40 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var41 = var40.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var42 = var40.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var43 = var40.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var44 = var40.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var45 = var40.createLargeMailUserTypeLargeMailUserIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var46 = var40.createDependentLocalityTypeDependentLocalityNumber();
    var13.setDependentLocalityNumber(var46);
    
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

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("geo.google.GeoException: geo.google.GeoException: ", 100L);
    geo.google.datamodel.GeoCoordinate var17 = new geo.google.datamodel.GeoCoordinate();
    double var18 = var17.getLongitude();
    geo.google.datamodel.GeoCoordinate var19 = new geo.google.datamodel.GeoCoordinate();
    double var20 = var19.getLongitude();
    double var21 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var17, var19);
    double var22 = var19.getLatitude();
    var19.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var26 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var27 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var19, var26);
    geo.google.datamodel.GeoAddressAccuracy var29 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var30 = var29.getName();
    geo.google.datamodel.GeoUsAddress var31 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var19, var29);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var32 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var33 = var32.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var34 = var32.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var35 = var32.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var36 = var32.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var37 = var32.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var38 = var32.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var39 = var32.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var40 = var32.createAddressDetailsPostalServiceElementsSortingCode();
    boolean var41 = var31.equals((java.lang.Object)var40);
    java.lang.String var42 = var31.toString();
    var31.setPostalCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var45 = var2.standardizeToGeoAddress(var31);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "UNKNOWN_LOCATION"+ "'", var30.equals("UNKNOWN_LOCATION"));
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "geo.google.datamodel.GeoUsAddress@9cf2917[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@7f92aa08[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@75d934a6[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var42.equals("geo.google.datamodel.GeoUsAddress@9cf2917[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@7f92aa08[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@75d934a6[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getContent();
    var0.setContent("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    geo.google.datamodel.GeoAltitude var0 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var2 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var3 = var2.getMode();
    var0.setMode(var3);
    int var5 = var3.ordinal();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var7 = var6.createThoroughfareNumberSuffix();
    java.lang.String var8 = var7.getNumberSuffixSeparator();
    var7.setNumberSuffixSeparator("G_GEO_UNKOWN_STATUS");
    java.util.Map var11 = var7.getOtherAttributes();
    boolean var12 = var3.equals((java.lang.Object)var11);
    java.lang.String var13 = var3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "CLAMP_TO_GROUND"+ "'", var13.equals("CLAMP_TO_GROUND"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


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
    var13.setAltitude((-1.0d));
    
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

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var2 = var0.createPostalCodePostTownPostTownSuffix();
    java.lang.String var3 = var2.getContent();
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

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


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
    java.util.Map var11 = var5.getOtherAttributes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var4 = var0.createDepartmentDepartmentName();
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

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    var2.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var7 = var2.getContent();
    java.lang.String var8 = var2.getContent();
    var2.setCode("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var7.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var8.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown();
    var0.setType("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var4 = var3.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var3.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var6 = var3.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var7 = var3.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var8 = var3.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var9 = var3.createDepartment();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var10 = var3.createPostalCodePostTownPostTownSuffix();
    var10.setCode("UNKNOWN_LOCATION");
    var0.setPostTownSuffix(var10);
    
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

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    var0.setAccuracy((java.lang.Integer)1);
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var4 = var0.getLocality();
    var0.setAccuracy((java.lang.Integer)1);
    java.util.List var7 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var8 = var0.getPostalServiceElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    var2.setApiKey("Uknown Status");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var2.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@5ff907ee[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    java.lang.String var1 = var0.getIndicator();
    var0.setType("(default) Indicates to ignore an altitude specification");
    java.util.List var4 = var0.getAddressLine();
    var0.setType("hi!");
    java.lang.String var7 = var0.getCode();
    java.lang.String var8 = var0.getCode();
    java.lang.String var9 = var0.getIndicatorOccurrence();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var6 = var0.createBuildingNameType();
    var6.setContent("(default) Indicates to ignore an altitude specification");
    var6.setTypeOccurrence("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getContent();
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setContent("");
    java.lang.String var6 = var0.getType();
    java.lang.String var7 = var0.getType();
    var0.setContent("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    var4.setContent("hi!");
    var4.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var13 = var4.getContent();
    java.lang.String var14 = var4.getType();
    
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
    assertTrue("'" + var13 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var13.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var6 = var0.createLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var7 = var0.createThoroughfarePreDirectionType();
    var7.setCode("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var7.getType();
    
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

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var2 = var0.createPostBoxPostBoxNumberPrefix();
    java.lang.String var3 = var2.getCode();
    var2.setContent("hi!");
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

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var2 = var0.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension();
    var0.setPostBoxNumberExtension(var3);
    var0.setType("geo.google.GeoException: hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var7 = var0.getFirm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


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
    java.lang.String var12 = var10.getNameNumberOccurrence();
    var10.setCode("geo.google.GeoException: ");
    java.lang.String var15 = var10.getCode();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "geo.google.GeoException: "+ "'", var15.equals("geo.google.GeoException: "));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    var0.setContent("geo.google.GeoException: ");
    var0.setType("Uknown Status");

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getContent();
    var0.setCode("Uknown Status");
    var0.setContent("hi!");
    var0.setCode("");
    java.lang.String var9 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getType();
    var0.setType("hi!");
    var0.setNumberExtensionSeparator("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    com.google.earth.kml._2.StatusType var0 = new com.google.earth.kml._2.StatusType();
    java.lang.String var1 = var0.getRequest();
    int var2 = var0.getCode();
    var0.setCode((-1));
    var0.setCode(100);
    int var7 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("geo.google.GeoException: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var5 = var0.createSubPremiseTypeSubPremiseNumberSuffix();
    var5.setContent("");
    java.util.Map var8 = var5.getOtherAttributes();
    java.lang.String var9 = var5.getNumberSuffixSeparator();
    var5.setType("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
    
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

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    java.lang.String var4 = var3.getType();
    java.lang.String var5 = var3.getTypeOccurrence();
    
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

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    java.lang.String var4 = var3.getNumberSuffixSeparator();
    java.lang.String var5 = var3.getCode();
    var3.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var3.setType("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var6 = var5.createAddressDetailsPostalServiceElementsSortingCode();
    var0.setSortingCode(var6);
    var6.setType("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var5 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    java.lang.String var6 = var5.getCode();
    
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

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var2 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    java.util.List var3 = var2.getContent();
    var0.setThoroughfareNumberFrom(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo();
    java.util.List var6 = var5.getContent();
    java.util.List var7 = var5.getContent();
    var0.setThoroughfareNumberTo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var3 = var0.createPremisePremiseName();
    var3.setContent("");
    java.lang.String var6 = var3.getCode();
    var3.setType("G_GEO_UNKOWN_STATUS");
    var3.setCode("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setCode("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", 100L);
    geo.google.datamodel.GeoCoordinate var17 = new geo.google.datamodel.GeoCoordinate();
    double var18 = var17.getLongitude();
    geo.google.datamodel.GeoCoordinate var19 = new geo.google.datamodel.GeoCoordinate();
    double var20 = var19.getLongitude();
    double var21 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var17, var19);
    double var22 = var19.getLatitude();
    var19.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var26 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var27 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var19, var26);
    geo.google.datamodel.GeoAddressAccuracy var29 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var30 = var29.getName();
    geo.google.datamodel.GeoUsAddress var31 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var19, var29);
    geo.google.datamodel.GeoAddressAccuracy var32 = var31.getAccuracy();
    geo.google.datamodel.GeoAddress var33 = new geo.google.datamodel.GeoAddress();
    java.lang.String var34 = var33.toString();
    geo.google.datamodel.GeoAddressAccuracy var35 = var33.getAccuracy();
    geo.google.datamodel.GeoAddressAccuracy var37 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(10);
    var33.setAccuracy(var37);
    java.lang.String var39 = var37.getName();
    var31.setAccuracy(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var41 = var2.standardizeToGeoUsAddresses(var31);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "UNKNOWN_LOCATION"+ "'", var30.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "geo.google.datamodel.GeoAddress@7e471063[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var34.equals("geo.google.datamodel.GeoAddress@7e471063[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "UNKNOWN_LOCATION"+ "'", var39.equals("UNKNOWN_LOCATION"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    var2.setIndicator("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var6 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    java.lang.String var7 = var6.getIndicator();
    java.lang.String var8 = var6.getIndicator();
    java.lang.String var9 = var6.getContent();
    var2.setPostOfficeNumber(var6);
    var6.setIndicator("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    var1.setRateLimitInterval(100L);
    java.lang.String var6 = var1.getApiKey();
    geo.google.datamodel.GeoCoordinate var14 = new geo.google.datamodel.GeoCoordinate();
    double var15 = var14.getLongitude();
    geo.google.datamodel.GeoCoordinate var16 = new geo.google.datamodel.GeoCoordinate();
    double var17 = var16.getLongitude();
    double var18 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var14, var16);
    geo.google.datamodel.GeoCoordinate var19 = new geo.google.datamodel.GeoCoordinate();
    double var20 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var14, var19);
    geo.google.datamodel.GeoStatusCode var23 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var24 = new geo.google.GeoException("", var23);
    boolean var25 = var14.equals((java.lang.Object)var23);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var26 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var27 = var26.createPremise();
    java.util.List var28 = var27.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var29 = var27.getFirm();
    var27.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var32 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var33 = var32.createPremise();
    java.lang.String var34 = var33.getPremiseThoroughfareConnector();
    var27.setPremise(var33);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var36 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var37 = var36.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var38 = var36.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var39 = var36.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var40 = var39.getType();
    java.util.List var41 = var39.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var42 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var43 = var42.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var44 = var42.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var45 = var42.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var46 = var42.createThoroughfare();
    java.util.List var47 = var46.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var48 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var49 = var48.getPostTown();
    var46.setPostalCode(var48);
    var39.setPostalCode(var48);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var52 = var39.getPostalCode();
    var27.setPostalCode(var52);
    boolean var54 = var14.equals((java.lang.Object)var27);
    geo.google.datamodel.GeoCoordinate var55 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var56 = new geo.google.datamodel.GeoCoordinate();
    double var57 = var56.getLongitude();
    double var58 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var55, var56);
    geo.google.datamodel.GeoAltitude var59 = var56.getAltitude();
    geo.google.datamodel.GeoCoordinate var60 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var61 = new geo.google.datamodel.GeoCoordinate();
    double var62 = var61.getLongitude();
    double var63 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var60, var61);
    double var64 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var56, var61);
    double var65 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var14, var61);
    geo.google.datamodel.GeoCoordinate var66 = var14.clone();
    geo.google.datamodel.GeoAddressAccuracy var68 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var69 = var68.getName();
    int var70 = var68.getCode();
    geo.google.datamodel.GeoUsAddress var71 = new geo.google.datamodel.GeoUsAddress("geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", var14, var68);
    geo.google.datamodel.GeoCoordinate var72 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var73 = new geo.google.datamodel.GeoCoordinate();
    double var74 = var73.getLongitude();
    double var75 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var72, var73);
    double var76 = var72.getLatitude();
    geo.google.datamodel.GeoCoordinate var77 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var78 = new geo.google.datamodel.GeoCoordinate();
    double var79 = var78.getLongitude();
    double var80 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var77, var78);
    geo.google.datamodel.GeoCoordinate var81 = var77.clone();
    double var82 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var72, var81);
    var71.setCoordinate(var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var84 = var1.standardizeToGeoUsAddresses(var71);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "UNKNOWN_LOCATION"+ "'", var69.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType();
    var0.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.Department var3 = var0.getDepartment();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var4 = var0.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = var0.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var0.getPostalCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    com.google.earth.kml._2.ResponseType var0 = new com.google.earth.kml._2.ResponseType();
    com.google.earth.kml._2.StatusType var1 = new com.google.earth.kml._2.StatusType();
    java.lang.String var2 = var1.getRequest();
    int var3 = var1.getCode();
    var0.setStatus(var1);
    java.lang.String var5 = var1.getRequest();
    java.lang.String var6 = var1.getRequest();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


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
    var28.setPostalCode("(default) Indicates to ignore an altitude specification");
    java.lang.String var31 = var28.toString();
    var28.setCity("G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertTrue("'" + var31 + "' != '" + "geo.google.datamodel.GeoUsAddress@541af6ab[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@36387fb0[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3747179f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var31.equals("geo.google.datamodel.GeoUsAddress@541af6ab[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@36387fb0[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3747179f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var4 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var5 = var3.getPostOffice();
    java.lang.String var6 = var3.getUsageType();
    java.util.List var7 = var3.getAddressLine();
    java.lang.String var8 = var3.getIndicator();
    
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

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var5 = var0.createAddressLinesType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var6 = var0.createThoroughfareDependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var7 = var0.createAddressLinesType();
    java.util.List var8 = var7.getAny();
    
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

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var6 = var0.createBuildingNameType();
    var6.setContent("(default) Indicates to ignore an altitude specification");
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

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var5 = var0.createSubPremiseTypeSubPremiseNumberSuffix();
    var5.setCode("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    geo.google.datamodel.GeoStatusCode var3 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var4 = new geo.google.GeoException("", var3);
    java.lang.String var5 = var4.toString();
    geo.google.datamodel.GeoStatusCode var9 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var10 = new geo.google.GeoException("", var9);
    geo.google.datamodel.GeoStatusCode var13 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var14 = new geo.google.GeoException("", var13);
    geo.google.GeoException var15 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var10, var13);
    var4.addSuppressed((java.lang.Throwable)var15);
    geo.google.datamodel.GeoStatusCode var18 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var20 = var18.equals((java.lang.Object)10L);
    java.lang.String var21 = var18.name();
    int var22 = var18.getCode();
    geo.google.GeoException var23 = new geo.google.GeoException("", (java.lang.Throwable)var4, var18);
    geo.google.datamodel.GeoStatusCode var24 = var4.getStatus();
    geo.google.datamodel.GeoStatusCode var28 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var29 = new geo.google.GeoException("", var28);
    java.lang.String var30 = var29.toString();
    geo.google.GeoException var31 = new geo.google.GeoException("geo.google.GeoException: hi!", (java.lang.Throwable)var29);
    var4.addSuppressed((java.lang.Throwable)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "geo.google.GeoException: "+ "'", var5.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var21.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "geo.google.GeoException: "+ "'", var30.equals("geo.google.GeoException: "));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    java.util.List var3 = var0.getAny();
    java.lang.Integer var4 = var0.getAccuracy();
    java.lang.String var5 = var0.getAddressDetailsKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    java.lang.String var7 = var6.getContent();
    java.lang.String var8 = var6.getCode();
    java.util.Map var9 = var6.getOtherAttributes();
    var6.setContent("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var5 = var0.createFirmType();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var6 = var0.createPremiseNumberPrefix();
    var6.setType("geo.google.GeoException: hi!");
    java.lang.String var9 = var6.getValue();
    
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

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    java.lang.String var8 = var1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    java.lang.String var3 = var1.getContent();
    java.util.Map var4 = var1.getOtherAttributes();
    java.lang.String var5 = var1.getCode();
    java.util.Map var6 = var1.getOtherAttributes();
    java.lang.String var7 = var1.getContent();
    java.lang.String var8 = var1.getType();
    
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var4 = var0.createDepartmentDepartmentName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    var4.setContent("hi!");
    var4.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var13 = var4.getContent();
    var4.setContent("hi!");
    var4.setCode("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertTrue("'" + var13 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var13.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var3 = var0.createPremisePremiseName();
    var3.setContent("");
    java.lang.String var6 = var3.getCode();
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

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var5 = var0.createThoroughfarePostDirectionType();
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

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setType("geo.google.GeoException: ");
    java.lang.String var10 = var6.getType();
    java.lang.String var11 = var6.getContent();
    java.lang.String var12 = var6.getType();
    
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
    assertTrue("'" + var10 + "' != '" + "geo.google.GeoException: "+ "'", var10.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "geo.google.GeoException: "+ "'", var12.equals("geo.google.GeoException: "));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setContent("hi!");
    java.lang.String var4 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getNumberOccurrence();
    java.lang.String var3 = var0.getCode();
    var0.setType("CLAMP_TO_GROUND");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    var3.setContent("G_GEO_UNKOWN_STATUS");
    var3.setType("");
    var3.setContent("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var4 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var5 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var6 = var0.createSubPremiseTypeSubPremiseNumber();
    var6.setContent("geo.google.datamodel.GeoAddress@357d260d[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    var0.setType("");
    java.lang.String var3 = var0.getType();
    java.util.List var4 = var0.getThoroughfareName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var5.setThoroughfarePostDirection(var6);
    java.util.List var8 = var5.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var9 = var5.getThoroughfareLeadingType();
    java.util.List var10 = var5.getThoroughfareNumberOrThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var12 = var11.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var13 = var11.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var14 = var11.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var15 = var11.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var16 = var15.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var17 = var15.getDependentLocalityNumber();
    var5.setDependentLocality(var15);
    java.lang.String var19 = var5.getType();
    java.util.Map var20 = var5.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var21 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var21.setType("hi!");
    var5.setThoroughfarePostDirection(var21);
    var21.setCode("UNKNOWN_LOCATION");
    var21.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var21.setCode("geo.google.datamodel.GeoAddress@26f2d88c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setThoroughfarePostDirection(var21);
    var0.setType("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var7 = var6.getPostTown();
    var4.setPostalCode(var6);
    java.util.List var9 = var6.getAny();
    java.util.List var10 = var6.getAny();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getCode();
    java.lang.String var3 = var0.getCode();
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var6.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


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
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var11 = var0.createPostBoxPostBoxNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var12 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var13 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


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
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var12 = var0.createPostalCodePostalCodeNumber();
    java.lang.String var13 = var12.getType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var5 = var4.getContent();
    var4.setCode("(default) Indicates to ignore an altitude specification");
    var4.setCode("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    java.util.List var4 = var3.getSubAdministrativeAreaName();
    java.lang.String var5 = var3.getType();
    var3.setIndicator("");
    var3.setIndicator("Uknown Status");
    java.util.List var10 = var3.getSubAdministrativeAreaName();
    var3.setUsageType("geo.google.GeoException: ");
    
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
    assertNotNull(var10);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var4 = var0.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    var5.setType("Uknown Status");
    java.lang.String var8 = var5.getCode();
    
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

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName();
    var0.setCode("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    var0.setType("");
    java.lang.String var5 = var0.getType();
    var0.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var8.equals("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var6 = var0.createPostalCodePostalCodeNumber();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setCode("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var6.getContent();
    var6.setType("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    var1.setRateLimitInterval(100L);
    java.lang.String var6 = var1.getApiKey();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var8 = var1.standardizeToGeoCoordinate("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    geo.google.datamodel.GeoStatusCode var2 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var3 = new geo.google.GeoException("", var2);
    java.lang.Class var4 = var2.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    java.util.Map var3 = var2.getOtherAttributes();
    var2.setCode("geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    java.lang.String var1 = var0.toString();
    var0.setAddressLine("hi!");
    java.lang.String var4 = var0.getAddressLine();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var1.equals("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var5.equals("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom();
    java.util.List var1 = var0.getPremiseNumber();
    java.util.List var2 = var0.getAddressLine();
    java.util.List var3 = var0.getPremiseNumberSuffix();
    java.util.List var4 = var0.getPremiseNumberPrefix();
    java.util.List var5 = var0.getPremiseNumberSuffix();
    java.util.List var6 = var0.getPremiseNumber();
    java.util.List var7 = var0.getPremiseNumberSuffix();
    
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

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    var5.setCode("geo.google.GeoException: ");
    java.lang.String var8 = var5.getType();
    var5.setType("geo.google.datamodel.GeoAddress@26f2d88c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName();
    java.lang.String var1 = var0.getType();
    var0.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var4 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
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

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


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
    var4.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var17 = var4.getDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var18 = var4.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var19 = var4.getPostBox();
    java.util.List var20 = var19.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var21 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var22 = var21.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var23 = var21.createPostOffice();
    java.util.List var24 = var23.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var25 = var23.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var26 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var27 = var26.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var28 = var26.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var29 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var30 = var29.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var31 = var29.createPostBoxPostBoxNumberExtension();
    var26.setPostBoxNumberExtension(var31);
    var23.setPostBox(var26);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber var34 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber();
    var26.setPostBoxNumber(var34);
    var19.setPostBoxNumber(var34);
    var34.setContent("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var39 = var34.getOtherAttributes();
    
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    java.lang.String var3 = var0.getType();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getCode();
    var0.setCode("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    var4.setContent("hi!");
    var4.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var4.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var4 = var3.createPremise();
    var1.setPremise(var4);
    var4.setPremiseThoroughfareConnector("hi!");
    java.util.List var8 = var4.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var10 = var9.createMailStopType();
    var4.setMailStop(var10);
    java.util.Map var12 = var10.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getCode();
    var0.setCode("");
    var0.setContent("geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = var2.getPostOfficeNumber();
    var2.setType("G_GEO_UNKOWN_STATUS");
    java.util.List var7 = var2.getAny();
    java.util.List var8 = var2.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.lang.String var2 = var1.getPremiseThoroughfareConnector();
    java.util.List var3 = var1.getAny();
    java.util.List var4 = var1.getBuildingName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    var0.setAddressLine("UNKNOWN_LOCATION");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = var0.getAddressDetails();
    java.lang.String var4 = var0.toString();
    var0.setAddressLine("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "geo.google.datamodel.GeoAddress@64b274a1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var4.equals("geo.google.datamodel.GeoAddress@64b274a1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var29 = var28.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var30 = var28.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var31 = var28.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var32 = var28.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var33 = var28.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var34 = var28.createMailStopTypeMailStopNumber();
    var25.setMailStopNumber(var34);
    var34.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var34.setNameNumberSeparator("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var0.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var0.setContent("(default) Indicates to ignore an altitude specification");
    var0.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var5 = var4.getCode();
    java.lang.String var6 = var4.getCode();
    var0.setThoroughfareTrailingType(var4);
    java.util.List var8 = var0.getThoroughfareNumberSuffix();
    java.util.List var9 = var0.getThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var10 = var0.getThoroughfarePreDirection();
    java.lang.String var11 = var0.getDependentThoroughfares();
    var0.setDependentThoroughfares("geo.google.datamodel.GeoAddress@70027021[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var4 = var0.createPostalRouteType();
    java.util.List var5 = var4.getAddressLine();
    
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

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


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
      java.util.List var13 = var10.execute("geo.google.GeoException: hi!");
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

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


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
    var0.setCode("geo.google.GeoException: ");
    java.lang.String var12 = var0.getAddressDetailsKey();
    
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
    assertNull(var12);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.getMailStop();
    java.util.List var2 = var0.getAny();
    java.util.List var3 = var0.getDepartmentName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var4 = var0.getMailStop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.getMailStop();
    var0.setType("");
    java.util.Map var4 = var0.getOtherAttributes();
    java.util.List var5 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.lang.String var5 = var1.getCode();
    java.util.Map var6 = var1.getOtherAttributes();
    var1.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var9 = var1.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    java.util.List var4 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var5 = var1.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var6 = var1.getPostalCode();
    var0.setThoroughfare(var1);
    java.util.List var8 = var0.getAny();
    java.lang.String var9 = var0.getIndicator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var4 = var3.getPostalRouteNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var5.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var5.setContent("(default) Indicates to ignore an altitude specification");
    java.lang.String var10 = var5.getContent();
    var3.setPostalRouteNumber(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var12.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var15 = var12.getCode();
    var3.setPostalRouteNumber(var12);
    java.util.Map var17 = var3.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var18 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var18.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var18.setContent("G_GEO_UNKOWN_STATUS");
    var18.setContent("hi!");
    java.lang.String var25 = var18.getContent();
    var3.setPostalRouteNumber(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var10.equals("(default) Indicates to ignore an altitude specification"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.List var5 = var0.getAddressLine();
    java.util.List var6 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var7 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var8 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var9 = var0.getThoroughfareLeadingType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var2.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@1dd53212[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var30 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var31 = var30.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var32 = var30.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var33 = var30.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var34 = var30.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var35 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var36 = var35.getAddressLine();
    java.util.List var37 = var35.getAny();
    var34.setPostBox(var35);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var39 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var34.setPostBox(var39);
    java.lang.String var41 = var34.getConnector();
    java.util.List var42 = var34.getAny();
    var6.setDependentLocality(var34);
    var34.setUsageType("geo.google.GeoException: geo.google.GeoException: ");
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var19 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var20 = var19.createPremise();
    java.util.List var21 = var20.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var22 = var20.getFirm();
    var20.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var25 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var26 = var25.createPremise();
    java.lang.String var27 = var26.getPremiseThoroughfareConnector();
    var20.setPremise(var26);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var29 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var30 = var29.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var31 = var29.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var32 = var29.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var33 = var32.getType();
    java.util.List var34 = var32.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var35 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var36 = var35.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var37 = var35.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var38 = var35.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var39 = var35.createThoroughfare();
    java.util.List var40 = var39.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var41 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var42 = var41.getPostTown();
    var39.setPostalCode(var41);
    var32.setPostalCode(var41);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var45 = var32.getPostalCode();
    var20.setPostalCode(var45);
    boolean var47 = var7.equals((java.lang.Object)var20);
    geo.google.datamodel.GeoCoordinate var48 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var49 = new geo.google.datamodel.GeoCoordinate();
    double var50 = var49.getLongitude();
    double var51 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var48, var49);
    geo.google.datamodel.GeoAltitude var52 = var49.getAltitude();
    geo.google.datamodel.GeoCoordinate var53 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var54 = new geo.google.datamodel.GeoCoordinate();
    double var55 = var54.getLongitude();
    double var56 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var53, var54);
    double var57 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var49, var54);
    double var58 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var7, var54);
    geo.google.datamodel.GeoCoordinate var59 = var7.clone();
    geo.google.datamodel.GeoAddressAccuracy var61 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var62 = var61.getName();
    int var63 = var61.getCode();
    geo.google.datamodel.GeoUsAddress var64 = new geo.google.datamodel.GeoUsAddress("geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", var7, var61);
    var7.setLatitude(1.0d);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "UNKNOWN_LOCATION"+ "'", var62.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getNumberTypeOccurrence();
    java.lang.String var5 = var0.getType();
    java.lang.String var6 = var0.getNumberType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var3.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var5.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


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
    java.lang.Integer var11 = var0.getAccuracy();
    java.lang.String var12 = var0.getUsage();
    java.lang.String var13 = var0.getValidToDate();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


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
    java.lang.String var17 = var15.getType();
    java.lang.String var18 = var15.getCode();
    
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

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getCurrentStatus();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var5 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    var5.setType("hi!");
    var0.setAddress(var5);
    java.lang.String var9 = var5.getContent();
    var5.setType("geo.google.datamodel.GeoAddress@26f2d88c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var3 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var4 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    
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

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.KmlType var1 = new com.google.earth.kml._2.KmlType();
    javax.xml.bind.JAXBElement var2 = var0.createKml(var1);
    com.google.earth.kml._2.StatusType var3 = var0.createStatusType();
    int var4 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var3 = var2.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var4 = var2.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var5 = var2.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var6 = var5.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var7 = var5.getPostOffice();
    java.lang.String var8 = var5.getUsageType();
    java.util.List var9 = var5.getAddressLine();
    var0.setSubAdministrativeArea(var5);
    java.lang.String var11 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var12 = var0.getSubAdministrativeArea();
    var0.setType("geo.google.GeoException: hi!");
    java.util.List var15 = var0.getAdministrativeAreaName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    geo.google.mapping.XmlToAddressFunctor var0 = geo.google.mapping.XmlToAddressFunctor.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = var0.execute("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    var1.setNumberSuffixSeparator("G_GEO_UNKOWN_STATUS");
    var1.setCode("Uknown Status");
    java.lang.String var7 = var1.getType();
    java.lang.String var8 = var1.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getCurrentStatus();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var3 = var0.getAddress();
    java.lang.String var4 = var0.getValidFromDate();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var5 = var0.getCountry();
    java.lang.String var6 = var0.getAddressType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    com.google.earth.kml._2.StatusType var0 = new com.google.earth.kml._2.StatusType();
    java.lang.String var1 = var0.getRequest();
    int var2 = var0.getCode();
    var0.setCode((-1));
    var0.setCode(10);
    var0.setRequest("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var1 = new geo.google.datamodel.GeoCoordinate();
    double var2 = var1.getLongitude();
    double var3 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var1);
    geo.google.datamodel.GeoCoordinate var4 = new geo.google.datamodel.GeoCoordinate();
    double var5 = var4.getLongitude();
    geo.google.datamodel.GeoCoordinate var6 = new geo.google.datamodel.GeoCoordinate();
    double var7 = var6.getLongitude();
    double var8 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var4, var6);
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var4, var9);
    geo.google.datamodel.GeoStatusCode var13 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var14 = new geo.google.GeoException("", var13);
    boolean var15 = var4.equals((java.lang.Object)var13);
    geo.google.datamodel.GeoAltitude var17 = new geo.google.datamodel.GeoAltitude(0.0d);
    var4.setAltitude(var17);
    double var19 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var4);
    geo.google.datamodel.GeoCoordinate var20 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var21 = new geo.google.datamodel.GeoCoordinate();
    double var22 = var21.getLongitude();
    double var23 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var20, var21);
    geo.google.datamodel.GeoAltitude var24 = var21.getAltitude();
    geo.google.datamodel.GeoAltitude var25 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var26 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var27 = var26.getMode();
    boolean var28 = var25.equals((java.lang.Object)var26);
    var21.setAltitude(var26);
    var21.setLatitude(10.0d);
    double var32 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var0, var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 760.0265655385957d);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    long var2 = var1.getRateLimitInterval();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var4 = var1.standardizeToGeoAddress("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5769L);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.PointType var2 = new com.google.earth.kml._2.PointType();
    var2.setTessellate((java.lang.Boolean)true);
    var2.setExtrude((java.lang.Boolean)false);
    java.lang.Boolean var7 = var2.isExtrude();
    var2.setCoordinates("Uknown Status");
    javax.xml.bind.JAXBElement var10 = var0.createPoint(var2);
    com.google.earth.kml._2.KmlType var11 = var0.createKmlType();
    com.google.earth.kml._2.PointType var12 = var0.createPointType();
    var12.setTessellate((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var1 = var0.getType();
    var0.setType("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.getStatusCode(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


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
    var6.setCode("UNKNOWN_LOCATION");
    java.lang.String var15 = var6.getType();
    var6.setContent("geo.google.datamodel.GeoAddress@70027021[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var15);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var2 = var0.createThoroughfareLeadingTypeType();
    java.lang.String var3 = var2.getContent();
    java.lang.String var4 = var2.getContent();
    java.lang.String var5 = var2.getContent();
    
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

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    geo.google.datamodel.GeoCoordinate var7 = new geo.google.datamodel.GeoCoordinate();
    double var8 = var7.getLongitude();
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    double var11 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var7, var9);
    double var12 = var9.getLatitude();
    var9.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var16 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var17 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var9, var16);
    java.lang.String var18 = var17.toAddressLine();
    java.lang.String var19 = var17.getCountry();
    geo.google.datamodel.GeoAddressAccuracy var20 = var17.getAccuracy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"+ "'", var18.equals("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    java.lang.String var6 = var5.getType();
    java.lang.String var7 = var5.getType();
    
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

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


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
    var11.setIndicator("UNKNOWN_LOCATION");
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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var42 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var43 = var42.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var44 = var42.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var45 = var42.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var46 = var42.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var47 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var48 = var47.getAddressLine();
    java.util.List var49 = var47.getAny();
    var46.setPostBox(var47);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var51 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var46.setPostBox(var51);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var53 = var46.getDependentLocalityNumber();
    var28.setDependentLocality(var46);
    var46.setUsageType("G_GEO_UNKOWN_STATUS");
    java.util.List var57 = var46.getDependentLocalityName();
    var11.setDependentLocality(var46);
    java.util.List var59 = var11.getAny();
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.getMailStop();
    var0.setType("");
    java.util.Map var4 = var0.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var0.getMailStop();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.util.List var8 = var7.getAddressLine();
    java.util.List var9 = var7.getAny();
    var7.setType("");
    var7.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var14 = var7.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var16 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var15.setMailStopName(var16);
    var7.setMailStop(var15);
    var0.setMailStop(var15);
    java.lang.String var20 = var15.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setType("hi!");
    var0.setNumberSuffixSeparator("");
    var0.setCode("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var3.setCode("hi!");
    var1.setPremiseLocation(var3);
    var1.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    var1.setPremiseThoroughfareConnector("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var12 = var11.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var13 = var11.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var14 = var11.createPremisePremiseLocation();
    var1.setPremiseLocation(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var4 = var0.createSubPremiseTypeSubPremiseName();
    var4.setTypeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var4.setType("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var3 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var4 = var0.createThoroughfareNameType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.valueOf("geo.google.datamodel.GeoAddress@357d260d[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var6 = var0.createDepartment();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var7 = var0.createPostalCodePostTownPostTownSuffix();
    var7.setCode("UNKNOWN_LOCATION");
    var7.setContent("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var12 = var7.getOtherAttributes();
    
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
    assertNotNull(var12);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var3 = var0.createAddressDetailsCountry();
    java.util.List var4 = var3.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = var3.getThoroughfare();
    java.util.Map var6 = var3.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var7 = var3.getLocality();
    
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

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var3 = var2.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var2.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var5 = var4.getCode();
    java.util.Map var6 = var4.getOtherAttributes();
    var4.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var4);
    java.lang.String var10 = var4.getCode();
    java.util.Map var11 = var4.getOtherAttributes();
    
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
    assertTrue("'" + var10 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var10.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


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
    var49.setType("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getNumberExtensionSeparator();
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

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setType("hi!");
    var0.setContent("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setCode("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    geo.google.GeoException var1 = new geo.google.GeoException("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var2.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    var0.setUsageType("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.getSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var4.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var6 = var4.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var7 = var4.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var8 = var7.getType();
    java.util.List var9 = var7.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var11 = var10.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var12 = var10.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var13 = var10.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var14 = var10.createThoroughfare();
    java.util.List var15 = var14.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var16 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var17 = var16.getPostTown();
    var14.setPostalCode(var16);
    var7.setPostalCode(var16);
    var0.setSubAdministrativeArea(var7);
    var7.setUsageType("(default) Indicates to ignore an altitude specification");
    java.util.List var23 = var7.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var3 = var1.standardizeToGeoAddress("UNKNOWN_LOCATION");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getContent();
    java.util.Map var3 = var0.getOtherAttributes();
    java.lang.String var4 = var0.getCode();
    java.lang.String var5 = var0.getCode();
    java.lang.String var6 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    geo.google.datamodel.GeoAltitude var0 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var2 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var3 = var2.getMode();
    var0.setMode(var3);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var5 = var0.getMode();
    java.lang.String var6 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "CLAMP_TO_GROUND"+ "'", var6.equals("CLAMP_TO_GROUND"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    var1.setName("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    geo.google.mapping.XmlToUsAddressFunctor var3 = geo.google.mapping.XmlToUsAddressFunctor.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.standardize("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification", (geo.google.mapping.XmlMappingFunctor)var3);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setUsage("hi!");
    java.lang.String var7 = var0.getUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    java.lang.String var6 = var5.getContent();
    java.lang.String var7 = var5.getCode();
    java.lang.String var8 = var5.getContent();
    
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

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    java.lang.String var9 = var4.getCode();
    var4.setCode("CLAMP_TO_GROUND");
    
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

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoAltitude var2 = new geo.google.datamodel.GeoAltitude(0.0d);
    var2.setAltitude(10.0d);
    var0.setAltitude(var2);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var6 = var2.getMode();
    java.lang.Class var7 = var6.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    long var4 = var1.getRateLimitInterval();
    geo.google.datamodel.GeoCoordinate var12 = new geo.google.datamodel.GeoCoordinate();
    double var13 = var12.getLongitude();
    geo.google.datamodel.GeoCoordinate var14 = new geo.google.datamodel.GeoCoordinate();
    double var15 = var14.getLongitude();
    double var16 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var12, var14);
    double var17 = var14.getLatitude();
    var14.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var21 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var22 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var14, var21);
    java.lang.String var23 = var22.toAddressLine();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoUsAddress var24 = var1.standardizeToGeoUsAddress(var22);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5769L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"+ "'", var23.equals("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


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
    java.lang.String var11 = var0.getCurrentStatus();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var12 = var0.getCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var14 = var13.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var15 = var13.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var16 = var13.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var17 = var13.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var18 = var13.createAddressLinesType();
    java.util.List var19 = var18.getAny();
    java.util.List var20 = var18.getAddressLine();
    var0.setAddressLines(var18);
    var0.setAddressType("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setUsage("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown();
    java.util.List var1 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var3 = var2.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var4 = var2.createPostalCodePostTownPostTownSuffix();
    var4.setContent("G_GEO_UNKOWN_STATUS");
    var4.setCode("hi!");
    java.lang.String var9 = var4.getContent();
    var0.setPostTownSuffix(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var9.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setContent("");
    var2.setCode("G_GEO_UNKOWN_STATUS");
    java.util.Map var8 = var2.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddressAccuracy var1 = geo.google.datamodel.GeoAddressAccuracy.valueOf("CLAMP_TO_GROUND");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setRangeType("");
    var0.setType("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType();
    var0.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setTypeOccurrence("geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var5 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var5.equals("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var1 = var0.getType();
    var0.setType("hi!");
    java.lang.String var4 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    var4.setCode("hi!");
    java.lang.String var7 = var4.getCode();
    java.lang.String var8 = var4.getCode();
    java.util.Map var9 = var4.getOtherAttributes();
    java.lang.String var10 = var4.getCode();
    java.lang.String var11 = var4.getContent();
    java.lang.String var12 = var4.getCode();
    java.lang.String var13 = var4.getType();
    var4.setContent("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var14 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var16 = var15.createPremise();
    java.util.List var17 = var16.getAddressLine();
    java.util.List var18 = var16.getAny();
    var16.setType("");
    var16.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var23 = var16.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var24 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var25 = var24.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var26 = var24.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var27 = var24.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var28 = var24.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var29 = var24.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var30 = var24.createFirmType();
    var16.setFirm(var30);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var32 = var16.getMailStop();
    var16.setType("hi!");
    var14.setPremise(var16);
    var3.setLocality(var14);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var37 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var38 = var37.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var39 = var37.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var40 = var37.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var41 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var42 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var41.setThoroughfarePostDirection(var42);
    java.util.List var44 = var41.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var45 = var41.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var46 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var47 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var48 = var47.getCode();
    java.lang.String var49 = var47.getCode();
    var46.setThoroughfareTrailingType(var47);
    var41.setDependentThoroughfare(var46);
    var40.setDependentThoroughfare(var46);
    var40.setDependentThoroughfares("geo.google.GeoException: ");
    var14.setThoroughfare(var40);
    java.lang.String var56 = var14.getType();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    java.lang.String var1 = var0.getDependentThoroughfaresIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var3 = var2.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var4 = var2.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var5 = var2.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var6 = var2.createThoroughfarePostDirectionType();
    java.lang.String var7 = var6.getType();
    var6.setCode("Uknown Status");
    var0.setThoroughfarePostDirection(var6);
    java.lang.String var11 = var0.getDependentThoroughfaresType();
    java.lang.String var12 = var0.getDependentThoroughfaresType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getContent();
    var0.setCode("Uknown Status");
    java.lang.String var5 = var0.getCode();
    java.lang.String var6 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Uknown Status"+ "'", var5.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setRangeType("");
    java.lang.String var7 = var0.getType();
    var0.setSeparator("geo.google.datamodel.GeoAddress@5ff907ee[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setRangeType("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Uknown Status"+ "'", var7.equals("Uknown Status"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    var0.setDependentThoroughfaresIndicator("hi!");
    var0.setDependentThoroughfaresType("");
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var8 = var0.getPremise();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    java.lang.String var8 = var7.getCode();
    var7.setType("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    java.util.Map var11 = var7.getOtherAttributes();
    
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
    assertNotNull(var11);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType();
    java.lang.String var1 = var0.getType();
    var0.setType("(default) Indicates to ignore an altitude specification");
    var0.setContent("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var3.setContent("");
    var3.setNameNumberOccurrence("");
    java.lang.String var8 = var3.getNameNumberOccurrence();
    var3.setNameNumberOccurrence("geo.google.datamodel.GeoAddress@25d14add[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


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
    java.lang.String var11 = var0.getType();
    java.util.List var12 = var0.getAddressIdentifier();
    java.util.List var13 = var0.getSupplementaryPostalServiceData();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    var15.setType("");
    java.lang.String var18 = var15.getType();
    var0.setSortingCode(var15);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = var0.createPremisePremiseLocation();
    java.lang.String var4 = var3.getContent();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var3 = var1.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var4 = var1.createPostalCode();
    var0.setPostalCode(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var6 = var0.getLargeMailUser();
    java.util.List var7 = var0.getLocalityName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    oasis.names.tc.ciq.xsdschema.xal._2.Department var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.getMailStop();
    var0.setType("");
    java.util.Map var4 = var0.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var0.getMailStop();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.util.List var8 = var7.getAddressLine();
    java.util.List var9 = var7.getAny();
    var7.setType("");
    var7.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var14 = var7.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var16 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var15.setMailStopName(var16);
    var7.setMailStop(var15);
    var0.setMailStop(var15);
    java.lang.String var20 = var0.getType();
    java.util.List var21 = var0.getDepartmentName();
    java.lang.String var22 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ObjectFactory var2 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var3 = var2.createResponseType();
    com.google.earth.kml._2.StatusType var4 = new com.google.earth.kml._2.StatusType();
    java.lang.String var5 = var4.getRequest();
    var3.setStatus(var4);
    var1.setStatus(var4);
    int var8 = var4.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    geo.google.datamodel.GeoStatusCode var2 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var3 = new geo.google.GeoException("", var2);
    java.lang.String var4 = var2.getCodeName();
    int var5 = var2.getCode();
    java.lang.String var6 = var2.getCodeName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var4.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var6.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setUsage("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var7.setThoroughfarePostDirection(var8);
    java.util.List var10 = var7.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var11 = var7.getThoroughfareLeadingType();
    var0.setThoroughfare(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var13 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var14 = var13.getCode();
    var0.setAddress(var13);
    java.lang.String var16 = var0.getValidToDate();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var17 = var0.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    var5.setCode("geo.google.GeoException: ");
    var5.setCode("hi!");
    var5.setType("");
    var5.setContent("Uknown Status");
    java.lang.String var14 = var5.getContent();
    java.lang.String var15 = var5.getType();
    
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
    assertTrue("'" + var14 + "' != '" + "Uknown Status"+ "'", var14.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getCode();
    var0.setContent("UNKNOWN_LOCATION");
    var0.setCode("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setContent("geo.google.datamodel.GeoAddress@2ea7c82[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix();
    java.lang.String var1 = var0.getNumberPrefixSeparator();
    var0.setValue("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setType("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
    var0.setType("geo.google.datamodel.GeoUsAddress@2fec0f69[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@32e7cf13[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@10cc0281[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var9 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var4.setPostBox(var9);
    java.lang.String var11 = var4.getConnector();
    var4.setUsageType("G_GEO_UNKOWN_STATUS");
    java.util.List var14 = var4.getAddressLine();
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
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var42 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var43 = var42.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var44 = var42.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var45 = var42.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var46 = var42.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var47 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var48 = var47.getAddressLine();
    java.util.List var49 = var47.getAny();
    var46.setPostBox(var47);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var51 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var46.setPostBox(var51);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var53 = var46.getDependentLocalityNumber();
    var28.setDependentLocality(var46);
    java.util.List var55 = var46.getDependentLocalityName();
    var4.setDependentLocality(var46);
    java.util.List var57 = var46.getAny();
    
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
    assertNull(var11);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    geo.google.datamodel.GeoStatusCode var3 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var4 = new geo.google.GeoException("", var3);
    java.lang.String var5 = var3.getCodeName();
    java.lang.String var6 = var3.name();
    java.lang.String var7 = var3.getDescription();
    java.lang.String var8 = var3.getDescription();
    geo.google.GeoException var9 = new geo.google.GeoException("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var5.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var6.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Uknown Status"+ "'", var7.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Uknown Status"+ "'", var8.equals("Uknown Status"));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    geo.google.datamodel.GeoAltitude var3 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var4 = var3.getMode();
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate(0.0d, 1.0d, var3);
    java.lang.String var6 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


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
    geo.google.datamodel.GeoCoordinate var41 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var42 = new geo.google.datamodel.GeoCoordinate();
    double var43 = var42.getLongitude();
    double var44 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var41, var42);
    geo.google.datamodel.GeoAltitude var45 = var42.getAltitude();
    geo.google.datamodel.GeoCoordinate var46 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var47 = new geo.google.datamodel.GeoCoordinate();
    double var48 = var47.getLongitude();
    double var49 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var46, var47);
    double var50 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var42, var47);
    double var51 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var0, var47);
    geo.google.datamodel.GeoAltitude var52 = var47.getAltitude();
    var52.setAltitude(759.9899999999997d);
    
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
    assertTrue(var43 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getCode();
    var0.setCode("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    geo.google.GeoException var1 = new geo.google.GeoException("geo.google.datamodel.GeoAddress@4244bb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    var1.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var6 = var5.createPremise();
    java.util.List var7 = var6.getAny();
    var6.setType("");
    var1.setPremise(var6);
    java.lang.String var11 = var6.getPremiseDependencyType();
    var6.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var14 = var6.getPostalCode();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var1 = var0.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.getPremise();
    var0.setUsageType("geo.google.GeoException: geo.google.GeoException: ");
    java.util.List var5 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var4 = var0.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitude();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var0.createThoroughfarePreDirectionType();
    var6.setType("geo.google.datamodel.GeoAddress@2c8fa0b9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    var1.setNumberSuffixSeparator("G_GEO_UNKOWN_STATUS");
    var1.setCode("Uknown Status");
    java.lang.String var7 = var1.getType();
    var1.setContent("geo.google.GeoException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var26 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var27 = var26.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var28 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var29 = var28.getOtherAttributes();
    var26.setAddressLongitude(var28);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var31 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var32 = var31.getAny();
    java.lang.String var33 = var31.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var34 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var31.setAddressLatitude(var34);
    var26.setAddressLatitude(var34);
    java.lang.String var37 = var34.getCode();
    var0.setAddressLatitude(var34);
    java.lang.String var39 = var34.getContent();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.getSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var4.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var6 = var4.createPostOffice();
    java.util.List var7 = var6.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var8 = var6.getPostOfficeNumber();
    var6.setType("G_GEO_UNKOWN_STATUS");
    java.util.List var11 = var6.getAny();
    java.util.List var12 = var6.getPostOfficeName();
    var0.setPostOffice(var6);
    var6.setIndicator("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


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
    java.lang.String var97 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var98 = var0.getPostalCode();
    
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
    assertTrue("'" + var97 + "' != '" + "Uknown Status"+ "'", var97.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var1 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var1.setThoroughfarePostDirection(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var1.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var6 = var5.getCode();
    java.lang.String var7 = var5.getCode();
    var1.setThoroughfareTrailingType(var5);
    java.util.List var9 = var1.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var11 = var10.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var12 = var10.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var13 = var10.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var14 = var10.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var15 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var16 = var15.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var17 = var15.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var19 = var18.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var20 = var18.createPostBoxPostBoxNumberExtension();
    var15.setPostBoxNumberExtension(var20);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var22 = var15.getPostBoxNumberExtension();
    java.util.List var23 = var15.getAny();
    var14.setPostBox(var15);
    var14.setType("");
    var1.setDependentLocality(var14);
    java.lang.String var28 = var1.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var29 = var1.getThoroughfareLeadingType();
    var0.setThoroughfare(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var2 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var4 = var0.createPostBoxPostBoxNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var5 = var0.createPostalRouteTypePostalRouteNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var6 = var0.createAddressDetailsCountryCountryNameCode();
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

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var3 = var2.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var4 = var2.getDepartment();
    java.util.List var5 = var2.getBuildingName();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var6 = var2.getDepartment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setContent("geo.google.GeoException: ");
    var0.setIndicatorOccurrence("");
    java.lang.String var5 = var0.getType();
    java.lang.String var6 = var0.getContent();
    java.lang.String var7 = var0.getNumberOccurrence();
    var0.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var10.equals("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = var2.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var5 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var6 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var6.setThoroughfarePostDirection(var7);
    java.util.List var9 = var6.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var10 = var6.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var11 = var6.getPostalCode();
    var5.setThoroughfare(var6);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var13 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var14 = var13.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var15 = var13.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var16 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var17 = var16.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var18 = var16.createPostBoxPostBoxNumberExtension();
    var13.setPostBoxNumberExtension(var18);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var20 = var13.getPostBoxNumberExtension();
    java.util.List var21 = var13.getAny();
    var5.setPostBox(var13);
    var2.setPostBox(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var24 = var2.getPostBox();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
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
    assertNotNull(var24);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.GeoException: ");
    long var4 = var1.getRateLimitInterval();
    long var5 = var1.getRateLimitInterval();
    var1.setApiKey("CLAMP_TO_GROUND");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var9 = var1.standardizeToGeoAddress("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5769L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5769L);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var4 = var0.createPremisePremiseNumberRangePremiseNumberRangeFrom();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var5 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    var0.setCode("hi!");
    var0.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setType("geo.google.GeoException: geo.google.GeoException: ");
    var0.setCode("geo.google.GeoException: ");
    var0.setCode("CLAMP_TO_GROUND");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.KmlType var1 = new com.google.earth.kml._2.KmlType();
    javax.xml.bind.JAXBElement var2 = var0.createKml(var1);
    com.google.earth.kml._2.ObjectFactory var3 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var4 = var3.createResponseType();
    com.google.earth.kml._2.ResponseType var5 = var3.createResponseType();
    javax.xml.bind.JAXBElement var6 = var0.createResponse(var5);
    com.google.earth.kml._2.StatusType var7 = new com.google.earth.kml._2.StatusType();
    java.lang.String var8 = var7.getRequest();
    int var9 = var7.getCode();
    var7.setCode((-1));
    var5.setStatus(var7);
    var7.setRequest("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var7 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var8 = var0.createDependentLocalityTypeDependentLocalityName();
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

    if (debug) System.out.printf("%nRandoopTest1.test353");


    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName();
    var0.setContent("hi!");
    java.lang.String var3 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.KmlType var1 = new com.google.earth.kml._2.KmlType();
    javax.xml.bind.JAXBElement var2 = var0.createKml(var1);
    com.google.earth.kml._2.ResponseType var3 = var0.createResponseType();
    var3.setName("geo.google.datamodel.GeoAddress@357d260d[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS", 100L);
    org.apache.commons.httpclient.params.HttpClientParams var3 = var2.getHttpClientParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var2.standardizeToGeoAddresses("geo.google.datamodel.GeoAddress@64b274a1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.valueOf("geo.google.datamodel.GeoUsAddress@1add92c3[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@48ce4dfc[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@606200bb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    java.util.List var3 = var1.getAny();
    var1.setType("");
    var1.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var8 = var1.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var10 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var9.setMailStopName(var10);
    var1.setMailStop(var9);
    var1.setType("(default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var4 = var0.createSubPremiseTypeSubPremiseNumber();
    var4.setIndicator("hi!");
    var4.setNumberTypeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var9 = var4.getPremiseNumberSeparator();
    java.lang.String var10 = var4.getType();
    var4.setContent("geo.google.GeoException: hi!");
    java.lang.String var13 = var4.getNumberTypeOccurrence();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var13.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var4.getThoroughfarePreDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    var4.setDependentThoroughfare(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var9 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var10 = var9.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var11 = var9.createThoroughfareLeadingTypeType();
    java.lang.String var12 = var11.getContent();
    java.util.Map var13 = var11.getOtherAttributes();
    var7.setThoroughfareLeadingType(var11);
    java.util.List var15 = var7.getThoroughfareName();
    java.util.List var16 = var7.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var17 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var19 = var18.getCode();
    java.lang.String var20 = var18.getCode();
    var17.setThoroughfareTrailingType(var18);
    java.util.List var22 = var17.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var24 = var23.getContent();
    var17.setThoroughfarePreDirection(var23);
    java.lang.String var26 = var23.getCode();
    var23.setType("");
    java.util.Map var29 = var23.getOtherAttributes();
    var7.setThoroughfarePreDirection(var23);
    java.util.Map var31 = var23.getOtherAttributes();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


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
    java.lang.String var17 = var15.getType();
    java.lang.String var18 = var15.getType();
    java.lang.String var19 = var15.getContent();
    
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
    assertNull(var19);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


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
    java.lang.String var11 = var7.getIndicator();
    var7.setIndicator("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    var6.setVersion("");
    java.util.List var9 = var6.getAddressDetails();
    java.lang.String var10 = var6.getVersion();
    
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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    java.lang.String var3 = var1.getContent();
    var1.setNumberSuffixSeparator("");
    java.lang.String var6 = var1.getContent();
    java.lang.String var7 = var1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


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
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var28 = var27.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var29 = var27.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var30 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var31 = var30.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var32 = var30.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var33 = var30.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var34 = var30.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var35 = var34.getIndicator();
    var29.setLargeMailUserIdentifier(var34);
    java.util.List var37 = var29.getLargeMailUserName();
    var13.setLargeMailUser(var29);
    java.util.Map var39 = var29.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var40 = var29.getThoroughfare();
    java.lang.String var41 = var29.getType();
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var4 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var5 = var0.createSubPremiseTypeSubPremiseNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var6 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var7 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberFrom();
    java.lang.String var8 = var7.getCode();
    
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

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    java.util.List var5 = var0.getSubPremiseNumberSuffix();
    java.util.Map var6 = var0.getOtherAttributes();
    var0.setType("(default) Indicates to ignore an altitude specification");
    var0.setType("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var11 = var0.getMailStop();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var12 = var0.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var13 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var15 = var14.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var16 = var14.createPostOffice();
    java.util.List var17 = var16.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var18 = var16.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var19 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var20 = var19.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var21 = var19.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var23 = var22.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var24 = var22.createPostBoxPostBoxNumberExtension();
    var19.setPostBoxNumberExtension(var24);
    var16.setPostBox(var19);
    var13.setPostOffice(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var29 = var28.createPremise();
    java.util.List var30 = var29.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var31 = var29.getFirm();
    var29.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var34 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var35 = var34.createPremise();
    java.lang.String var36 = var35.getPremiseThoroughfareConnector();
    var29.setPremise(var35);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var38 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var39 = var38.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var40 = var38.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var41 = var38.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var42 = var41.getType();
    java.util.List var43 = var41.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var44 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var45 = var44.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var46 = var44.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var47 = var44.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var48 = var44.createThoroughfare();
    java.util.List var49 = var48.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var50 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var51 = var50.getPostTown();
    var48.setPostalCode(var50);
    var41.setPostalCode(var50);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var54 = var41.getPostalCode();
    var29.setPostalCode(var54);
    var13.setPostalCode(var54);
    var0.setPostalCode(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


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
    java.lang.String var11 = var5.getType();
    java.lang.String var12 = var5.getCode();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName();
    var0.setType("");
    var0.setType("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var5 = var0.getCode();
    java.lang.String var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var6.equals("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    java.lang.String var2 = var1.getNumberSuffixSeparator();
    java.lang.String var3 = var1.getContent();
    java.util.Map var4 = var1.getOtherAttributes();
    java.lang.String var5 = var1.getType();
    
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

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var15 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var16 = var15.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var17 = var15.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var18 = var15.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var19 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var20 = var19.getAddressLine();
    var15.setPostBox(var19);
    var0.setLocality(var15);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var24 = var23.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var25 = var23.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var26 = var23.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var27 = var23.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var28 = var23.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var29 = var23.createPostOffice();
    java.lang.String var30 = var29.getIndicator();
    java.util.List var31 = var29.getAny();
    var15.setPostOffice(var29);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var33 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var34 = var33.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var35 = var33.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var36 = var33.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var37 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var38 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var37.setThoroughfarePostDirection(var38);
    java.util.List var40 = var37.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var41 = var37.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var42 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var43 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var44 = var43.getCode();
    java.lang.String var45 = var43.getCode();
    var42.setThoroughfareTrailingType(var43);
    var37.setDependentThoroughfare(var42);
    var36.setDependentThoroughfare(var42);
    var15.setThoroughfare(var36);
    java.util.List var50 = var15.getAddressLine();
    java.util.List var51 = var15.getLocalityName();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var3 = var0.createPremisePremiseName();
    java.lang.String var4 = var3.getTypeOccurrence();
    java.lang.String var5 = var3.getContent();
    java.lang.String var6 = var3.getContent();
    java.lang.String var7 = var3.getTypeOccurrence();
    
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

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    geo.google.GeoException var4 = new geo.google.GeoException("hi!");
    geo.google.datamodel.GeoStatusCode var7 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var8 = new geo.google.GeoException("", var7);
    java.lang.String var9 = var8.toString();
    geo.google.datamodel.GeoStatusCode var13 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var14 = new geo.google.GeoException("", var13);
    geo.google.datamodel.GeoStatusCode var17 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var18 = new geo.google.GeoException("", var17);
    geo.google.GeoException var19 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var14, var17);
    var8.addSuppressed((java.lang.Throwable)var19);
    var4.addSuppressed((java.lang.Throwable)var8);
    geo.google.datamodel.GeoStatusCode var25 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var26 = new geo.google.GeoException("", var25);
    java.lang.String var27 = var26.toString();
    geo.google.datamodel.GeoStatusCode var31 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var32 = new geo.google.GeoException("", var31);
    geo.google.datamodel.GeoStatusCode var35 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var36 = new geo.google.GeoException("", var35);
    geo.google.GeoException var37 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var32, var35);
    var26.addSuppressed((java.lang.Throwable)var37);
    geo.google.datamodel.GeoStatusCode var40 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var42 = var40.equals((java.lang.Object)10L);
    java.lang.String var43 = var40.name();
    int var44 = var40.getCode();
    geo.google.GeoException var45 = new geo.google.GeoException("", (java.lang.Throwable)var26, var40);
    java.lang.String var46 = var40.getDescription();
    geo.google.GeoException var47 = new geo.google.GeoException("Uknown Status", (java.lang.Throwable)var4, var40);
    geo.google.GeoException var48 = new geo.google.GeoException("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (java.lang.Throwable)var4);
    geo.google.datamodel.GeoCoordinate var49 = new geo.google.datamodel.GeoCoordinate();
    double var50 = var49.getLongitude();
    geo.google.datamodel.GeoCoordinate var51 = new geo.google.datamodel.GeoCoordinate();
    double var52 = var51.getLongitude();
    double var53 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var49, var51);
    geo.google.datamodel.GeoCoordinate var54 = new geo.google.datamodel.GeoCoordinate();
    double var55 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var49, var54);
    geo.google.datamodel.GeoStatusCode var58 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var59 = new geo.google.GeoException("", var58);
    boolean var60 = var49.equals((java.lang.Object)var58);
    geo.google.GeoException var61 = new geo.google.GeoException("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (java.lang.Throwable)var4, var58);
    java.lang.String var62 = var58.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "geo.google.GeoException: "+ "'", var9.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "geo.google.GeoException: "+ "'", var27.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var43.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Uknown Status"+ "'", var46.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var62.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName();
    var0.setCode("Uknown Status");
    java.util.Map var3 = var0.getOtherAttributes();
    java.lang.String var4 = var0.getType();
    java.lang.String var5 = var0.getCode();
    var0.setType("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Uknown Status"+ "'", var5.equals("Uknown Status"));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var6 = var5.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var5.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var8 = var5.createThoroughfareLeadingTypeType();
    java.lang.String var9 = var8.getType();
    var0.setThoroughfareLeadingType(var8);
    var8.setContent("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var8.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var15 = var8.getCode();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    java.util.Map var6 = var5.getOtherAttributes();
    java.lang.String var7 = var5.getType();
    java.lang.String var8 = var5.getType();
    java.lang.String var9 = var5.getContent();
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = var2.getPostOfficeNumber();
    var2.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var7 = var2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var7.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var22 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var23 = var22.getContent();
    var22.setCode("");
    var0.setAddress(var22);
    java.util.Map var27 = var22.getOtherAttributes();
    java.lang.String var28 = var22.getCode();
    var22.setContent("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setType("");
    java.lang.String var6 = var3.getContent();
    var3.setNumberSuffixSeparator("");
    java.lang.String var9 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.List var5 = var0.getAddressLine();
    java.util.List var6 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var7 = var0.getThoroughfareTrailingType();
    java.util.List var8 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var9 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var9.setThoroughfarePostDirection(var10);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var12 = var9.getThoroughfarePostDirection();
    var0.setThoroughfarePostDirection(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
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
    assertNotNull(var12);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var2 = var0.createPostBoxPostBoxNumberExtension();
    var2.setNumberExtensionSeparator("G_GEO_UNKOWN_STATUS");
    var2.setNumberExtensionSeparator("geo.google.GeoException: ");
    var2.setContent("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var1.setRateLimitInterval(10L);
    geo.google.datamodel.GeoCoordinate var18 = new geo.google.datamodel.GeoCoordinate();
    double var19 = var18.getLongitude();
    geo.google.datamodel.GeoCoordinate var20 = new geo.google.datamodel.GeoCoordinate();
    double var21 = var20.getLongitude();
    double var22 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var18, var20);
    double var23 = var20.getLatitude();
    var20.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var27 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var28 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var20, var27);
    geo.google.datamodel.GeoAddressAccuracy var30 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var31 = var30.getName();
    geo.google.datamodel.GeoUsAddress var32 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var20, var30);
    var32.setPostalCode("(default) Indicates to ignore an altitude specification");
    var32.setAddressLine2("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var37 = var1.standardizeToGeoAddresses(var32);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "UNKNOWN_LOCATION"+ "'", var31.equals("UNKNOWN_LOCATION"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType();
    java.util.List var1 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var2 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var0.setPostalRouteNumber(var2);
    var2.setContent("geo.google.datamodel.GeoAddress@bb4d8b3[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown();
    var0.setType("geo.google.GeoException: geo.google.GeoException: ");
    java.util.List var3 = var0.getPostTownName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    java.lang.String var7 = var6.getType();
    var6.setCode("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.valueOf("geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var2 = var0.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var4 = var3.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var5 = var3.createPostBoxPostBoxNumberPrefix();
    var5.setNumberPrefixSeparator("Uknown Status");
    var0.setPostBoxNumberPrefix(var5);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var9 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var11 = var10.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var12 = var10.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var13 = var10.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var14 = var10.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var15 = var10.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var16 = var10.createFirmType();
    var9.setFirm(var16);
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var18 = var9.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var19 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var20 = var19.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var21 = var19.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var22 = var19.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var23 = var22.getType();
    java.util.List var24 = var22.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var25 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var26 = var25.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var27 = var25.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var28 = var25.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var29 = var25.createThoroughfare();
    java.util.List var30 = var29.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var31 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var32 = var31.getPostTown();
    var29.setPostalCode(var31);
    var22.setPostalCode(var31);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var35 = var22.getPostalCode();
    var18.setPostalCode(var35);
    var0.setFirm(var18);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var38 = var0.getPostBoxNumberPrefix();
    java.lang.String var39 = var38.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var4 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice();
    var3.setPostOffice(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var6 = var4.getPostBox();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var6 = var0.createPostalCodePostalCodeNumber();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setCode("geo.google.GeoException: geo.google.GeoException: ");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.util.List var2 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var4 = var3.getAny();
    java.lang.String var5 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var6 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var3.setAddressLatitude(var6);
    var6.setCode("Uknown Status");
    var0.setAddressLatitude(var6);
    java.lang.String var11 = var6.getType();
    var6.setCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var14 = var6.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    long var2 = var1.getRateLimitInterval();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.standardizeToGeoUsAddresses("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5769L);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    var1.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.lang.String var8 = var7.getPremiseThoroughfareConnector();
    var1.setPremise(var7);
    java.util.Map var10 = var7.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var11 = var7.getPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var12 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var13 = var12.getPostTown();
    java.util.Map var14 = var12.getOtherAttributes();
    java.util.List var15 = var12.getPostalCodeNumberExtension();
    var7.setPostalCode(var12);
    java.util.List var17 = var7.getPremiseName();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var2 = var0.createPostBoxPostBoxNumberPrefix();
    java.lang.String var3 = var2.getContent();
    java.lang.String var4 = var2.getContent();
    java.lang.String var5 = var2.getNumberPrefixSeparator();
    var2.setContent("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var2.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var2.getNumberPrefixSeparator();
    
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
    assertNull(var10);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getContent();
    java.util.Map var3 = var0.getOtherAttributes();
    java.lang.String var4 = var0.getCode();
    var0.setType("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var7 = var0.getOtherAttributes();
    java.lang.String var8 = var0.getCode();
    var0.setContent("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.getMailStop();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var2 = var0.getFirm();
    java.util.List var3 = var0.getAny();
    java.util.List var4 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var5 = var0.createLargeMailUserTypeLargeMailUserName();
    var5.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var8 = var5.getCode();
    var5.setCode("hi!");
    var5.setCode("geo.google.GeoException: ");
    var5.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


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
    java.lang.String var16 = var9.getContent();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


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
    java.util.List var17 = var3.getAny();
    
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
    assertNotNull(var17);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var6 = var0.createLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.getPremise();
    var6.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var10 = var6.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var11 = var6.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var13 = var12.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var14 = var12.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var15 = var12.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var16 = var12.createPostalRouteType();
    var6.setPostalRoute(var16);
    var16.setType("G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var4 = var0.createPremisePremiseNumberRangePremiseNumberRangeFrom();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var5 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var7 = var0.createLargeMailUserTypeLargeMailUserIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var8 = var0.createAddressDetailsAddress();
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

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber();
    java.lang.String var1 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    var0.setCode("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var5 = var0.getCode();
    java.util.List var6 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var5.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


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
    java.util.List var25 = var22.getAny();
    
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
    assertNotNull(var25);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    java.lang.String var1 = var0.getCode();
    var0.setType("hi!");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getContent();
    var0.setNumberSuffixSeparator("");
    java.lang.String var9 = var0.getType();
    java.lang.String var10 = var0.getNumberSuffixSeparator();
    var0.setNumberSuffixSeparator("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var13 = var0.getCode();
    java.lang.String var14 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var13.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var14.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName();
    var0.setType("");
    java.lang.String var3 = var0.getCode();
    java.lang.String var4 = var0.getCode();
    var0.setCode("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    var3.setType("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    var0.setAddress("geo.google.GeoException: ");
    java.lang.String var3 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var4 = var0.createAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var5 = var0.createPostalRouteType();
    
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

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Department var16 = new oasis.names.tc.ciq.xsdschema.xal._2.Department();
    java.util.List var17 = var16.getDepartmentName();
    java.util.List var18 = var16.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var19 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var20 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var19.setMailStop(var20);
    var16.setMailStop(var20);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var23 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var24 = var23.getPostTown();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var25 = var23.getPostTown();
    var16.setPostalCode(var23);
    var3.setPostalCode(var23);
    java.util.Map var28 = var3.getOtherAttributes();
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.List var5 = var0.getAddressLine();
    java.util.List var6 = var0.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var7 = var0.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var9 = var8.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var10 = var8.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var11 = var8.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var12 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var12.setThoroughfarePostDirection(var13);
    java.util.List var15 = var12.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var16 = var12.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var17 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var19 = var18.getCode();
    java.lang.String var20 = var18.getCode();
    var17.setThoroughfareTrailingType(var18);
    var12.setDependentThoroughfare(var17);
    var11.setDependentThoroughfare(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var24 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var25 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType();
    java.lang.String var26 = var25.getCode();
    var24.setThoroughfarePreDirection(var25);
    var25.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var17.setThoroughfarePreDirection(var25);
    var0.setThoroughfarePreDirection(var25);
    java.lang.String var32 = var25.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var32.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    geo.google.datamodel.GeoStatusCode var5 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var6 = new geo.google.GeoException("", var5);
    geo.google.GeoException var7 = new geo.google.GeoException("geo.google.GeoException: ", var5);
    geo.google.GeoException var8 = new geo.google.GeoException("geo.google.GeoException: ", (java.lang.Throwable)var7);
    geo.google.datamodel.GeoStatusCode var10 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var12 = var10.equals((java.lang.Object)10L);
    java.lang.Class var13 = var10.getDeclaringClass();
    geo.google.GeoException var14 = new geo.google.GeoException("hi!", (java.lang.Throwable)var8, var10);
    java.lang.String var15 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "geo.google.GeoException: hi!"+ "'", var15.equals("geo.google.GeoException: hi!"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var11 = var0.getBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var12 = var0.getSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var13 = var0.getAddressLongitudeDirection();
    java.util.List var14 = var0.getAny();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    geo.google.datamodel.GeoStatusCode var1 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    boolean var3 = var1.equals((java.lang.Object)10L);
    java.lang.String var4 = var1.name();
    int var5 = var1.getCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var7 = var6.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var8 = var6.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var9 = var6.createAddressDetailsCountry();
    boolean var10 = var1.equals((java.lang.Object)var9);
    java.lang.String var11 = var1.getDescription();
    int var12 = var1.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var4.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Uknown Status"+ "'", var11.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var4.getThoroughfarePreDirection();
    java.util.List var7 = var4.getThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var8 = var4.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var9 = var4.getThoroughfarePreDirection();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix();
    java.lang.String var1 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    var2.setType("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType();
    java.util.List var7 = var6.getAddressLine();
    var2.setPostalRoute(var6);
    java.lang.String var9 = var2.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var11 = var10.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var12 = var10.createPostalRouteType();
    var2.setPostalRoute(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var3 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var4 = var0.createSubPremiseTypeSubPremiseName();
    java.lang.String var5 = var4.getCode();
    var4.setCode("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.earth.kml._2.AltitudeModeType var1 = com.google.earth.kml._2.AltitudeModeType.fromValue("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.w3c.dom.Document var1 = geo.google.utils.XmlUtils.parse("");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var2 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    geo.google.datamodel.GeoCoordinate var11 = new geo.google.datamodel.GeoCoordinate();
    double var12 = var11.getLongitude();
    double var13 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var9, var11);
    double var14 = var11.getLatitude();
    var11.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var18 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var19 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var11, var18);
    java.lang.String var20 = var19.toAddressLine();
    java.lang.String var21 = var19.getAddressLine1();
    geo.google.datamodel.GeoCoordinate var22 = var19.getCoordinate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var1.standardizeToGeoUsAddresses(var19);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"+ "'", var20.equals("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "geo.google.GeoException: "+ "'", var21.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var2 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var3 = var0.createBuildingNameType();
    var3.setContent("geo.google.GeoException: ");
    java.lang.String var6 = var3.getContent();
    java.lang.String var7 = var3.getType();
    var3.setType("(default) Indicates to ignore an altitude specification");
    java.lang.String var10 = var3.getTypeOccurrence();
    
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
    assertNull(var10);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = var0.createPostBox();
    java.util.List var6 = var5.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var7 = var5.getPostBoxNumberPrefix();
    
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

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var3 = var0.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var4 = var0.createThoroughfareThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var5 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    java.lang.String var6 = var5.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom();
    java.util.List var8 = var7.getContent();
    var5.setThoroughfareNumberFrom(var7);
    var7.setCode("G_GEO_UNKOWN_STATUS");
    var4.setThoroughfareNumberFrom(var7);
    java.util.Map var13 = var7.getOtherAttributes();
    java.lang.String var14 = var7.getCode();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var14.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var0.setAddressLatitude(var3);
    java.lang.String var5 = var3.getContent();
    var3.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setType("geo.google.GeoException: hi!");
    java.lang.String var10 = var3.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName();
    var0.setType("");
    java.lang.String var3 = var0.getCode();
    java.lang.String var4 = var0.getCode();
    java.lang.String var5 = var0.getContent();
    java.util.Map var6 = var0.getOtherAttributes();
    var0.setType("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setCode("CLAMP_TO_GROUND");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var4 = var0.createCountryName();
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

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var2 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var3 = var0.createBuildingNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var4 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var5 = var0.createDependentLocalityTypeDependentLocalityName();
    var5.setContent("geo.google.datamodel.GeoAddress@1dd53212[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var5.setCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var1 = var0.getValidToDate();
    var0.setAddressDetailsKey("hi!");
    var0.setCurrentStatus("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var6 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var6.setThoroughfarePostDirection(var7);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var9 = var6.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var11 = var10.getCode();
    java.lang.String var12 = var10.getCode();
    var6.setThoroughfareTrailingType(var10);
    java.util.List var14 = var6.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var16 = var15.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var17 = var15.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var18 = var15.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var19 = var15.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var20 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var21 = var20.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var22 = var20.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var24 = var23.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var25 = var23.createPostBoxPostBoxNumberExtension();
    var20.setPostBoxNumberExtension(var25);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var27 = var20.getPostBoxNumberExtension();
    java.util.List var28 = var20.getAny();
    var19.setPostBox(var20);
    var19.setType("");
    var6.setDependentLocality(var19);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var33 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var34 = var33.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var35 = var33.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var36 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var37 = var36.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var38 = var36.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var39 = var36.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var40 = var36.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var41 = var40.getIndicator();
    var35.setLargeMailUserIdentifier(var40);
    java.util.List var43 = var35.getLargeMailUserName();
    var19.setLargeMailUser(var35);
    java.util.Map var45 = var35.getOtherAttributes();
    var35.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var48 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var49 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var50 = var49.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var51 = var49.createPostOffice();
    java.util.List var52 = var51.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var53 = var51.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var54 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var55 = var54.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var56 = var54.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var57 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var58 = var57.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var59 = var57.createPostBoxPostBoxNumberExtension();
    var54.setPostBoxNumberExtension(var59);
    var51.setPostBox(var54);
    var48.setPostOffice(var51);
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var63 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var64 = var63.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var65 = var63.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var66 = var63.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var67 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var68 = var67.getAddressLine();
    var63.setPostBox(var67);
    var48.setLocality(var63);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var71 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var72 = var71.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var73 = var71.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var74 = var71.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var75 = var71.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var76 = var71.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var77 = var71.createPostOffice();
    java.lang.String var78 = var77.getIndicator();
    java.util.List var79 = var77.getAny();
    var63.setPostOffice(var77);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var81 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var82 = var81.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var83 = var81.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var84 = var81.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var85 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var86 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var85.setThoroughfarePostDirection(var86);
    java.util.List var88 = var85.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var89 = var85.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var90 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var91 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var92 = var91.getCode();
    java.lang.String var93 = var91.getCode();
    var90.setThoroughfareTrailingType(var91);
    var85.setDependentThoroughfare(var90);
    var84.setDependentThoroughfare(var90);
    var63.setThoroughfare(var84);
    var35.setThoroughfare(var84);
    var0.setThoroughfare(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.getSubAdministrativeArea();
    var0.setType("Uknown Status");
    var0.setUsageType("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var0.getUsageType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var9 = var0.getPostOffice();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var8.equals("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = var2.getPostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var6 = var5.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var7 = var5.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var9 = var8.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var10 = var8.createPostBoxPostBoxNumberExtension();
    var5.setPostBoxNumberExtension(var10);
    var2.setPostBox(var5);
    java.util.List var13 = var2.getAny();
    java.lang.String var14 = var2.getType();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getCode();
    var0.setCode("G_GEO_UNKOWN_STATUS");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var12 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.lang.String var13 = var12.getCode();
    var0.setAddressLongitude(var12);
    java.lang.String var15 = var12.getContent();
    java.lang.String var16 = var12.getContent();
    var12.setType("");
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.getThoroughfareLeadingType();
    java.util.List var5 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    java.lang.String var6 = var0.getDependentThoroughfaresIndicator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setContent("");
    java.lang.String var4 = var0.getType();
    var0.setContent("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    var0.setCode("geo.google.GeoException: geo.google.GeoException: ");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var7 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var7.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var5 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var6 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var7 = var6.getSubPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var8 = var6.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    java.util.Map var10 = var9.getOtherAttributes();
    var9.setType("G_GEO_UNKOWN_STATUS");
    var6.setMailStop(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var14 = var9.getMailStopName();
    var5.setMailStop(var9);
    java.util.List var16 = var9.getAddressLine();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var3 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var4 = var0.createPostalCodePostalCodeNumber();
    java.util.Map var5 = var4.getOtherAttributes();
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    geo.google.datamodel.GeoCoordinate var0 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var1 = new geo.google.datamodel.GeoCoordinate();
    double var2 = var1.getLongitude();
    double var3 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var0, var1);
    double var4 = var1.getLongitude();
    geo.google.datamodel.GeoCoordinate var5 = new geo.google.datamodel.GeoCoordinate();
    double var6 = var5.getLongitude();
    geo.google.datamodel.GeoCoordinate var7 = new geo.google.datamodel.GeoCoordinate();
    double var8 = var7.getLongitude();
    double var9 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var5, var7);
    geo.google.datamodel.GeoCoordinate var10 = new geo.google.datamodel.GeoCoordinate();
    double var11 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var5, var10);
    geo.google.datamodel.GeoStatusCode var14 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var15 = new geo.google.GeoException("", var14);
    boolean var16 = var5.equals((java.lang.Object)var14);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var18 = var17.createPremise();
    java.util.List var19 = var18.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var20 = var18.getFirm();
    var18.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var24 = var23.createPremise();
    java.lang.String var25 = var24.getPremiseThoroughfareConnector();
    var18.setPremise(var24);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var27 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var28 = var27.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var29 = var27.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var30 = var27.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var31 = var30.getType();
    java.util.List var32 = var30.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var33 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var34 = var33.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var35 = var33.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var36 = var33.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var37 = var33.createThoroughfare();
    java.util.List var38 = var37.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var39 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var40 = var39.getPostTown();
    var37.setPostalCode(var39);
    var30.setPostalCode(var39);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var43 = var30.getPostalCode();
    var18.setPostalCode(var43);
    boolean var45 = var5.equals((java.lang.Object)var18);
    geo.google.datamodel.GeoCoordinate var46 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var47 = new geo.google.datamodel.GeoCoordinate();
    double var48 = var47.getLongitude();
    double var49 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var46, var47);
    geo.google.datamodel.GeoAltitude var50 = var47.getAltitude();
    geo.google.datamodel.GeoCoordinate var51 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var52 = new geo.google.datamodel.GeoCoordinate();
    double var53 = var52.getLongitude();
    double var54 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var51, var52);
    double var55 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var47, var52);
    double var56 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var5, var52);
    double var57 = var1.distanceTo(var5);
    double var58 = var1.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1.0d));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    geo.google.datamodel.GeoCoordinate var16 = new geo.google.datamodel.GeoCoordinate();
    double var17 = var16.getLongitude();
    geo.google.datamodel.GeoCoordinate var18 = new geo.google.datamodel.GeoCoordinate();
    double var19 = var18.getLongitude();
    double var20 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var16, var18);
    double var21 = var18.getLatitude();
    var18.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var25 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var26 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var18, var25);
    geo.google.datamodel.GeoAddressAccuracy var28 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var29 = var28.getName();
    geo.google.datamodel.GeoUsAddress var30 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var18, var28);
    var30.setPostalCode("(default) Indicates to ignore an altitude specification");
    java.lang.String var33 = var30.getAddressLine2();
    geo.google.datamodel.GeoAddressAccuracy var34 = var30.getAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var35 = var1.standardizeToGeoAddresses(var30);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "UNKNOWN_LOCATION"+ "'", var29.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var33.equals("(default) Indicates to ignore an altitude specification"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getValidToDate();
    java.lang.String var3 = var0.getCode();
    var0.setAccuracy((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var0.setAddressLatitude(var3);
    java.lang.String var5 = var3.getContent();
    var3.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setType("geo.google.datamodel.GeoAddress@70027021[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setType("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var12 = var3.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    java.lang.String var4 = var3.getType();
    java.lang.String var5 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var6 = var3.getPostBox();
    java.util.List var7 = var3.getAny();
    java.lang.String var8 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var9 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var9.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var9.setContent("(default) Indicates to ignore an altitude specification");
    var3.setPostalRouteNumber(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var15 = var3.getPostalRouteNumber();
    
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
    assertNotNull(var15);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("");
    geo.google.datamodel.GeoCoordinate var16 = new geo.google.datamodel.GeoCoordinate();
    double var17 = var16.getLongitude();
    geo.google.datamodel.GeoCoordinate var18 = new geo.google.datamodel.GeoCoordinate();
    double var19 = var18.getLongitude();
    double var20 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var16, var18);
    double var21 = var18.getLatitude();
    var18.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var25 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var26 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var18, var25);
    geo.google.datamodel.GeoAddressAccuracy var28 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var29 = var28.getName();
    geo.google.datamodel.GeoUsAddress var30 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var18, var28);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var31 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var32 = var31.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var33 = var31.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var34 = var31.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var35 = var31.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var36 = var31.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var37 = var31.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var38 = var31.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var39 = var31.createAddressDetailsPostalServiceElementsSortingCode();
    boolean var40 = var30.equals((java.lang.Object)var39);
    var30.setPostalCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var43 = var1.standardizeToGeoAddresses(var30);
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "UNKNOWN_LOCATION"+ "'", var29.equals("UNKNOWN_LOCATION"));
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    java.util.List var3 = var1.getAny();
    var1.setType("");
    java.util.List var6 = var1.getBuildingName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    var4.setIndicator("hi!");
    java.lang.String var7 = var4.getContent();
    var2.setPostOfficeNumber(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var9 = var2.getPostalCode();
    java.util.List var10 = var2.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var11 = var2.getPostalCode();
    java.lang.String var12 = var2.getType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var5 = var0.createLargeMailUserTypeLargeMailUserIdentifier();
    java.lang.String var6 = var5.getCode();
    java.lang.String var7 = var5.getContent();
    var5.setIndicator("");
    java.lang.String var10 = var5.getContent();
    var5.setCode("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var5.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var10);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


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
    java.lang.String var10 = var6.getType();
    java.lang.String var11 = var6.getCode();
    var6.setType("geo.google.datamodel.GeoAddress@70027021[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setCode("geo.google.GeoException: ");
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setType("geo.google.GeoException: ");
    java.util.Map var10 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    geo.google.datamodel.GeoCoordinate var7 = new geo.google.datamodel.GeoCoordinate();
    double var8 = var7.getLongitude();
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    double var11 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var7, var9);
    double var12 = var9.getLatitude();
    var9.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var16 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var17 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var9, var16);
    java.lang.String var18 = var17.toAddressLine();
    geo.google.datamodel.GeoCoordinate var19 = var17.getCoordinate();
    geo.google.datamodel.GeoCoordinate var20 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var21 = new geo.google.datamodel.GeoCoordinate();
    double var22 = var21.getLongitude();
    double var23 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var20, var21);
    geo.google.datamodel.GeoCoordinate var24 = var20.clone();
    java.lang.String var25 = var24.toString();
    var17.setCoordinate(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"+ "'", var18.equals("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var6 = var0.createLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.getPremise();
    var6.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var10 = var6.getPostOffice();
    var6.setIndicator("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var3 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var4 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var5 = var0.createPostBoxPostBoxNumberExtension();
    java.lang.String var6 = var5.getNumberExtensionSeparator();
    
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

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var3 = var0.createPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var4 = var0.createAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var5 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    java.lang.String var7 = var6.getType();
    
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

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var2 = var1.getCode();
    java.lang.String var3 = var1.getCode();
    var0.setThoroughfareTrailingType(var1);
    java.util.Map var5 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var15 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var16 = var15.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var17 = var15.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var18 = var15.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var19 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var20 = var19.getAddressLine();
    var15.setPostBox(var19);
    var0.setLocality(var15);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var23 = var15.getPostalCode();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var4 = var2.standardizeToGeoCoordinate("G_GEO_UNKOWN_STATUS");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var3 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var4 = var0.createLocalityLocalityName();
    java.lang.String var5 = var4.getContent();
    java.lang.String var6 = var4.getContent();
    
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

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    var3.setContent("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getCode();
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getCode();
    var0.setType("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var4 = var0.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    var5.setContent("G_GEO_UNKOWN_STATUS");
    var5.setContent("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var5.setCode("geo.google.datamodel.GeoAddress@bb4d8b3[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var12 = var5.getContent();
    
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
    assertTrue("'" + var12 + "' != '" + "geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var12.equals("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    java.lang.String var4 = var3.getTypeOccurrence();
    java.lang.String var5 = var3.getType();
    var3.setCode("G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var0.setThoroughfarePostDirection(var1);
    java.util.List var3 = var0.getThoroughfareNumberSuffix();
    var0.setDependentThoroughfaresIndicator("hi!");
    var0.setDependentThoroughfaresType("");
    java.lang.String var8 = var0.getDependentThoroughfaresConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var9 = var0.getFirm();
    java.util.List var10 = var0.getThoroughfareName();
    java.util.List var11 = var0.getThoroughfareNumberOrThoroughfareNumberRange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    java.lang.String var4 = var3.getType();
    java.lang.String var5 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var6 = var3.getPostBox();
    java.util.List var7 = var3.getAny();
    java.lang.String var8 = var3.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var9 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var9.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var9.setContent("(default) Indicates to ignore an altitude specification");
    var3.setPostalRouteNumber(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var15 = var3.getPostBox();
    
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
    assertNull(var15);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName();
    java.lang.String var1 = var0.getTypeOccurrence();
    java.lang.String var2 = var0.getCode();
    java.lang.String var3 = var0.getType();
    java.lang.String var4 = var0.getType();
    var0.setContent("Uknown Status");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.CountryName();
    var0.setCode("hi!");
    var0.setType("hi!");
    java.lang.String var5 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var3 = var0.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var4 = var0.createThoroughfareThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var5 = var0.createAddressLinesType();
    java.util.List var6 = var5.getAny();
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

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


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
    geo.google.mapping.FunctionChain var10 = var8.getTail();
    
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
    assertNull(var10);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection();
    java.lang.String var1 = var0.getCode();
    var0.setType("hi!");
    java.lang.String var4 = var0.getType();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getNumberOccurrence();
    var0.setCode("geo.google.datamodel.GeoAddress@2eda413f[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7af1a720\n  _addressLine=geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    var0.setUsage("");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var7 = var0.getPostalServiceElements();
    var0.setCurrentStatus("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var11 = var10.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var12 = var10.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var13 = var10.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var14 = var10.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var15 = var10.createAddressLinesType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var16 = var10.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var17 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var18 = var17.getIndicator();
    java.util.Map var19 = var17.getOtherAttributes();
    var16.setAdministrativeArea(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var21 = var16.getThoroughfare();
    var0.setCountry(var16);
    java.util.List var23 = var16.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var24 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var25 = var24.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var26 = var24.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var27 = var24.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var28 = var24.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var29 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var30 = var29.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var31 = var29.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var32 = var29.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var33 = var29.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var34 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var35 = var34.createPremise();
    java.lang.String var36 = var35.getPremiseThoroughfareConnector();
    java.util.List var37 = var35.getAny();
    java.util.List var38 = var35.getPremiseName();
    var33.setPremise(var35);
    var28.setThoroughfare(var33);
    java.lang.String var41 = var33.getDependentThoroughfaresType();
    var16.setThoroughfare(var33);
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
    java.util.List var69 = var47.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var70 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var71 = var70.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var72 = var70.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var73 = var70.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var74 = var73.getThoroughfarePreDirection();
    var47.setThoroughfare(var73);
    var16.setThoroughfare(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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
    assertNotNull(var19);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
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
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setContent("");
    var2.setCode("hi!");
    java.lang.String var8 = var2.getType();
    var2.setType("geo.google.GeoException: geo.google.GeoException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    java.lang.String var5 = var2.getCode();
    java.lang.String var6 = var2.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var7 = var0.createPremisePremiseNumberRange();
    var7.setRangeType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var7.getSeparator();
    
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

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getContent();
    java.lang.String var3 = var0.getCode();
    java.lang.String var4 = var0.getContent();
    var0.setCode("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var4 = var0.createPremiseNumber();
    var4.setType("hi!");
    var4.setType("geo.google.GeoException: ");
    java.lang.String var9 = var4.getNumberTypeOccurrence();
    var4.setContent("geo.google.GeoException: hi!");
    java.lang.String var12 = var4.getNumberType();
    
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
    assertNull(var12);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var3 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var5 = var0.createPostalRouteTypePostalRouteNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var6 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var7 = var0.createDepartment();
    
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

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var0.setAddressLatitude(var3);
    java.lang.String var5 = var3.getContent();
    var3.setCode("geo.google.datamodel.GeoAddress@535811d6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setType("geo.google.GeoException: hi!");
    var3.setContent("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var2 = var0.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var3 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var4 = var3.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberPrefix var5 = var3.createPostBoxPostBoxNumberPrefix();
    var5.setNumberPrefixSeparator("Uknown Status");
    var0.setPostBoxNumberPrefix(var5);
    java.util.Map var9 = var5.getOtherAttributes();
    java.lang.String var10 = var5.getNumberPrefixSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Uknown Status"+ "'", var10.equals("Uknown Status"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var21 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var22 = var21.getOtherAttributes();
    java.lang.String var23 = var21.getContent();
    java.lang.String var24 = var21.getCode();
    var0.setAddressLongitude(var21);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var26 = var0.getAddressLatitude();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setCode("");
    var0.setCode("");
    var0.setType("geo.google.GeoException: ");
    java.lang.String var8 = var0.getContent();
    var0.setType("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


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
    java.lang.String var12 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var13 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var16 = var14.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var17 = var14.createPostalCode();
    var13.setPostalCode(var17);
    var0.setPostalCode(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber var20 = var0.getPostBoxNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var21 = var0.getFirm();
    var21.setType("geo.google.GeoException: geo.google.GeoException: ");
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    var1.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.lang.String var8 = var7.getPremiseThoroughfareConnector();
    var1.setPremise(var7);
    java.util.Map var10 = var7.getOtherAttributes();
    java.util.List var11 = var7.getPremiseNumberPrefix();
    java.util.List var12 = var7.getPremiseNumberPrefix();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var4 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var5 = var0.createAddressDetailsAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var6 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var7 = var0.createThoroughfareNumberPrefix();
    
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

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    java.util.Map var3 = var0.getOtherAttributes();
    var0.setCode("geo.google.GeoException: ");
    java.util.Map var6 = var0.getOtherAttributes();
    var0.setCode("geo.google.GeoException: ");
    java.lang.String var9 = var0.getCode();
    java.lang.String var10 = var0.getCode();
    java.util.Map var11 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "geo.google.GeoException: "+ "'", var9.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "geo.google.GeoException: "+ "'", var10.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setType("");
    java.lang.String var6 = var3.getContent();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var3.setType("UNKNOWN_LOCATION");
    var3.setType("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var2 = var0.getPostalCode();
    java.util.List var3 = var0.getSubPremiseNumberPrefix();
    java.lang.String var4 = var0.getType();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType();
    var0.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setTypeOccurrence("geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var5 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var6 = var0.createLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var7 = var6.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var9 = var8.createPremise();
    java.util.List var10 = var9.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var12 = var11.createPremise();
    var9.setPremise(var12);
    java.lang.String var14 = var9.getPremiseDependency();
    var6.setPremise(var9);
    var9.setType("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.Department var6 = var0.createDepartment();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var7 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var8 = var0.createThoroughfareNumberPrefix();
    
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

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoAddress var4 = var2.standardizeToGeoAddress("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var8 = var0.createPostalCodePostTown();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var9 = var0.createPostOfficePostOfficeNumber();
    java.lang.String var10 = var9.getIndicator();
    
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

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var2 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var3 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var4 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var5 = var0.createLargeMailUserType();
    
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

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    java.lang.String var1 = var0.getIndicatorOccurrence();
    java.lang.String var2 = var0.getIndicatorOccurrence();
    java.lang.String var3 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var2 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var3 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var4 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var5 = var0.createSubPremiseTypeSubPremiseName();
    java.lang.String var6 = var5.getCode();
    var5.setContent("geo.google.datamodel.GeoAddress@730dc6d0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    var0.setContent("geo.google.datamodel.GeoAddress@3cce2b1c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setCode("UNKNOWN_LOCATION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var6 = var5.getAddressLine();
    java.util.List var7 = var5.getAny();
    var4.setPostBox(var5);
    java.lang.String var9 = var5.getIndicator();
    
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

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var5 = var0.createAddressLinesType();
    java.util.List var6 = var5.getAny();
    java.util.List var7 = var5.getAddressLine();
    java.util.Map var8 = var5.getOtherAttributes();
    
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

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var0.setContent("geo.google.datamodel.GeoAddress@2eda413f[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7af1a720\n  _addressLine=geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var6 = var0.createBuildingNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var7 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var9 = var8.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var10 = var8.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var11 = var8.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var12 = var8.createThoroughfare();
    java.util.List var13 = var12.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var14 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var15 = var14.getPostTown();
    var12.setPostalCode(var14);
    java.util.List var17 = var14.getAny();
    var7.setPostalCode(var14);
    java.util.List var19 = var14.getPostalCodeNumberExtension();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    geo.google.datamodel.GeoAltitude var1 = new geo.google.datamodel.GeoAltitude(10.0d);
    var1.setAltitude((-1.0d));
    java.lang.String var4 = var1.toString();
    geo.google.datamodel.GeoAltitude var5 = var1.clone();
    geo.google.datamodel.GeoAltitude var7 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var9 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var10 = var9.getMode();
    var7.setMode(var10);
    geo.google.datamodel.GeoAltitude var12 = new geo.google.datamodel.GeoAltitude(100.0d, var10);
    var5.setMode(var10);
    java.lang.String var14 = var10.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "CLAMP_TO_GROUND"+ "'", var14.equals("CLAMP_TO_GROUND"));

  }

}
