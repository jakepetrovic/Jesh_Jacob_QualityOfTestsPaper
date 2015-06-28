package randoop;

import junit.framework.*;

public class RandoopTest19 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test1");


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
    java.util.List var13 = var1.getPremiseNumber();
    java.util.List var14 = var1.getSubPremise();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test2");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getValidToDate();
    java.lang.String var3 = var0.getAddressDetailsKey();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var4.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var6 = var4.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var7 = var4.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var8 = var4.createThoroughfare();
    java.util.List var9 = var8.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var10 = var8.getThoroughfarePreDirection();
    java.util.List var11 = var8.getThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var13 = var12.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var14 = var12.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var15 = var12.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var16 = var12.createThoroughfare();
    java.util.List var17 = var16.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var18 = var16.getThoroughfarePreDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var19 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    var16.setDependentThoroughfare(var19);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var21 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var22 = var21.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var23 = var21.createThoroughfareLeadingTypeType();
    java.lang.String var24 = var23.getContent();
    java.util.Map var25 = var23.getOtherAttributes();
    var19.setThoroughfareLeadingType(var23);
    var8.setThoroughfareLeadingType(var23);
    var0.setThoroughfare(var8);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var29 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var30 = var29.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var31 = var29.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var32 = var29.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var33 = var29.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var34 = var29.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var35 = var29.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var36 = var29.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var37 = var29.createThoroughfareDependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var38 = var37.getThoroughfarePreDirection();
    var8.setDependentThoroughfare(var37);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var40 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var41 = var40.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var42 = var40.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var43 = var40.createThoroughfarePostDirectionType();
    var37.setThoroughfarePostDirection(var43);
    java.lang.String var45 = var43.getType();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test3");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var3 = var1.getFirm();
    var1.setPremiseThoroughfareConnector("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.lang.String var8 = var7.getPremiseThoroughfareConnector();
    var1.setPremise(var7);
    java.lang.String var10 = var7.getPremiseDependency();
    
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
    assertNull(var10);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test4");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setSeparator("Uknown Status");
    java.lang.String var3 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var4 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var5 = var4.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var6 = var4.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var7 = var4.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var8 = var4.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var9 = var4.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var10 = var4.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var11 = var4.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var12 = var4.createDependentLocalityTypeDependentLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var13 = var4.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    var0.setThoroughfareNumberTo(var13);
    var0.setNumberRangeOccurrence("geo.google.datamodel.GeoAddress@6053ff54[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test5");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var1 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var3 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var4 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var5 = var0.createPremisePremiseName();
    var5.setTypeOccurrence("geo.google.datamodel.GeoUsAddress@69d10531[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@19ac0a3d[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@6dd437f5[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var5.getCode();
    java.lang.String var9 = var5.getContent();
    
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test6");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var2 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumber var4 = var0.createSubPremiseTypeSubPremiseNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var5 = var0.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var7 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var8 = var0.createPostOfficePostOfficeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var9 = var0.createPremiseNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var10 = var0.createPremiseNumber();
    var10.setCode("geo.google.datamodel.GeoUsAddress@2e935a48[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@4c0c44db[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@397cacde[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var10.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@456f8831[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test7");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var4 = var0.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitude();
    var5.setContent("UNKNOWN_LOCATION");
    java.lang.String var8 = var5.getContent();
    java.lang.String var9 = var5.getCode();
    var5.setContent("geo.google.datamodel.GeoAddress@7d94758f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertTrue("'" + var8 + "' != '" + "UNKNOWN_LOCATION"+ "'", var8.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test8");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("G_GEO_UNKOWN_STATUS");
    var1.setApiKey("geo.google.datamodel.GeoAddress@328cb5a9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    org.apache.commons.httpclient.params.HttpClientParams var4 = var1.getHttpClientParams();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test9");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var2 = var0.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var3 = var0.createPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var4 = var0.createAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var5 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var7 = var0.createPostalCodePostTownPostTownSuffix();
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

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test10");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    var2.setType("");
    var2.setContent("geo.google.GeoException: ");
    java.lang.String var7 = var2.getCode();
    java.lang.String var8 = var2.getType();
    java.lang.String var9 = var2.getContent();
    var2.setTypeOccurrence("geo.google.GeoException: geo.google.GeoException: , geo.google.GeoException: hi!,  geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "geo.google.GeoException: "+ "'", var9.equals("geo.google.GeoException: "));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test11");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var4 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var5 = var4.getPostOffice();
    java.lang.String var6 = var4.getType();
    var4.setType("geo.google.datamodel.GeoAddress@47921f06[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test12");


    geo.google.datamodel.GeoAltitude var10 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var11 = var10.getMode();
    geo.google.datamodel.GeoCoordinate var12 = new geo.google.datamodel.GeoCoordinate(0.0d, 1.0d, var10);
    double var13 = var12.getLongitude();
    geo.google.datamodel.GeoCoordinate var14 = var12.clone();
    geo.google.datamodel.GeoCoordinate var36 = new geo.google.datamodel.GeoCoordinate();
    double var37 = var36.getLongitude();
    geo.google.datamodel.GeoCoordinate var38 = new geo.google.datamodel.GeoCoordinate();
    double var39 = var38.getLongitude();
    double var40 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var36, var38);
    double var41 = var38.getLatitude();
    var38.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var45 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var46 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var38, var45);
    geo.google.datamodel.GeoAddressAccuracy var48 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var49 = var48.getName();
    geo.google.datamodel.GeoUsAddress var50 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var38, var48);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var51 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var52 = var51.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var53 = var51.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var54 = var51.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var55 = var51.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var56 = var51.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var57 = var51.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var58 = var51.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var59 = var51.createAddressDetailsPostalServiceElementsSortingCode();
    boolean var60 = var50.equals((java.lang.Object)var59);
    var50.setPostalCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var50.setState("geo.google.GeoException: hi!");
    geo.google.datamodel.GeoCoordinate var67 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var68 = new geo.google.datamodel.GeoCoordinate();
    double var69 = var68.getLongitude();
    double var70 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var67, var68);
    geo.google.datamodel.GeoAltitude var71 = var68.getAltitude();
    geo.google.datamodel.GeoAltitude var72 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var73 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var74 = var73.getMode();
    boolean var75 = var72.equals((java.lang.Object)var73);
    var68.setAltitude(var73);
    geo.google.datamodel.GeoCoordinate var77 = new geo.google.datamodel.GeoCoordinate(760.0265655385957d, 0.0d, var73);
    var50.setCoordinate(var77);
    geo.google.datamodel.GeoAddressAccuracy var80 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(0);
    int var81 = var80.getCode();
    geo.google.datamodel.GeoUsAddress var82 = new geo.google.datamodel.GeoUsAddress("geo.google.datamodel.GeoUsAddress@1f5bc05b[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@40b1a672[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@4f26a78c[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@242bdc83[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@324ed527[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoUsAddress@9927c98[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@7031e410[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@5b740ffb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  ", "geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]", var77, var80);
    geo.google.datamodel.GeoUsAddress var83 = new geo.google.datamodel.GeoUsAddress("geo.google.datamodel.GeoUsAddress@9132e80[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@4a51da27[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@43c95c8f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@12dfb6a6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@4c315596[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@25d14add[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", var12, var80);
    java.lang.String var84 = var80.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "UNKNOWN_LOCATION"+ "'", var49.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "UNKNOWN_LOCATION"+ "'", var84.equals("UNKNOWN_LOCATION"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test13");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ResponseType var2 = var0.createResponseType();
    com.google.earth.kml._2.PointType var3 = var0.createPointType();
    com.google.earth.kml._2.KmlType var4 = var0.createKmlType();
    geo.google.mapping.PointToCoordinateFunctor var5 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var6 = new com.google.earth.kml._2.PointType();
    var6.setTessellate((java.lang.Boolean)true);
    var6.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var11 = var5.execute(var6);
    com.google.earth.kml._2.PointType var12 = new com.google.earth.kml._2.PointType();
    var12.setTessellate((java.lang.Boolean)true);
    java.lang.Boolean var15 = var12.isTessellate();
    geo.google.datamodel.GeoCoordinate var16 = var5.execute(var12);
    javax.xml.bind.JAXBElement var17 = var0.createPoint(var12);
    com.google.earth.kml._2.PointType var18 = new com.google.earth.kml._2.PointType();
    var18.setExtrude((java.lang.Boolean)true);
    javax.xml.bind.JAXBElement var21 = var0.createPoint(var18);
    com.google.earth.kml._2.ResponseType var22 = var0.createResponseType();
    com.google.earth.kml._2.StatusType var23 = var22.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + true+ "'", var15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test14");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var10 = var0.createAddressDetailsPostalServiceElementsAddressIdentifier();
    
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

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test15");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var4 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var5 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var6 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var7 = var0.createPostalCodePostTownPostTownName();
    var7.setType("(default) Indicates to ignore an altitude specification");
    java.util.Map var10 = var7.getOtherAttributes();
    java.lang.String var11 = var7.getContent();
    java.lang.String var12 = var7.getContent();
    java.lang.String var13 = var7.getContent();
    var7.setCode("geo.google.datamodel.GeoAddress@e6d7be1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test16");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getContent();
    var0.setType("G_GEO_UNKOWN_STATUS");
    java.lang.String var5 = var0.getCode();
    java.lang.String var6 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var6.equals("G_GEO_UNKOWN_STATUS"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test17");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var4 = var0.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var6 = var5.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var7 = var5.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var8 = var5.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var9 = var5.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var10 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var11 = var10.createPremise();
    java.lang.String var12 = var11.getPremiseThoroughfareConnector();
    java.util.List var13 = var11.getAny();
    java.util.List var14 = var11.getPremiseName();
    var9.setPremise(var11);
    var4.setThoroughfare(var9);
    java.lang.String var17 = var9.getDependentThoroughfaresType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var18.setType("hi!");
    var9.setThoroughfarePostDirection(var18);
    var9.setType("geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var24 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var25 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var26 = var25.createPremise();
    java.util.List var27 = var26.getAddressLine();
    java.util.List var28 = var26.getAny();
    var26.setType("");
    var26.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var33 = var26.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var34 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var35 = var34.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var36 = var34.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var37 = var34.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var38 = var34.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var39 = var34.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var40 = var34.createFirmType();
    var26.setFirm(var40);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var42 = var26.getMailStop();
    var26.setType("hi!");
    var24.setPremise(var26);
    java.util.Map var46 = var24.getOtherAttributes();
    var24.setUsageType("geo.google.datamodel.GeoAddress@4244bb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var49 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var50 = var49.createPremise();
    java.util.List var51 = var50.getAddressLine();
    java.util.List var52 = var50.getAny();
    var50.setType("");
    var50.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var57 = var50.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var58 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var59 = var58.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var60 = var58.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var61 = var58.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var62 = var58.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var63 = var58.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var64 = var58.createFirmType();
    var50.setFirm(var64);
    java.util.List var66 = var50.getBuildingName();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var67 = var50.getFirm();
    var24.setPremise(var50);
    var9.setPremise(var50);
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var70 = var50.getPremiseLocation();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test18");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var2 = var0.createAdministrativeAreaAdministrativeAreaName();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var3 = var0.createThoroughfareNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var4 = var0.createDepartmentDepartmentName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var5 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var6 = var0.createPremisePremiseName();
    
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

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test19");


    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    geo.google.datamodel.GeoCoordinate var11 = new geo.google.datamodel.GeoCoordinate();
    double var12 = var11.getLongitude();
    double var13 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var9, var11);
    geo.google.datamodel.GeoCoordinate var21 = new geo.google.datamodel.GeoCoordinate();
    double var22 = var21.getLongitude();
    geo.google.datamodel.GeoCoordinate var23 = new geo.google.datamodel.GeoCoordinate();
    double var24 = var23.getLongitude();
    double var25 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var21, var23);
    double var26 = var23.getLatitude();
    var23.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var30 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var31 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var23, var30);
    geo.google.datamodel.GeoUsAddress var32 = new geo.google.datamodel.GeoUsAddress("G_GEO_UNKOWN_STATUS", "geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", var9, var30);
    geo.google.datamodel.GeoCoordinate var33 = new geo.google.datamodel.GeoCoordinate();
    geo.google.datamodel.GeoCoordinate var34 = new geo.google.datamodel.GeoCoordinate();
    double var35 = var34.getLongitude();
    double var36 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var33, var34);
    geo.google.datamodel.GeoCoordinate var37 = new geo.google.datamodel.GeoCoordinate();
    double var38 = var37.getLongitude();
    geo.google.datamodel.GeoCoordinate var39 = new geo.google.datamodel.GeoCoordinate();
    double var40 = var39.getLongitude();
    double var41 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var37, var39);
    geo.google.datamodel.GeoCoordinate var42 = new geo.google.datamodel.GeoCoordinate();
    double var43 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var37, var42);
    geo.google.datamodel.GeoStatusCode var46 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var47 = new geo.google.GeoException("", var46);
    boolean var48 = var37.equals((java.lang.Object)var46);
    geo.google.datamodel.GeoAltitude var50 = new geo.google.datamodel.GeoAltitude(0.0d);
    var37.setAltitude(var50);
    double var52 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var33, var37);
    var32.setCoordinate(var33);
    geo.google.mapping.PointToCoordinateFunctor var54 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var55 = new com.google.earth.kml._2.PointType();
    var55.setTessellate((java.lang.Boolean)true);
    var55.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var60 = var54.execute(var55);
    com.google.earth.kml._2.PointType var61 = new com.google.earth.kml._2.PointType();
    var61.setTessellate((java.lang.Boolean)true);
    java.lang.Boolean var64 = var61.isTessellate();
    geo.google.datamodel.GeoCoordinate var65 = var54.execute(var61);
    geo.google.mapping.FunctionChain var66 = geo.google.mapping.FunctionChain.getChain((geo.google.mapping.Functor)var54);
    com.google.earth.kml._2.PlacemarkType var67 = new com.google.earth.kml._2.PlacemarkType();
    var67.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var70 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var71 = var70.getValidToDate();
    var70.setAddressDetailsKey("hi!");
    var67.setAddressDetails(var70);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var75 = var67.getAddressDetails();
    com.google.earth.kml._2.PointType var76 = new com.google.earth.kml._2.PointType();
    var76.setTessellate((java.lang.Boolean)true);
    var76.setExtrude((java.lang.Boolean)false);
    var67.setPoint(var76);
    geo.google.datamodel.GeoCoordinate var82 = var54.execute(var76);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var83 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var84 = var83.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var85 = var83.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var86 = var83.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    java.lang.String var87 = var86.getContent();
    java.util.Map var88 = var86.getOtherAttributes();
    var86.setCode("geo.google.GeoException: hi!");
    boolean var91 = var82.equals((java.lang.Object)var86);
    var32.setCoordinate(var82);
    geo.google.datamodel.GeoAltitude var93 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude var94 = new geo.google.datamodel.GeoAltitude();
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var95 = var94.getMode();
    boolean var96 = var93.equals((java.lang.Object)var94);
    java.lang.String var97 = var94.toString();
    var82.setAltitude(var94);
    geo.google.datamodel.GeoCoordinate var99 = new geo.google.datamodel.GeoCoordinate(4703.753029466702d, 7793.647058832564d, var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + true+ "'", var64.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test20");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var14 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var15 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var14.setThoroughfarePostDirection(var15);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var17 = var14.getThoroughfarePostDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var19 = var18.getCode();
    java.lang.String var20 = var18.getCode();
    var14.setThoroughfareTrailingType(var18);
    java.util.List var22 = var14.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var24 = var23.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var25 = var23.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var26 = var23.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var27 = var23.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var28 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var29 = var28.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var30 = var28.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var31 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var32 = var31.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var33 = var31.createPostBoxPostBoxNumberExtension();
    var28.setPostBoxNumberExtension(var33);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var35 = var28.getPostBoxNumberExtension();
    java.util.List var36 = var28.getAny();
    var27.setPostBox(var28);
    var27.setType("");
    var14.setDependentLocality(var27);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var41 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var42 = var41.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var43 = var41.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var44 = var41.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var45 = var41.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var46 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var47 = var46.getAddressLine();
    java.util.List var48 = var46.getAny();
    var45.setPostBox(var46);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var50 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var45.setPostBox(var50);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var52 = var45.getDependentLocalityNumber();
    var27.setDependentLocality(var45);
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var54 = var45.getLargeMailUser();
    var10.setDependentLocality(var45);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var56 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType();
    java.util.List var57 = var56.getAddressLine();
    java.util.List var58 = var56.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var59 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var60 = var59.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var61 = var59.getPostalCode();
    var56.setPostBox(var59);
    var10.setPostBox(var59);
    java.util.List var64 = var10.getAddressLine();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
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
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test21");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var2 = var1.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var3 = var1.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var4 = var3.getCode();
    java.util.Map var5 = var3.getOtherAttributes();
    var3.setCode("G_GEO_UNKOWN_STATUS");
    var0.setEndorsementLineCode(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var9 = var0.getAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var10 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var11 = var10.getType();
    var10.setContent("geo.google.GeoException: ");
    var0.setBarcode(var10);
    java.util.Map var15 = var0.getOtherAttributes();
    java.lang.String var16 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var17 = var0.getSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var18 = var0.getAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var19 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.util.Map var20 = var19.getOtherAttributes();
    java.util.Map var21 = var19.getOtherAttributes();
    var19.setCode("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var24 = var19.getType();
    java.lang.String var25 = var19.getCode();
    var0.setBarcode(var19);
    java.lang.String var27 = var19.getContent();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var25.equals("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test22");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var5 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var6 = var0.createPostalCodePostTownPostTownSuffix();
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

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test23");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var11 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var11.setThoroughfarePostDirection(var12);
    java.util.List var14 = var11.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var15 = var11.getThoroughfareLeadingType();
    java.util.List var16 = var11.getThoroughfareNumberOrThoroughfareNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var18 = var17.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var19 = var17.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var20 = var17.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var21 = var17.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var22 = var21.getPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var23 = var21.getDependentLocalityNumber();
    var11.setDependentLocality(var21);
    var2.setThoroughfare(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var26 = var11.getThoroughfarePostDirection();
    java.util.List var27 = var11.getThoroughfareNumberSuffix();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test24");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var2 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var4 = var0.createPostBox();
    java.lang.String var5 = var4.getType();
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

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test25");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    java.lang.String var6 = var5.getSeparator();
    var5.setSeparator("geo.google.GeoException: ");
    var5.setNumberRangeOccurence("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var12 = var11.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var11.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var14 = var11.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var15 = var11.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var16 = var11.createPremisePremiseNumberRange();
    var16.setIndicator("G_GEO_UNKOWN_STATUS");
    var16.setType("hi!");
    var16.setType("geo.google.GeoException: ");
    var16.setIndicatorOccurence("hi!");
    var16.setSeparator("geo.google.GeoException: ");
    java.lang.String var27 = var16.getIndicatorOccurence();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var28 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo();
    var16.setPremiseNumberRangeTo(var28);
    var5.setPremiseNumberRangeTo(var28);
    java.util.List var31 = var28.getPremiseNumber();
    
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
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test26");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setCode("geo.google.GeoException: ");
    java.lang.String var5 = var0.getType();
    var0.setType("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification");
    java.lang.String var8 = var0.getType();
    var0.setContent("geo.google.datamodel.GeoAddress@24e48b8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification"+ "'", var8.equals("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  (default) Indicates to ignore an altitude specification"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test27");


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
    java.util.List var21 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var22 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var23 = var22.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var24 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var25 = var24.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var26 = var24.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var27 = var24.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var28 = var27.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var29 = var27.getPostOffice();
    java.lang.String var30 = var27.getUsageType();
    java.util.List var31 = var27.getAddressLine();
    var22.setSubAdministrativeArea(var27);
    java.lang.String var33 = var22.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var34 = var22.getSubAdministrativeArea();
    var22.setType("geo.google.GeoException: hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var37 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var38 = var37.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var39 = var37.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var40 = var37.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var41 = var37.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var42 = var37.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var43 = var37.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var44 = var37.createPremisePremiseNumberRangePremiseNumberRangeTo();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var45 = var37.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var46 = var37.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var47 = var37.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var48 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var49 = var48.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var50 = var48.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var51 = var48.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var52 = var48.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var53 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.lang.String var54 = var53.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var55 = var53.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var56 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var57 = var56.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var58 = var56.createPostBoxPostBoxNumberExtension();
    var53.setPostBoxNumberExtension(var58);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var60 = var53.getPostBoxNumberExtension();
    java.util.List var61 = var53.getAny();
    var52.setPostBox(var53);
    var52.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var65 = var52.getDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var66 = var52.getDependentLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var67 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var68 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var69 = var68.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var70 = var68.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var71 = var68.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var72 = var68.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var73 = var68.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var74 = var68.createFirmType();
    var67.setFirm(var74);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var76 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var77 = var76.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var78 = var76.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var79 = var76.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var80 = var76.createThoroughfare();
    java.util.List var81 = var80.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var82 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var83 = var82.getPostTown();
    var80.setPostalCode(var82);
    var74.setPostalCode(var82);
    var52.setPostalCode(var82);
    var47.setPostalCode(var82);
    var22.setPostalCode(var82);
    var0.setPostalCode(var82);
    java.lang.String var90 = var0.getType();
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
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
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test28");


    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getCode();
    var0.setCode("");
    java.lang.String var5 = var0.getContent();
    java.lang.String var6 = var0.getContent();
    var0.setType("geo.google.datamodel.GeoAddress@730dc6d0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test29");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    var0.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var4 = var3.getValidToDate();
    var3.setAddressDetailsKey("hi!");
    var0.setAddressDetails(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var0.getAddressDetails();
    java.lang.String var9 = var0.getId();
    var0.setAddress("geo.google.GeoException: , geo.google.GeoException: hi!,  CLAMP_TO_GROUND");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var12 = var0.getAddressDetails();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test30");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    java.lang.String var1 = var0.getCode();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var4 = var0.getNumberExtensionSeparator();
    var0.setCode("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var7 = var0.getNumberExtensionSeparator();
    java.util.Map var8 = var0.getOtherAttributes();
    var0.setCode("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var11 = var0.getOtherAttributes();
    java.lang.String var12 = var0.getCode();
    java.lang.String var13 = var0.getNumberExtensionSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var12.equals("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test31");


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
    java.util.Map var11 = var4.getOtherAttributes();
    java.lang.String var12 = var4.getUsageType();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var4.getPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var16 = var14.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var17 = var14.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var18 = var14.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var19 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    java.util.List var20 = var19.getAddressLine();
    java.util.List var21 = var19.getAny();
    var18.setPostBox(var19);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var23 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var18.setPostBox(var23);
    java.lang.String var25 = var18.getConnector();
    var18.setUsageType("G_GEO_UNKOWN_STATUS");
    java.util.List var28 = var18.getAddressLine();
    var18.setConnector("geo.google.datamodel.GeoAddress@2eda413f[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7af1a720\n  _addressLine=geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var4.setDependentLocality(var18);
    java.lang.String var32 = var4.getUsageType();
    
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
    assertNotNull(var11);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test32");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var3 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var4 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var5 = var0.createDependentLocalityTypeDependentLocalityNumber();
    java.util.Map var6 = var5.getOtherAttributes();
    java.lang.String var7 = var5.getContent();
    
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

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test33");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var1 = var0.getType();
    java.lang.String var2 = var0.getContent();
    var0.setCode("(default) Indicates to ignore an altitude specification");
    var0.setCode("geo.google.datamodel.GeoAddress@1b2ac007[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setType("geo.google.datamodel.GeoAddress@6053ff54[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test34");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var1 = var0.getPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var2 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var3 = var2.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var4 = var2.createPostalCodePostTownPostTownSuffix();
    var4.setContent("G_GEO_UNKOWN_STATUS");
    java.util.Map var7 = var4.getOtherAttributes();
    java.lang.String var8 = var4.getCode();
    java.lang.String var9 = var4.getContent();
    var0.setPostTownSuffix(var4);
    java.lang.String var11 = var4.getCode();
    var4.setContent("geo.google.datamodel.GeoAddress@74fcfcca[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@d386dc7\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var9.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test35");


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
    java.util.List var14 = var10.getAddressLine();
    java.util.List var15 = var10.getPremiseNumberSuffix();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test36");


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
    var28.setCountry("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var28.setCountry("G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var28.setPostalCode("Uknown Status");
    java.lang.String var35 = var28.getAddressLine2();
    
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
    assertTrue("'" + var35 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var35.equals("(default) Indicates to ignore an altitude specification"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test37");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber();
    var0.setContent("geo.google.GeoException: geo.google.GeoException: ");
    var0.setContent("G_GEO_UNKOWN_STATUS");
    var0.setContent("hi!");
    java.lang.String var7 = var0.getContent();
    var0.setContent("UNKNOWN_LOCATION");
    java.lang.String var10 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test38");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var3 = var0.createAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var4 = var0.createAddressDetailsPostalServiceElementsAddressLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test39");


    geo.google.GeoAddressStandardizer var2 = new geo.google.GeoAddressStandardizer("", 0L);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test40");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var2 = var0.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = var3.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var5 = var3.getAddressLines();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var6 = var3.getCountry();
    var3.setCode("geo.google.GeoException: ");
    javax.xml.bind.JAXBElement var9 = var0.createAddressDetails(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var10 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var11 = var0.createPostalCodePostTownPostTownName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test41");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@24493185[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      geo.google.datamodel.GeoCoordinate var3 = var1.standardizeToGeoCoordinate("geo.google.datamodel.GeoAddress@41de9cef[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7e1130b1\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
      fail("Expected exception of type geo.google.GeoException");
    } catch (geo.google.GeoException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test42");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var2 = var0.getAddressLines();
    java.util.List var3 = var0.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var4 = var0.getAddressLines();
    var0.setUsage("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var8 = var7.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var9 = var7.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var10 = var7.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var11 = var7.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var12 = var7.createAddressLinesType();
    java.util.List var13 = var12.getAny();
    var0.setAddressLines(var12);
    var0.setValidFromDate("geo.google.datamodel.GeoUsAddress@728c3b08[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5477c4f8[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@324a11b[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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
    assertNotNull(var13);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test43");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix();
    java.lang.String var1 = var0.getNumberPrefixSeparator();
    var0.setType("geo.google.datamodel.GeoAddress@35952ba9[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var4 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test44");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var4 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var5 = var4.getPostalCode();
    java.util.List var6 = var4.getSubAdministrativeAreaName();
    
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

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test45");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    java.lang.String var1 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test46");


    geo.google.datamodel.GeoStatusCode var3 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var4 = new geo.google.GeoException("", var3);
    geo.google.datamodel.GeoStatusCode var7 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var8 = new geo.google.GeoException("", var7);
    geo.google.GeoException var9 = new geo.google.GeoException("G_GEO_UNKOWN_STATUS", (java.lang.Throwable)var4, var7);
    geo.google.GeoException var10 = new geo.google.GeoException((java.lang.Throwable)var9);
    geo.google.datamodel.GeoStatusCode var11 = var10.getStatus();
    geo.google.datamodel.GeoStatusCode var16 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var17 = new geo.google.GeoException("", var16);
    geo.google.GeoException var18 = new geo.google.GeoException("geo.google.GeoException: ", var16);
    geo.google.datamodel.GeoStatusCode var19 = var18.getStatus();
    geo.google.datamodel.GeoStatusCode var22 = geo.google.datamodel.GeoStatusCode.getStatusCode(1);
    geo.google.GeoException var23 = new geo.google.GeoException("", var22);
    java.lang.String var24 = var22.getDescription();
    geo.google.GeoException var25 = new geo.google.GeoException("geo.google.datamodel.GeoAddress@730dc6d0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", (java.lang.Throwable)var18, var22);
    geo.google.GeoException var26 = new geo.google.GeoException((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Uknown Status"+ "'", var24.equals("Uknown Status"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test47");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection();
    java.lang.String var1 = var0.getCode();
    var0.setType("hi!");
    java.lang.String var4 = var0.getType();
    var0.setType("geo.google.datamodel.GeoAddress@2de26f07[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var7 = var0.getCode();
    var0.setCode("geo.google.datamodel.GeoUsAddress@1f5fa11d[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3f4a8702[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@35e5b4c4[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test48");


    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var1 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    var0.setMailStopName(var1);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var3 = var0.getMailStopNumber();
    geo.google.datamodel.GeoCoordinate var11 = new geo.google.datamodel.GeoCoordinate();
    double var12 = var11.getLongitude();
    geo.google.datamodel.GeoCoordinate var13 = new geo.google.datamodel.GeoCoordinate();
    double var14 = var13.getLongitude();
    double var15 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var11, var13);
    double var16 = var13.getLatitude();
    var13.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var20 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var21 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var13, var20);
    java.lang.String var22 = var21.toAddressLine();
    var21.setCountry("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var21.setCity("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var27 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var28 = var27.getCode();
    java.lang.String var29 = var27.getCode();
    boolean var30 = var21.equals((java.lang.Object)var27);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var31 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var32 = var31.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var33 = var31.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var34 = var33.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var35 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var36 = var35.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var37 = var35.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var38 = var35.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var39 = var35.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var40 = var35.createLargeMailUserTypeLargeMailUserIdentifier();
    var33.setLargeMailUserIdentifier(var40);
    java.lang.String var42 = var33.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var43 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var43.setIndicator("G_GEO_UNKOWN_STATUS");
    var33.setPostBox(var43);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var47 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var48 = var47.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var49 = var47.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var50 = var47.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var51 = var47.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var52 = var47.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var53 = var47.createFirmType();
    var43.setFirm(var53);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var55 = var53.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var56 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var53.setMailStop(var56);
    java.lang.String var58 = var56.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var59 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName();
    java.lang.String var60 = var59.getContent();
    var59.setContent("(default) Indicates to ignore an altitude specification");
    var56.setMailStopName(var59);
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var64 = var56.getMailStopNumber();
    java.util.List var65 = var56.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var66 = var56.getMailStopName();
    boolean var67 = var21.equals((java.lang.Object)var66);
    var66.setType("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setMailStopName(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"+ "'", var22.equals("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test49");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var4 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var5 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var6 = var0.createAddressDetailsPostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var7 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var8 = var7.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var9 = var7.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var10 = var7.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var11 = var7.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    java.lang.String var12 = var11.getCode();
    java.lang.String var13 = var11.getCode();
    var11.setType("geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var11.setContent("geo.google.datamodel.GeoUsAddress@7a855e06[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@49e01ac1[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@17fc9acb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var6.setAddressLongitudeDirection(var11);
    
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
    assertNull(var13);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test50");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    java.util.List var5 = var0.getSubPremiseNumberSuffix();
    java.util.Map var6 = var0.getOtherAttributes();
    var0.setType("(default) Indicates to ignore an altitude specification");
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var9 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var10 = var9.getSubPremiseNumberPrefix();
    var9.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var13 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var14 = var13.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var15 = var14.getMailStopNumber();
    java.util.Map var16 = var14.getOtherAttributes();
    var9.setMailStop(var14);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var19 = var18.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var20 = var18.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var21 = var20.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var22 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var23 = var22.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var24 = var22.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var25 = var22.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var26 = var22.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var27 = var22.createLargeMailUserTypeLargeMailUserIdentifier();
    var20.setLargeMailUserIdentifier(var27);
    java.lang.String var29 = var20.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var30 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var30.setIndicator("G_GEO_UNKOWN_STATUS");
    var20.setPostBox(var30);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var34 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var35 = var34.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var36 = var34.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var37 = var34.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var38 = var34.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var39 = var34.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var40 = var34.createFirmType();
    var30.setFirm(var40);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var42 = var40.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var43 = new oasis.names.tc.ciq.xsdschema.xal._2.MailStopType();
    var40.setMailStop(var43);
    var9.setFirm(var40);
    java.lang.String var46 = var9.getType();
    var0.setSubPremise(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var48 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation();
    java.lang.String var49 = var48.getCode();
    var9.setSubPremiseLocation(var48);
    java.util.List var51 = var9.getSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var52 = var9.getFirm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test51");


    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber();
    java.lang.String var1 = var0.getIndicator();
    java.lang.String var2 = var0.getIndicator();
    java.lang.String var3 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test52");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType var6 = var0.createBuildingNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var7 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var8 = var0.createThoroughfareNameType();
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

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test53");


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
    var31.setContent("");
    var31.setCode("geo.google.datamodel.GeoAddress@3d69ac3a[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test54");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var1 = var0.getAddressDetails();
    geo.google.datamodel.GeoCoordinate var2 = var0.getCoordinate();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = var0.getAddressDetails();
    geo.google.datamodel.GeoAddressAccuracy var4 = var0.getAccuracy();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var5 = var0.getAddressDetails();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test55");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    java.lang.String var1 = var0.toString();
    geo.google.datamodel.GeoAddressAccuracy var2 = var0.getAccuracy();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = var3.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var5 = var3.getThoroughfare();
    var0.setAddressDetails(var3);
    geo.google.datamodel.GeoAddress var7 = new geo.google.datamodel.GeoAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var7.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var9 = var7.getAddressDetails();
    geo.google.datamodel.GeoAddressAccuracy var10 = var7.getAccuracy();
    var0.setAccuracy(var10);
    java.lang.String var12 = var10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "geo.google.datamodel.GeoAddress@7261469[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var1.equals("geo.google.datamodel.GeoAddress@7261469[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "UNKNOWN_LOCATION"+ "'", var12.equals("UNKNOWN_LOCATION"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test56");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var5 = var0.createFirmType();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var6 = var0.createPremiseNumberPrefix();
    java.util.Map var7 = var6.getOtherAttributes();
    var6.setCode("geo.google.GeoException: ");
    java.lang.String var10 = var6.getValue();
    var6.setCode("geo.google.datamodel.GeoAddress@56341578[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test57");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var5 = var0.createFirmType();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var6 = var0.createPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var7 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    java.lang.String var8 = var7.getContent();
    java.lang.String var9 = var7.getType();
    var7.setType("geo.google.datamodel.GeoAddress@5b7990ca[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test58");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var11 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    var0.setAddressLongitude(var11);
    java.lang.String var13 = var11.getCode();
    var11.setContent("geo.google.datamodel.GeoUsAddress@2844609c[\n  _addressLine1=geo.google.datamodel.GeoAddress@2eda413f[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7af1a720\n  _addressLine=geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]\n  _postalCode=geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@2122b66b[_latitude=-1.0,_longitude=69.09332413987235,_altitude=geo.google.datamodel.GeoAltitude@6df63bcb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var11.setCode("geo.google.datamodel.GeoUsAddress@2844609c[\n  _addressLine1=geo.google.datamodel.GeoAddress@2eda413f[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@7af1a720\n  _addressLine=geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=G_GEO_UNKOWN_STATUS, geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=hi!\n  _accuracy=UNKNOWN_LOCATION\n]\n  _postalCode=geo.google.datamodel.GeoAddress@49e11d13[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@2122b66b[_latitude=-1.0,_longitude=69.09332413987235,_altitude=geo.google.datamodel.GeoAltitude@6df63bcb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test59");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var3 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var4 = var0.createPremiseNumber();
    var4.setNumberType("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var7 = var4.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test60");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLine var4 = var0.createAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var5 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var6 = var0.createAddressDetailsPostalServiceElementsAddressLongitude();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var7 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var8 = var0.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName var9 = var0.createAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var10 = var0.createThoroughfareNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName var11 = var0.createAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName();
    java.lang.String var12 = var11.getCode();
    
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
    assertNull(var12);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test61");


    geo.google.datamodel.GeoCoordinate var1 = new geo.google.datamodel.GeoCoordinate();
    double var2 = var1.getLongitude();
    geo.google.datamodel.GeoCoordinate var3 = new geo.google.datamodel.GeoCoordinate();
    double var4 = var3.getLongitude();
    double var5 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var1, var3);
    geo.google.datamodel.GeoCoordinate var6 = new geo.google.datamodel.GeoCoordinate();
    double var7 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInMiles(var1, var6);
    geo.google.datamodel.GeoCoordinate var8 = new geo.google.datamodel.GeoCoordinate();
    double var9 = var8.getLongitude();
    geo.google.datamodel.GeoCoordinate var10 = new geo.google.datamodel.GeoCoordinate();
    double var11 = var10.getLongitude();
    double var12 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var8, var10);
    geo.google.datamodel.GeoAltitude var13 = var10.getAltitude();
    double var14 = var6.distanceTo(var10);
    var6.setLatitude(10.0d);
    geo.google.datamodel.GeoAltitude var17 = var6.getAltitude();
    java.lang.String var18 = var17.toString();
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var19 = var17.getMode();
    geo.google.datamodel.GeoAltitude var20 = new geo.google.datamodel.GeoAltitude(3242.21599983718d, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test62");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var7 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var8 = var0.createPostalCodePostalCodeNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var9 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix var10 = var0.createPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseName var11 = var0.createPremisePremiseName();
    
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test63");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var10 = var0.createThoroughfare();
    java.util.Map var11 = var10.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var13 = var12.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var14 = var12.createThoroughfareThoroughfareNumberRangeThoroughfareNumberTo();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var15 = var12.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var16 = var12.createPostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var17 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var18 = var17.getIndicator();
    java.lang.String var19 = var17.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var20 = var17.getSubAdministrativeArea();
    var17.setType("Uknown Status");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var24 = var23.createPremise();
    java.util.List var25 = var24.getAddressLine();
    java.util.List var26 = var24.getAny();
    var24.setType("");
    var24.setPremiseThoroughfareConnector("geo.google.GeoException: ");
    java.util.List var31 = var24.getPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var32 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var33 = var32.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var34 = var32.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var35 = var32.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var36 = var32.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var37 = var32.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var38 = var32.createFirmType();
    var24.setFirm(var38);
    java.util.List var40 = var38.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var41 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var42 = var41.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopName var43 = var41.createMailStopTypeMailStopName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var44 = var41.createPostalCode();
    var38.setPostalCode(var44);
    var17.setPostalCode(var44);
    var16.setPostalCode(var44);
    var10.setPostalCode(var44);
    var10.setType("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var51 = var10.getThoroughfareTrailingType();
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test64");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressIdentifier();
    var0.setContent("G_GEO_UNKOWN_STATUS");
    java.lang.String var3 = var0.getType();
    var0.setContent("");
    var0.setType("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var0.getContent();
    var0.setIdentifierType("geo.google.datamodel.GeoAddress@5a07d6a1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var11 = var0.getIdentifierType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "geo.google.datamodel.GeoAddress@5a07d6a1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var11.equals("geo.google.datamodel.GeoAddress@5a07d6a1[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test65");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeName var6 = var0.createPostOfficePostOfficeName();
    var6.setType("geo.google.GeoException: ");
    var6.setType("G_GEO_UNKOWN_STATUS");
    java.util.Map var11 = var6.getOtherAttributes();
    var6.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.util.Map var14 = var6.getOtherAttributes();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test66");


    geo.google.datamodel.GeoCoordinate var7 = new geo.google.datamodel.GeoCoordinate();
    double var8 = var7.getLongitude();
    geo.google.datamodel.GeoCoordinate var9 = new geo.google.datamodel.GeoCoordinate();
    double var10 = var9.getLongitude();
    double var11 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var7, var9);
    double var12 = var9.getLatitude();
    var9.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var16 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var17 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var9, var16);
    java.lang.String var18 = var17.getState();
    java.lang.String var19 = var17.getCounty();
    var17.setPostalCode("CLAMP_TO_GROUND");
    var17.setAddressLine2("geo.google.datamodel.GeoAddress@41778a2e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var24 = var17.getPostalCode();
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Uknown Status"+ "'", var19.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "CLAMP_TO_GROUND"+ "'", var24.equals("CLAMP_TO_GROUND"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test67");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.KmlType var2 = var0.createKmlType();
    com.google.earth.kml._2.ObjectFactory var3 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var4 = var3.createResponseType();
    com.google.earth.kml._2.KmlType var5 = var3.createKmlType();
    com.google.earth.kml._2.ResponseType var6 = var5.getResponse();
    javax.xml.bind.JAXBElement var7 = var0.createKml(var5);
    geo.google.mapping.PointToCoordinateFunctor var8 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var9 = new com.google.earth.kml._2.PointType();
    var9.setTessellate((java.lang.Boolean)true);
    var9.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var14 = var8.execute(var9);
    com.google.earth.kml._2.PointType var15 = new com.google.earth.kml._2.PointType();
    var15.setTessellate((java.lang.Boolean)true);
    java.lang.Boolean var18 = var15.isTessellate();
    geo.google.datamodel.GeoCoordinate var19 = var8.execute(var15);
    com.google.earth.kml._2.AltitudeModeType var20 = var15.getAltitudeMode();
    javax.xml.bind.JAXBElement var21 = var0.createPoint(var15);
    com.google.earth.kml._2.StatusType var22 = var0.createStatusType();
    com.google.earth.kml._2.PointType var23 = var0.createPointType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + true+ "'", var18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test68");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var4 = var0.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var5 = var0.createPostBoxPostBoxNumberExtension();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var6 = var0.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var7 = var0.createAddressDetailsPostalServiceElementsAddressLongitude();
    java.util.Map var8 = var7.getOtherAttributes();
    
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

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test69");


    geo.google.GeoAddressStandardizer var1 = new geo.google.GeoAddressStandardizer("geo.google.datamodel.GeoAddress@40d5cdb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test70");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
    java.util.Map var1 = var0.getOtherAttributes();
    java.lang.String var2 = var0.getType();
    java.util.Map var3 = var0.getOtherAttributes();
    java.util.Map var4 = var0.getOtherAttributes();
    var0.setContent("geo.google.datamodel.GeoAddress@2ea7c82[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test71");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityName var3 = var0.createDependentLocalityTypeDependentLocalityName();
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

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test72");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var2 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var3 = var0.createSubPremiseTypeSubPremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var4 = var0.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var5 = var0.createSubPremiseTypeSubPremiseLocation();
    java.lang.String var6 = var5.getContent();
    var5.setCode("geo.google.datamodel.GeoAddress@3a20cbfc[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test73");


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
    java.lang.String var13 = var0.getCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var14 = var0.getAddressLines();
    com.google.earth.kml._2.PlacemarkType var15 = new com.google.earth.kml._2.PlacemarkType();
    var15.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var18 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var19 = var18.getValidToDate();
    var18.setAddressDetailsKey("hi!");
    var15.setAddressDetails(var18);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var23 = var15.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var24 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var25 = var24.getAddress();
    java.lang.String var26 = var24.getUsage();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var27 = var24.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var28 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var29 = var28.getContent();
    var28.setType("Uknown Status");
    var24.setAddress(var28);
    var23.setAddress(var28);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var34 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var35 = var34.getAny();
    java.util.List var36 = var34.getAny();
    var23.setPostalServiceElements(var34);
    var23.setAddressType("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var40 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var41 = var40.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var42 = var40.getAddressLines();
    var40.setUsage("");
    var40.setCode("G_GEO_UNKOWN_STATUS");
    var40.setCode("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var49 = var40.getLocality();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var50 = var40.getPostalServiceElements();
    java.util.Map var51 = var40.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var52 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var53 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var54 = var53.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var55 = var53.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var56 = var55.getCode();
    java.util.Map var57 = var55.getOtherAttributes();
    var55.setCode("G_GEO_UNKOWN_STATUS");
    var52.setEndorsementLineCode(var55);
    var40.setPostalServiceElements(var52);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var62 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var63 = var62.getContent();
    var62.setCode("");
    var40.setAddress(var62);
    java.util.Map var67 = var62.getOtherAttributes();
    java.lang.String var68 = var62.getCode();
    var23.setAddress(var62);
    var0.setAddress(var62);
    var62.setCode("geo.google.datamodel.GeoUsAddress@1a4a00a5[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@41778a2e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@25d14add[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@70705e1e[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@61333d3d[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test74");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var6 = var0.createAddressDetailsPostalServiceElementsAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var7 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var8 = var0.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumber var9 = var0.createPostBoxPostBoxNumber();
    
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

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test75");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var22 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var23 = var22.getAddressLatitudeDirection();
    var22.setType("geo.google.GeoException: geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var26 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var27 = var26.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var28 = var26.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var29 = var26.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var30 = var26.createThoroughfareTrailingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var31 = var26.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    var31.setType("geo.google.GeoException: ");
    var22.setAddressLatitudeDirection(var31);
    var12.setAddressLatitudeDirection(var31);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var36 = var12.getAddressLongitude();
    java.util.Map var37 = var12.getOtherAttributes();
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test76");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var1 = var0.getAddressLongitudeDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test77");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var6 = var0.createPostalCodePostTownPostTownName();
    var6.setType("(default) Indicates to ignore an altitude specification");
    var6.setCode("geo.google.GeoException: hi!");
    var6.setContent("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var6.setContent("geo.google.datamodel.GeoUsAddress@498d6d41[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@63ffec20[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@36e75c2a[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test78");


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
    java.lang.String var16 = var6.getType();
    java.lang.String var17 = var6.getType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test79");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var17 = var5.getPremiseNumberRangeFrom();
    
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
    assertNull(var17);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test80");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    java.lang.String var3 = var2.getType();
    var2.setContent("");
    var2.setCode("G_GEO_UNKOWN_STATUS");
    var2.setType("UNKNOWN_LOCATION");
    var2.setType("geo.google.datamodel.GeoAddress@342bba4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test81");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var1 = var0.getAddress();
    java.lang.String var2 = var0.getValidToDate();
    java.lang.String var3 = var0.getAddressDetailsKey();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var4 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address();
    java.lang.String var5 = var4.getContent();
    var4.setType("Uknown Status");
    var4.setCode("UNKNOWN_LOCATION");
    var0.setAddress(var4);
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var11 = var0.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var12 = var0.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test82");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setContent("geo.google.GeoException: ");
    var0.setIndicatorOccurrence("");
    java.lang.String var5 = var0.getType();
    java.lang.String var6 = var0.getContent();
    var0.setNumberOccurrence("");
    java.lang.String var9 = var0.getNumberType();
    var0.setContent("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setNumberType("geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var14 = var0.getContent();
    var0.setCode("geo.google.datamodel.GeoAddress@79386135[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setNumberType("geo.google.datamodel.GeoUsAddress@7373258[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@38ca331b[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@62e14ebd[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "geo.google.GeoException: "+ "'", var6.equals("geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var14.equals("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test83");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getAny();
    java.util.List var3 = var1.getBuildingName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var4 = var1.getPostalCode();
    java.lang.String var5 = var1.getPremiseThoroughfareConnector();
    
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

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test84");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var6 = var0.createXAL();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var7 = var0.createSubPremiseType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var8 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var9 = var8.getSubPremiseNumberPrefix();
    var8.setType("");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var12 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var13 = var12.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var14 = var13.getMailStopNumber();
    java.util.Map var15 = var13.getOtherAttributes();
    var8.setMailStop(var13);
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation var17 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseLocation();
    var17.setContent("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var20 = var17.getContent();
    var8.setSubPremiseLocation(var17);
    var7.setSubPremise(var8);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var24 = var23.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var25 = var23.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var26 = var25.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var27 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var28 = var27.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var29 = var27.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var30 = var27.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var31 = var27.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var32 = var27.createLargeMailUserTypeLargeMailUserIdentifier();
    var25.setLargeMailUserIdentifier(var32);
    java.lang.String var34 = var25.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var35 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    var35.setIndicator("G_GEO_UNKOWN_STATUS");
    var25.setPostBox(var35);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var39 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var40 = var39.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var41 = var39.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var42 = var39.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var43 = var39.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var44 = var39.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var45 = var39.createFirmType();
    var35.setFirm(var45);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var47 = var45.getPostalCode();
    var45.setType("(default) Indicates to ignore an altitude specification");
    java.util.List var50 = var45.getAny();
    var8.setFirm(var45);
    java.util.Map var52 = var8.getOtherAttributes();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var20.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
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
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test85");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var6 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var7 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumber var8 = var0.createPostalCodePostalCodeNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var9 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberFrom var10 = var0.createThoroughfareThoroughfareNumberRangeThoroughfareNumberFrom();
    oasis.names.tc.ciq.xsdschema.xal._2.XAL var11 = var0.createXAL();
    
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

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test86");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var2 = var0.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var3 = var0.createSubPremiseTypeSubPremiseName();
    java.lang.String var4 = var3.getTypeOccurrence();
    var3.setType("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    var3.setTypeOccurrence("geo.google.datamodel.GeoAddress@2de26f07[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setCode("geo.google.datamodel.GeoAddress@718b3c08[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test87");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var1 = var0.createPremise();
    java.util.List var2 = var1.getBuildingName();
    java.util.List var3 = var1.getAddressLine();
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
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var15 = var14.createPremise();
    java.lang.String var16 = var15.getPremiseThoroughfareConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var17 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation();
    var15.setPremiseLocation(var17);
    var5.setPremiseLocation(var17);
    var17.setContent("Uknown Status");
    java.util.Map var22 = var17.getOtherAttributes();
    java.lang.String var23 = var17.getCode();
    var17.setContent("geo.google.datamodel.GeoAddress@6921ddb6[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var1.setPremiseLocation(var17);
    java.util.List var27 = var1.getPremiseNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var28 = var1.getFirm();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var29 = var1.getPostalCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test88");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var5 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var6 = var5.createAddressDetailsPostalServiceElementsSortingCode();
    var0.setSortingCode(var6);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var9 = var8.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var10 = var8.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var11 = var8.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var12 = var8.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var13 = var8.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var14 = var8.createAddressDetailsPostalServiceElementsKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var15 = var8.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var16 = var8.createAddressDetailsPostalServiceElements();
    geo.google.datamodel.GeoAltitude var22 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var23 = var22.getMode();
    geo.google.datamodel.GeoCoordinate var24 = new geo.google.datamodel.GeoCoordinate(0.0d, 1.0d, var22);
    geo.google.datamodel.GeoCoordinate var25 = new geo.google.datamodel.GeoCoordinate(100.0d, 100.0d, var22);
    geo.google.datamodel.GeoAltitude var29 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var30 = var29.getMode();
    geo.google.datamodel.GeoCoordinate var31 = new geo.google.datamodel.GeoCoordinate(0.0d, 1.0d, var29);
    double var32 = var31.getLongitude();
    boolean var33 = var25.equals((java.lang.Object)var32);
    var25.setLongitude(1.0d);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var36 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var37 = var36.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var38 = var36.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var39 = var36.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName var40 = var36.createAdministrativeAreaSubAdministrativeAreaSubAdministrativeAreaName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var41 = var36.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var42 = var36.createSubPremiseTypeSubPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var43 = var36.createThoroughfareTrailingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var44 = var36.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    boolean var45 = var25.equals((java.lang.Object)var44);
    var16.setAddressLatitudeDirection(var44);
    var0.setAddressLatitudeDirection(var44);
    java.lang.String var48 = var44.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test89");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumber();
    var0.setCode("");
    var0.setType("G_GEO_UNKOWN_STATUS");
    var0.setCode("geo.google.datamodel.GeoAddress@62c859b5[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setCode("geo.google.datamodel.GeoAddress@1aba80d4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var9 = var0.getOtherAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test90");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    var0.setType("");
    java.lang.String var3 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var4 = var0.getThoroughfareTrailingType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var5 = var0.getThoroughfarePreDirection();
    java.util.List var6 = var0.getAddressLine();
    var0.setType("geo.google.datamodel.GeoUsAddress@9927c98[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@7031e410[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@5b740ffb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoAddress@3a720269[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n] geo.google.datamodel.GeoAddress@77278fe3[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test91");


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
    java.util.Map var25 = var17.getOtherAttributes();
    var17.setContent("geo.google.datamodel.GeoUsAddress@541af6ab[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@36387fb0[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3747179f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var28 = var17.getContent();
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "geo.google.datamodel.GeoUsAddress@541af6ab[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@36387fb0[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3747179f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var28.equals("geo.google.datamodel.GeoUsAddress@541af6ab[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@36387fb0[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3747179f[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test92");


    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostalCodeNumberExtension();
    var0.setCode("(default) Indicates to ignore an altitude specification");
    java.util.Map var3 = var0.getOtherAttributes();
    java.lang.String var4 = var0.getCode();
    var0.setNumberExtensionSeparator("geo.google.datamodel.GeoAddress@77278fe3[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setNumberExtensionSeparator("geo.google.datamodel.GeoAddress@25d14add[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(default) Indicates to ignore an altitude specification"+ "'", var4.equals("(default) Indicates to ignore an altitude specification"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test93");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    var0.setAddressLine("UNKNOWN_LOCATION");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = var0.getAddressDetails();
    geo.google.datamodel.GeoAddress var4 = new geo.google.datamodel.GeoAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var5 = var4.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var6 = var4.getAddressDetails();
    geo.google.datamodel.GeoAddressAccuracy var7 = var4.getAccuracy();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var4.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var9 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var10 = var9.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var11 = var9.getAddressLines();
    var9.setUsage("");
    var9.setUsage("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var16 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var16.setThoroughfarePostDirection(var17);
    java.util.List var19 = var16.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var20 = var16.getThoroughfareLeadingType();
    var9.setThoroughfare(var16);
    java.lang.String var22 = var9.getCode();
    var4.setAddressDetails(var9);
    var0.setAddressDetails(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test94");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var5 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var6 = var0.createPostalCodePostTownPostTownSuffix();
    var6.setContent("geo.google.datamodel.GeoAddress@76a0b14e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test95");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var4 = var0.createThoroughfareLeadingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var5 = var0.createSubPremiseTypeSubPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var6 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var6.setCode("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var9 = var6.getCode();
    
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
    assertTrue("'" + var9 + "' != '" + "geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var9.equals("geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test96");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var17 = var8.getDependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var18 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var19 = var18.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var20 = var18.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var21 = var18.createThoroughfareLeadingTypeType();
    java.util.Map var22 = var21.getOtherAttributes();
    java.lang.String var23 = var21.getContent();
    var8.setThoroughfareLeadingType(var21);
    java.util.Map var25 = var21.getOtherAttributes();
    
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test97");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserIdentifier var3 = var2.getLargeMailUserIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var5 = var4.getPostalCode();
    java.lang.String var6 = var4.getConnector();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var7 = var4.getLargeMailUser();
    java.util.List var8 = var4.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var9 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    var4.setPostalCode(var9);
    var2.setPostalCode(var9);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var12 = var2.getPostalCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test98");


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
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var12 = var0.createPremiseNumber();
    java.lang.String var13 = var12.getIndicatorOccurrence();
    
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

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test99");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var2 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var3 = var0.createThoroughfareTrailingTypeType();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var4 = var0.createAdministrativeAreaAdministrativeAreaName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var5 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var6 = var0.createDependentLocalityTypeDependentLocalityNumber();
    java.util.Map var7 = var6.getOtherAttributes();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test100");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo var11 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeTo();
    java.util.List var12 = var11.getAddressLine();
    var5.setPremiseNumberRangeTo(var11);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var14 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var15 = var14.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var16 = var14.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var17 = var14.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var18 = var14.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var19 = var14.createPremisePremiseNumberRange();
    var19.setIndicator("G_GEO_UNKOWN_STATUS");
    var19.setType("hi!");
    java.lang.String var24 = var19.getIndicator();
    java.lang.String var25 = var19.getRangeType();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var26 = var19.getPremiseNumberRangeFrom();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var27 = new oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom();
    java.util.List var28 = var27.getPremiseNumberPrefix();
    java.util.List var29 = var27.getPremiseNumberPrefix();
    var19.setPremiseNumberRangeFrom(var27);
    var5.setPremiseNumberRangeFrom(var27);
    java.util.List var32 = var27.getPremiseNumberPrefix();
    
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
    assertNotNull(var12);
    
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
    assertTrue("'" + var24 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var24.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test101");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberSuffix();
    java.lang.String var1 = var0.getCode();
    var0.setType("hi!");
    var0.setCode("G_GEO_UNKOWN_STATUS");
    java.lang.String var6 = var0.getNumberSuffixSeparator();
    var0.setNumberSuffixSeparator("geo.google.datamodel.GeoAddress@62e22a31[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test102");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    var2.setContent("geo.google.GeoException: ");
    var2.setCode("Uknown Status");
    java.lang.String var7 = var2.getNumberPrefixSeparator();
    java.util.Map var8 = var2.getOtherAttributes();
    var2.setType("geo.google.datamodel.GeoUsAddress@1add92c3[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@48ce4dfc[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@606200bb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var11 = var2.getType();
    java.lang.String var12 = var2.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "geo.google.datamodel.GeoUsAddress@1add92c3[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@48ce4dfc[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@606200bb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var11.equals("geo.google.datamodel.GeoUsAddress@1add92c3[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@48ce4dfc[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@606200bb[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "geo.google.GeoException: "+ "'", var12.equals("geo.google.GeoException: "));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test103");


    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setCode("geo.google.datamodel.GeoAddress@4244bb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var4 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "geo.google.datamodel.GeoAddress@4244bb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var4.equals("geo.google.datamodel.GeoAddress@4244bb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test104");


    geo.google.datamodel.GeoAddress var0 = new geo.google.datamodel.GeoAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var1 = var0.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var2 = var0.getAddressDetails();
    geo.google.datamodel.GeoAddressAccuracy var3 = var0.getAccuracy();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var4 = var0.getAddressDetails();
    var0.setAddressLine("(default) Indicates to ignore an altitude specification");
    geo.google.datamodel.GeoCoordinate var7 = var0.getCoordinate();
    geo.google.datamodel.GeoAddress var8 = new geo.google.datamodel.GeoAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var9 = var8.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var10 = var8.getAddressDetails();
    java.lang.String var11 = var8.toString();
    var8.setAddressLine("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    geo.google.datamodel.GeoAddressAccuracy var14 = var8.getAccuracy();
    var0.setAccuracy(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "geo.google.datamodel.GeoAddress@599a6e8c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var11.equals("geo.google.datamodel.GeoAddress@599a6e8c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test105");


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
    var15.setCode("geo.google.datamodel.GeoAddress@25f21dc8[\n  _coordinate=<null>\n  _addressDetails=oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails@3a8148ee\n  _addressLine=geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test106");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var3 = var0.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberPrefix var4 = var0.createThoroughfareNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var5 = var0.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var6 = var0.createPostalCodePostTown();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var7 = var0.createPremiseNumber();
    java.lang.String var8 = var7.getIndicator();
    
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

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test107");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix();
    java.util.Map var1 = var0.getOtherAttributes();
    var0.setType("hi!");
    var0.setNumberSuffixSeparator("");
    var0.setType("");
    var0.setType("geo.google.datamodel.GeoUsAddress@68ed4414[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=(default) Indicates to ignore an altitude specification\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3110b2dd[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3f4ee455[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var10 = var0.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test108");


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
    var17.setCountry("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var17.setCity("geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    geo.google.datamodel.GeoCoordinate var23 = var17.getCoordinate();
    var17.setState("UNKNOWN_LOCATION");
    var17.setAddressLine2("geo.google.datamodel.GeoAddress@3c53f765[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var28 = var17.toAddressLine();
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "geo.google.GeoException: , geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n], UNKNOWN_LOCATION UNKNOWN_LOCATION"+ "'", var28.equals("geo.google.GeoException: , geo.google.datamodel.GeoUsAddress@6e5fed59[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@5bd7a6ab[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@2aff53a8[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n], UNKNOWN_LOCATION UNKNOWN_LOCATION"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test109");


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
    var28.setState("");
    java.lang.String var31 = var28.getCounty();
    var28.setCounty("geo.google.GeoException: hi!");
    java.lang.String var34 = var28.getCounty();
    geo.google.datamodel.GeoAddressAccuracy var36 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var37 = var36.getName();
    int var38 = var36.getCode();
    java.lang.String var39 = var36.toString();
    var28.setAccuracy(var36);
    java.lang.String var41 = var36.getName();
    java.lang.String var42 = var36.getName();
    
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
    assertTrue("'" + var31 + "' != '" + "Uknown Status"+ "'", var31.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "geo.google.GeoException: hi!"+ "'", var34.equals("geo.google.GeoException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "UNKNOWN_LOCATION"+ "'", var37.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "UNKNOWN_LOCATION"+ "'", var39.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "UNKNOWN_LOCATION"+ "'", var41.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "UNKNOWN_LOCATION"+ "'", var42.equals("UNKNOWN_LOCATION"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test110");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    var0.setType("G_GEO_UNKOWN_STATUS");
    var0.setNumberType("hi!");
    java.lang.String var5 = var0.getNumberTypeOccurrence();
    var0.setContent("geo.google.GeoException: hi!, geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n], geo.google.GeoException:  geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var0.getNumberType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test111");


    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType();
    java.lang.String var1 = var0.getType();
    java.util.Map var2 = var0.getOtherAttributes();
    java.lang.String var3 = var0.getContent();
    java.lang.String var4 = var0.getCode();
    java.lang.String var5 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test112");


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
    java.util.List var16 = var9.getThoroughfareName();
    
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
    assertNotNull(var16);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test113");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    java.util.List var5 = var4.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePreDirectionType var6 = var4.getThoroughfarePreDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare var7 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.DependentThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var8 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType();
    java.lang.String var9 = var8.getCode();
    java.lang.String var10 = var8.getCode();
    var7.setThoroughfareTrailingType(var8);
    java.util.List var12 = var7.getAny();
    var7.setType("G_GEO_UNKOWN_STATUS");
    var4.setDependentThoroughfare(var7);
    var7.setType("G_GEO_UNKOWN_STATUS");
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareTrailingTypeType var18 = var7.getThoroughfareTrailingType();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test114");


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
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var13 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var14 = var0.createMailStopTypeMailStopNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test115");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    java.lang.String var2 = var1.getType();
    var1.setCode("geo.google.datamodel.GeoAddress@6c4c5429[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test116");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setRangeType("hi!");
    var0.setIndicatorOccurrence("hi!");
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange.ThoroughfareNumberTo var7 = var0.getThoroughfareNumberTo();
    var0.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@e474122[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.List var10 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test117");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    java.util.List var3 = var2.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var4 = var2.getPostOfficeNumber();
    java.lang.String var5 = var2.getType();
    var2.setType("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var8 = var2.getPostalCode();
    var2.setIndicator("geo.google.datamodel.GeoAddress@357d260d[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var12 = var11.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country.CountryNameCode var13 = var11.createAddressDetailsCountryCountryNameCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseName var14 = var11.createSubPremiseTypeSubPremiseName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.PostOfficeNumber var15 = var11.createPostOfficePostOfficeNumber();
    java.lang.String var16 = var15.getCode();
    var15.setContent("geo.google.GeoException: hi!");
    var15.setIndicatorOccurrence("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var21 = var15.getContent();
    java.lang.String var22 = var15.getCode();
    var2.setPostOfficeNumber(var15);
    var15.setCode("geo.google.datamodel.GeoUsAddress@46478daa[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@3a5b7f2[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@74cf72bc[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var26 = var15.getIndicatorOccurrence();
    
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
    assertNull(var8);
    
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
    assertTrue("'" + var21 + "' != '" + "geo.google.GeoException: hi!"+ "'", var21.equals("geo.google.GeoException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var26.equals("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test118");


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
    oasis.names.tc.ciq.xsdschema.xal._2.Locality var17 = new oasis.names.tc.ciq.xsdschema.xal._2.Locality();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var18 = var17.getPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var19 = var17.getPremise();
    var0.setLocality(var17);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var21 = var0.getCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var22 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var24 = var23.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.EndorsementLineCode var25 = var23.createAddressDetailsPostalServiceElementsEndorsementLineCode();
    java.lang.String var26 = var25.getCode();
    java.util.Map var27 = var25.getOtherAttributes();
    var25.setCode("G_GEO_UNKOWN_STATUS");
    var22.setEndorsementLineCode(var25);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var31 = var22.getAddressLatitude();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var32 = var22.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var33 = var22.getKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var34 = var22.getAddressLatitudeDirection();
    var22.setType("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION");
    java.util.List var37 = var22.getAddressIdentifier();
    var0.setPostalServiceElements(var22);
    java.lang.String var39 = var22.getType();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"+ "'", var39.equals("geo.google.GeoException: , geo.google.GeoException: hi!,  UNKNOWN_LOCATION"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test119");


    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber var0 = new oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumber();
    var0.setNumberType("G_GEO_UNKOWN_STATUS");
    var0.setNumberTypeOccurrence("");
    java.lang.String var5 = var0.getContent();
    var0.setNumberTypeOccurrence("geo.google.datamodel.GeoAddress@1dd53212[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setContent("geo.google.datamodel.GeoAddress@3e691d5f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test120");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var4 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var5 = var0.createAddressDetailsPostalServiceElementsBarcode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var6 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var7 = var0.createMailStopTypeMailStopNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownName var8 = var0.createPostalCodePostTownPostTownName();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.LargeMailUserName var9 = var0.createLargeMailUserTypeLargeMailUserName();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var10 = var0.createPremisePremiseLocation();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteNumber var11 = var0.createPostalRouteTypePostalRouteNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var12 = var0.createPostBoxPostBoxNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange.PremiseNumberRangeFrom var13 = var0.createPremisePremiseNumberRangePremiseNumberRangeFrom();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test121");


    com.google.earth.kml._2.ObjectFactory var0 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var1 = var0.createResponseType();
    com.google.earth.kml._2.ResponseType var2 = var0.createResponseType();
    com.google.earth.kml._2.PointType var3 = var0.createPointType();
    com.google.earth.kml._2.KmlType var4 = var0.createKmlType();
    com.google.earth.kml._2.ObjectFactory var5 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var6 = var5.createResponseType();
    com.google.earth.kml._2.ResponseType var7 = var5.createResponseType();
    com.google.earth.kml._2.PointType var8 = var5.createPointType();
    com.google.earth.kml._2.KmlType var9 = var5.createKmlType();
    geo.google.mapping.PointToCoordinateFunctor var10 = new geo.google.mapping.PointToCoordinateFunctor();
    com.google.earth.kml._2.PointType var11 = new com.google.earth.kml._2.PointType();
    var11.setTessellate((java.lang.Boolean)true);
    var11.setExtrude((java.lang.Boolean)false);
    geo.google.datamodel.GeoCoordinate var16 = var10.execute(var11);
    com.google.earth.kml._2.PointType var17 = new com.google.earth.kml._2.PointType();
    var17.setTessellate((java.lang.Boolean)true);
    java.lang.Boolean var20 = var17.isTessellate();
    geo.google.datamodel.GeoCoordinate var21 = var10.execute(var17);
    javax.xml.bind.JAXBElement var22 = var5.createPoint(var17);
    com.google.earth.kml._2.PlacemarkType var23 = var5.createPlacemarkType();
    com.google.earth.kml._2.ObjectFactory var24 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var25 = var24.createResponseType();
    com.google.earth.kml._2.PointType var26 = new com.google.earth.kml._2.PointType();
    var26.setTessellate((java.lang.Boolean)true);
    var26.setExtrude((java.lang.Boolean)false);
    java.lang.Boolean var31 = var26.isExtrude();
    var26.setCoordinates("Uknown Status");
    javax.xml.bind.JAXBElement var34 = var24.createPoint(var26);
    com.google.earth.kml._2.KmlType var35 = var24.createKmlType();
    com.google.earth.kml._2.ObjectFactory var36 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.KmlType var37 = new com.google.earth.kml._2.KmlType();
    javax.xml.bind.JAXBElement var38 = var36.createKml(var37);
    com.google.earth.kml._2.ObjectFactory var39 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var40 = var39.createResponseType();
    com.google.earth.kml._2.ResponseType var41 = var39.createResponseType();
    javax.xml.bind.JAXBElement var42 = var36.createResponse(var41);
    var41.setName("hi!");
    java.lang.String var45 = var41.getName();
    var35.setResponse(var41);
    javax.xml.bind.JAXBElement var47 = var5.createResponse(var41);
    var41.setName("geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var4.setResponse(var41);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + true+ "'", var20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test122");


    org.xml.sax.InputSource var1 = geo.google.utils.XmlUtils.stringToInputSource("geo.google.datamodel.GeoAddress@20f1bb24[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test123");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    var0.setAddress("geo.google.GeoException: ");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    java.lang.String var4 = var3.getValidToDate();
    var3.setAddressDetailsKey("hi!");
    var0.setAddressDetails(var3);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var8 = var0.getAddressDetails();
    var0.setId("geo.google.datamodel.GeoAddress@51a12706[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var11 = var0.getAddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails var12 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Address var13 = var12.getAddress();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var14 = var12.getAddressLines();
    java.util.List var15 = var12.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressLinesType var16 = var12.getAddressLines();
    var12.setCurrentStatus("geo.google.datamodel.GeoAddress@6f870497[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var12.setValidFromDate("geo.google.datamodel.GeoAddress@1dd53212[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setAddressDetails(var12);
    com.google.earth.kml._2.PointType var22 = new com.google.earth.kml._2.PointType();
    var22.setTessellate((java.lang.Boolean)true);
    var0.setPoint(var22);
    var22.setExtrude((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test124");


    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange var0 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare.ThoroughfareNumberRange();
    var0.setNumberRangeOccurrence("geo.google.GeoException: geo.google.GeoException: ");
    var0.setType("Uknown Status");
    var0.setRangeType("G_GEO_UNKOWN_STATUS");
    var0.setIndicator("");
    java.lang.String var9 = var0.getCode();
    java.lang.String var10 = var0.getType();
    java.util.List var11 = var0.getAddressLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Uknown Status"+ "'", var10.equals("Uknown Status"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test125");


    oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName var0 = new oasis.names.tc.ciq.xsdschema.xal._2.FirmType.FirmName();
    java.lang.String var1 = var0.getContent();
    java.lang.String var2 = var0.getType();
    var0.setCode("geo.google.datamodel.GeoAddress@16896f61[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var5 = var0.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "geo.google.datamodel.GeoAddress@16896f61[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"+ "'", var5.equals("geo.google.datamodel.GeoAddress@16896f61[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test126");


    geo.google.mapping.PointToCoordinateFunctor var0 = geo.google.mapping.PointToCoordinateFunctor.getInstance();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var1 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var1.createPremise();
    java.util.List var3 = var2.getAddressLine();
    geo.google.mapping.FunctionChain var4 = new geo.google.mapping.FunctionChain(var3);
    geo.google.mapping.FunctionChain var5 = new geo.google.mapping.FunctionChain((geo.google.mapping.Functor)var0, var4);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var6 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var7 = var6.createPremise();
    java.util.List var8 = var7.getAddressLine();
    geo.google.mapping.FunctionChain var9 = new geo.google.mapping.FunctionChain(var8);
    geo.google.mapping.FunctionChain var10 = var9.getTail();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var11 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var12 = var11.createPremise();
    java.util.List var13 = var12.getAddressLine();
    geo.google.mapping.FunctionChain var14 = new geo.google.mapping.FunctionChain(var13);
    var9.setTail(var14);
    var5.setTail(var14);
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var17 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var18 = new oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var19 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var18.setThoroughfarePostDirection(var19);
    java.util.List var21 = var18.getThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var22 = var18.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var23 = var18.getPostalCode();
    var17.setThoroughfare(var18);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var25 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var26 = var25.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var27 = var25.createDependentLocalityTypeDependentLocalityNumber();
    var17.setDependentLocalityNumber(var27);
    java.util.Map var29 = var17.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var30 = var17.getPostalCode();
    java.lang.Object var31 = var14.execute((java.lang.Object)var17);
    java.util.List var32 = var17.getAny();
    var17.setType("geo.google.datamodel.GeoAddress@573daff4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var35 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var36 = var35.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var37 = var35.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var38 = var35.createAdministrativeAreaSubAdministrativeArea();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.Country var39 = var35.createAddressDetailsCountry();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var40 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var41 = var40.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var42 = var40.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var43 = var40.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var44 = var40.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var45 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var46 = var45.createPremise();
    java.lang.String var47 = var46.getPremiseThoroughfareConnector();
    java.util.List var48 = var46.getAny();
    java.util.List var49 = var46.getPremiseName();
    var44.setPremise(var46);
    var39.setThoroughfare(var44);
    java.lang.String var52 = var44.getDependentThoroughfaresType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var53 = new oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType();
    var53.setType("hi!");
    var44.setThoroughfarePostDirection(var53);
    var44.setType("geo.google.datamodel.GeoAddress@35e7c9a0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.util.Map var59 = var44.getOtherAttributes();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var60 = var44.getPremise();
    var17.setPremise(var60);
    var17.setIndicator("geo.google.datamodel.GeoAddress@daa49d[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test127");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var1 = var0.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.AdministrativeAreaName var2 = var0.createAdministrativeAreaAdministrativeAreaName();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var3 = var0.createAddressDetailsPostalServiceElementsAddressLatitudeDirection();
    java.lang.String var4 = var3.getContent();
    var3.setContent("geo.google.datamodel.GeoAddress@5ff907ee[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var7 = var3.getCode();
    java.util.Map var8 = var3.getOtherAttributes();
    java.lang.String var9 = var3.getCode();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test128");


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
    java.lang.String var16 = var12.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var17 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var18 = var17.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var19 = var17.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var20 = var17.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var21 = var20.getType();
    java.util.List var22 = var20.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var23 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var24 = var23.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var25 = var23.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var26 = var23.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var27 = var23.createThoroughfare();
    java.util.List var28 = var27.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var29 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var30 = var29.getPostTown();
    var27.setPostalCode(var29);
    var20.setPostalCode(var29);
    java.util.List var33 = var29.getPostalCodeNumber();
    var12.setPostalCode(var29);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var35 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType.PostalRouteName var36 = var35.createPostalRouteTypePostalRouteName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberExtension var37 = var35.createPostBoxPostBoxNumberExtension();
    java.lang.String var38 = var37.getNumberExtensionSeparator();
    var12.setPostBoxNumberExtension(var37);
    
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
    assertTrue("'" + var16 + "' != '" + "G_GEO_UNKOWN_STATUS"+ "'", var16.equals("G_GEO_UNKOWN_STATUS"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
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
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test129");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var2 = var0.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.Locality.LocalityName var3 = var0.createLocalityLocalityName();
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox.PostBoxNumberSuffix var4 = var0.createPostBoxPostBoxNumberSuffix();
    java.lang.String var5 = var4.getNumberSuffixSeparator();
    var4.setNumberSuffixSeparator("geo.google.GeoException: geo.google.GeoException: ");
    java.lang.String var8 = var4.getNumberSuffixSeparator();
    var4.setCode("G_GEO_UNKOWN_STATUS");
    var4.setCode("geo.google.datamodel.GeoAddress@439373c0[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var4.setContent("geo.google.datamodel.GeoAddress@4244bb8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var15 = var4.getNumberSuffixSeparator();
    
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
    assertTrue("'" + var8 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var8.equals("geo.google.GeoException: geo.google.GeoException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "geo.google.GeoException: geo.google.GeoException: "+ "'", var15.equals("geo.google.GeoException: geo.google.GeoException: "));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test130");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitudeDirection var1 = var0.getAddressLatitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var2 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.util.Map var3 = var2.getOtherAttributes();
    var0.setAddressLongitude(var2);
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var5 = var0.getSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var6 = var0.getKeyLineCode();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode var7 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.Barcode();
    java.lang.String var8 = var7.getType();
    var7.setContent("geo.google.GeoException: ");
    java.lang.String var11 = var7.getCode();
    var0.setBarcode(var7);
    java.lang.String var13 = var7.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test131");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType.SubPremiseNumberPrefix var2 = var0.createSubPremiseTypeSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType var3 = var0.createPostalRouteType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var4 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitudeDirection var5 = var0.createAddressDetailsPostalServiceElementsAddressLongitudeDirection();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType.MailStopNumber var6 = var0.createMailStopTypeMailStopNumber();
    var6.setContent("G_GEO_UNKOWN_STATUS");
    var6.setCode("");
    var6.setCode("geo.google.GeoException: ");
    java.lang.String var13 = var6.getNameNumberSeparator();
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "geo.google.GeoException: "+ "'", var14.equals("geo.google.GeoException: "));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test132");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var1 = var0.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var2 = var0.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var3 = var0.createPremiseNumberSuffix();
    var3.setNumberSuffixSeparator("hi!");
    var3.setType("geo.google.datamodel.GeoUsAddress@69d10531[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@19ac0a3d[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@6dd437f5[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var8 = var3.getNumberSuffixSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test133");


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
    geo.google.datamodel.GeoAltitude var55 = new geo.google.datamodel.GeoAltitude(10.0d);
    geo.google.datamodel.GeoAltitude.GeoAltitudeMode var56 = var55.getMode();
    geo.google.datamodel.GeoCoordinate var57 = new geo.google.datamodel.GeoCoordinate(0.0d, 1.0d, var55);
    double var58 = var57.getLongitude();
    geo.google.datamodel.GeoCoordinate var59 = var57.clone();
    geo.google.datamodel.GeoAltitude var60 = var57.getAltitude();
    geo.google.datamodel.GeoCoordinate var75 = new geo.google.datamodel.GeoCoordinate();
    double var76 = var75.getLongitude();
    geo.google.datamodel.GeoCoordinate var77 = new geo.google.datamodel.GeoCoordinate();
    double var78 = var77.getLongitude();
    double var79 = geo.google.datamodel.GeoUtils.haversineDistanceBetweenInKm(var75, var77);
    double var80 = var77.getLatitude();
    var77.setLatitude(0.0d);
    geo.google.datamodel.GeoAddressAccuracy var84 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    geo.google.datamodel.GeoUsAddress var85 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: ", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "geo.google.GeoException: hi!", "Uknown Status", "", "UNKNOWN_LOCATION", "", var77, var84);
    geo.google.datamodel.GeoAddressAccuracy var87 = geo.google.datamodel.GeoAddressAccuracy.getAccuracyByCode(100);
    java.lang.String var88 = var87.getName();
    geo.google.datamodel.GeoUsAddress var89 = new geo.google.datamodel.GeoUsAddress("geo.google.GeoException: hi!", "(default) Indicates to ignore an altitude specification", "geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]", "Uknown Status", "geo.google.GeoException: ", "", "UNKNOWN_LOCATION", var77, var87);
    geo.google.datamodel.GeoCoordinate var90 = var77.clone();
    double var91 = geo.google.datamodel.GeoUtils.distanceBetweenInKm(var57, var77);
    double var92 = geo.google.datamodel.GeoUtils.distanceBetweenInMiles(var47, var57);
    geo.google.datamodel.GeoCoordinate var93 = var57.clone();
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "UNKNOWN_LOCATION"+ "'", var88.equals("UNKNOWN_LOCATION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 157.24181586752943d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 154.48836784013483d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test134");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var1 = var0.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var3 = var0.createDependentLocalityTypeDependentLocalityNumber();
    var3.setContent("");
    java.lang.String var6 = var3.getNameNumberOccurrence();
    java.util.Map var7 = var3.getOtherAttributes();
    java.lang.String var8 = var3.getCode();
    java.lang.String var9 = var3.getCode();
    var3.setContent("geo.google.datamodel.GeoUsAddress@3e300e18[\n  _addressLine1=geo.google.GeoException: hi!\n  _addressLine2=(default) Indicates to ignore an altitude specification\n  _city=geo.google.datamodel.GeoAddress@753425c4[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=Uknown Status\n  _state=geo.google.GeoException: \n  _postalCode=\n  _country=UNKNOWN_LOCATION\n  _coordinate=geo.google.datamodel.GeoCoordinate@44ed698d[_latitude=0.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@3eaccb55[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setContent("geo.google.datamodel.GeoAddress@78483264[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var3.setContent("geo.google.datamodel.GeoAddress@1c9cf4db[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test135");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements();
    java.util.List var1 = var0.getAny();
    java.lang.String var2 = var0.getType();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude var3 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLatitude();
    var0.setAddressLatitude(var3);
    java.util.List var5 = var0.getAddressIdentifier();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode var6 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.KeyLineCode();
    java.lang.String var7 = var6.getType();
    java.lang.String var8 = var6.getContent();
    var6.setCode("Uknown Status");
    var0.setKeyLineCode(var6);
    var6.setType("geo.google.datamodel.GeoUsAddress@49269587[\n  _addressLine1=geo.google.datamodel.GeoAddress@365f2a4c[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _addressLine2=geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _city=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _county=geo.google.datamodel.GeoAddress@3174278e[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _state=Uknown Status\n  _postalCode=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _country=geo.google.datamodel.GeoAddress@9d8c8f[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]\n  _coordinate=geo.google.datamodel.GeoCoordinate@422f796[_latitude=-1.0,_longitude=-1.0,_altitude=geo.google.datamodel.GeoAltitude@13ac9af9[_altitude=0.0,_mode=CLAMP_TO_GROUND]]\n  _accuracy=UNKNOWN_LOCATION\n]");
    java.lang.String var14 = var6.getContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test136");


    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var1 = var0.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var2 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var3 = var2.getAny();
    var0.setSubPremise(var2);
    java.util.List var5 = var0.getSubPremiseNumberSuffix();
    java.util.Map var6 = var0.getOtherAttributes();
    var0.setType("(default) Indicates to ignore an altitude specification");
    java.util.List var9 = var0.getSubPremiseNumberPrefix();
    java.util.List var10 = var0.getSubPremiseNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var11 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var12 = var11.getSubPremiseNumberPrefix();
    oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType var13 = new oasis.names.tc.ciq.xsdschema.xal._2.SubPremiseType();
    java.util.List var14 = var13.getAny();
    var11.setSubPremise(var13);
    java.util.List var16 = var11.getSubPremiseNumberSuffix();
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
    var11.setPostalCode(var43);
    java.util.List var46 = var43.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var47 = var43.getPostTown();
    var0.setPostalCode(var43);
    java.util.Map var49 = var0.getOtherAttributes();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test137");


    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var0 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var1 = var0.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var2 = var0.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var3 = var0.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var4 = var0.createThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseNumberRange var5 = var0.createPremisePremiseNumberRange();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var6 = var0.createDependentLocalityType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var7 = var0.createPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Department.DepartmentName var8 = var0.createDepartmentDepartmentName();
    
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

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test138");


    com.google.earth.kml._2.PlacemarkType var0 = new com.google.earth.kml._2.PlacemarkType();
    com.google.earth.kml._2.PointType var1 = var0.getPoint();
    var0.setId("");
    java.lang.String var4 = var0.getId();
    java.lang.String var5 = var0.getId();
    com.google.earth.kml._2.ObjectFactory var6 = new com.google.earth.kml._2.ObjectFactory();
    com.google.earth.kml._2.ResponseType var7 = var6.createResponseType();
    com.google.earth.kml._2.PointType var8 = new com.google.earth.kml._2.PointType();
    var8.setTessellate((java.lang.Boolean)true);
    var8.setExtrude((java.lang.Boolean)false);
    java.lang.Boolean var13 = var8.isExtrude();
    var8.setCoordinates("Uknown Status");
    javax.xml.bind.JAXBElement var16 = var6.createPoint(var8);
    com.google.earth.kml._2.KmlType var17 = var6.createKmlType();
    com.google.earth.kml._2.PointType var18 = var6.createPointType();
    var0.setPoint(var18);
    com.google.earth.kml._2.PointType var20 = var0.getPoint();
    java.lang.String var21 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test139");


    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType var0 = new oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType();
    java.lang.String var1 = var0.getIndicator();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var2 = var0.getLargeMailUser();
    java.util.List var3 = var0.getAny();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test140");


    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude var0 = new oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.AddressLongitude();
    java.lang.String var1 = var0.getCode();
    java.lang.String var2 = var0.getType();
    var0.setCode("geo.google.datamodel.GeoAddress@ff140d8[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=\n  _accuracy=UNKNOWN_LOCATION\n]");
    var0.setContent("geo.google.datamodel.GeoAddress@73c03348[\n  _coordinate=<null>\n  _addressDetails=<null>\n  _addressLine=UNKNOWN_LOCATION\n  _accuracy=UNKNOWN_LOCATION\n]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest19.test141");


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
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea var17 = new oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea();
    java.lang.String var18 = var17.getIndicator();
    var17.setUsageType("UNKNOWN_LOCATION");
    var3.setAdministrativeArea(var17);
    java.util.List var22 = var3.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var23 = var3.getThoroughfare();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType var24 = var23.getThoroughfareLeadingType();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var25 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var26 = var25.createPremise();
    java.util.List var27 = var26.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var28 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var29 = var28.createPremise();
    var26.setPremise(var29);
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var31 = var29.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var32 = var29.getPostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var33 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails.PostalServiceElements.SortingCode var34 = var33.createAddressDetailsPostalServiceElementsSortingCode();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise var35 = var33.createPremise();
    oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix var36 = var33.createPremiseNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Premise.PremiseLocation var37 = var33.createPremisePremiseLocation();
    var29.setPremiseLocation(var37);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var39 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var40 = var39.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.CountryName var41 = var39.createCountryName();
    oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea.SubAdministrativeArea var42 = var39.createAdministrativeAreaSubAdministrativeArea();
    java.lang.String var43 = var42.getType();
    java.util.List var44 = var42.getAny();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var45 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var46 = var45.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var47 = var45.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var48 = var45.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var49 = var45.createThoroughfare();
    java.util.List var50 = var49.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var51 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var52 = var51.getPostTown();
    var49.setPostalCode(var51);
    var42.setPostalCode(var51);
    var51.setType("(default) Indicates to ignore an altitude specification");
    var29.setPostalCode(var51);
    oasis.names.tc.ciq.xsdschema.xal._2.PostBox var58 = new oasis.names.tc.ciq.xsdschema.xal._2.PostBox();
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var59 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNumberSuffix var60 = var59.createThoroughfareNumberSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType var61 = var59.createLargeMailUserType();
    oasis.names.tc.ciq.xsdschema.xal._2.DependentLocalityType.DependentLocalityNumber var62 = var59.createDependentLocalityTypeDependentLocalityNumber();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfarePostDirectionType var63 = var59.createThoroughfarePostDirectionType();
    oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType var64 = var59.createThoroughfareNameType();
    oasis.names.tc.ciq.xsdschema.xal._2.FirmType var65 = var59.createFirmType();
    var58.setFirm(var65);
    oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory var67 = new oasis.names.tc.ciq.xsdschema.xal._2.ObjectFactory();
    oasis.names.tc.ciq.xsdschema.xal._2.MailStopType var68 = var67.createMailStopType();
    oasis.names.tc.ciq.xsdschema.xal._2.PostOffice var69 = var67.createPostOffice();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown.PostTownSuffix var70 = var67.createPostalCodePostTownPostTownSuffix();
    oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare var71 = var67.createThoroughfare();
    java.util.List var72 = var71.getAddressLine();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode var73 = new oasis.names.tc.ciq.xsdschema.xal._2.PostalCode();
    oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.PostTown var74 = var73.getPostTown();
    var71.setPostalCode(var73);
    var65.setPostalCode(var73);
    var29.setPostalCode(var73);
    var23.setPostalCode(var73);
    java.util.List var79 = var73.getAddressLine();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
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
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

}
