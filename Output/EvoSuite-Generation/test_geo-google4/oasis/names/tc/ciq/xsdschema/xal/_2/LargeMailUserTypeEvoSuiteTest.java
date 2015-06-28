/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressLine;
import oasis.names.tc.ciq.xsdschema.xal._2.BuildingNameType;
import oasis.names.tc.ciq.xsdschema.xal._2.Department;
import oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType;
import oasis.names.tc.ciq.xsdschema.xal._2.PostBox;
import oasis.names.tc.ciq.xsdschema.xal._2.PostalCode;
import oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare;

public class LargeMailUserTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.setType(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      largeMailUserType_LargeMailUserName0.setType("fs04TE<I");
      assertEquals("fs04TE<I", largeMailUserType_LargeMailUserName0.getType());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      String string0 = largeMailUserType_LargeMailUserName0.getCode();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      String string0 = largeMailUserType_LargeMailUserName0.getContent();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      String string0 = largeMailUserType_LargeMailUserName0.getType();
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      largeMailUserType_LargeMailUserName0.setContent((String) null);
      assertNull(largeMailUserType_LargeMailUserName0.getContent());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      Map<QName, String> map0 = largeMailUserType_LargeMailUserName0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.setCode(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserName.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      LargeMailUserType.LargeMailUserName largeMailUserType_LargeMailUserName0 = new LargeMailUserType.LargeMailUserName();
      largeMailUserType_LargeMailUserName0.setCode((String) null);
      assertNull(largeMailUserType_LargeMailUserName0.getCode());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getType()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.<init>()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      String string0 = largeMailUserType0.getType();
      assertNull(string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getDepartment()Loasis/names/tc/ciq/xsdschema/xal/_2/Department;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      Department department0 = largeMailUserType0.getDepartment();
      assertNull(department0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getLargeMailUserIdentifier()Loasis/names/tc/ciq/xsdschema/xal/_2/LargeMailUserType$LargeMailUserIdentifier;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = largeMailUserType0.getLargeMailUserIdentifier();
      assertNull(largeMailUserType_LargeMailUserIdentifier0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getPostBox()Loasis/names/tc/ciq/xsdschema/xal/_2/PostBox;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      PostBox postBox0 = largeMailUserType0.getPostBox();
      assertNull(postBox0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.setPostalCode(Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode;)V: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      PostalCode postalCode0 = new PostalCode();
      largeMailUserType0.setPostalCode(postalCode0);
      assertNull(largeMailUserType0.getType());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      Map<QName, String> map0 = largeMailUserType0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.setPostBox(Loasis/names/tc/ciq/xsdschema/xal/_2/PostBox;)V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      largeMailUserType0.setPostBox((PostBox) null);
      assertNull(largeMailUserType0.getType());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getPostalCode()Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      PostalCode postalCode0 = largeMailUserType0.getPostalCode();
      assertNull(postalCode0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      largeMailUserType0.setType("8Ne0ar.m");
      assertEquals("8Ne0ar.m", largeMailUserType0.getType());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.setDepartment(Loasis/names/tc/ciq/xsdschema/xal/_2/Department;)V: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      largeMailUserType0.setDepartment((Department) null);
      assertNull(largeMailUserType0.getType());
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.setLargeMailUserIdentifier(Loasis/names/tc/ciq/xsdschema/xal/_2/LargeMailUserType$LargeMailUserIdentifier;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.<init>()V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      largeMailUserType0.setLargeMailUserIdentifier(largeMailUserType_LargeMailUserIdentifier0);
      assertNull(largeMailUserType_LargeMailUserIdentifier0.getContent());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getThoroughfare()Loasis/names/tc/ciq/xsdschema/xal/_2/Thoroughfare;: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      Thoroughfare thoroughfare0 = largeMailUserType0.getThoroughfare();
      assertNull(thoroughfare0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.setThoroughfare(Loasis/names/tc/ciq/xsdschema/xal/_2/Thoroughfare;)V: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      largeMailUserType0.setThoroughfare((Thoroughfare) null);
      assertNull(largeMailUserType0.getType());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      String string0 = largeMailUserType_LargeMailUserIdentifier0.getContent();
      assertNull(string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      largeMailUserType_LargeMailUserIdentifier0.setType((String) null);
      assertNull(largeMailUserType_LargeMailUserIdentifier0.getType());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      largeMailUserType_LargeMailUserIdentifier0.setContent("8Ne0ar.m");
      assertEquals("8Ne0ar.m", largeMailUserType_LargeMailUserIdentifier0.getContent());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      largeMailUserType_LargeMailUserIdentifier0.setCode("6`].]C6{UzL6>];");
      assertNull(largeMailUserType_LargeMailUserIdentifier0.getType());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test24()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      String string0 = largeMailUserType_LargeMailUserIdentifier0.getCode();
      assertNull(string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test25()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      Map<QName, String> map0 = largeMailUserType_LargeMailUserIdentifier0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.getIndicator()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test26()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      String string0 = largeMailUserType_LargeMailUserIdentifier0.getIndicator();
      assertNull(string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.setIndicator(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test27()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      largeMailUserType_LargeMailUserIdentifier0.setIndicator("");
      assertNull(largeMailUserType_LargeMailUserIdentifier0.getCode());
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.getType()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType$LargeMailUserIdentifier.<init>()V: root-Branch
   */
  @Test
  public void test28()  throws Throwable  {
      LargeMailUserType.LargeMailUserIdentifier largeMailUserType_LargeMailUserIdentifier0 = new LargeMailUserType.LargeMailUserIdentifier();
      String string0 = largeMailUserType_LargeMailUserIdentifier0.getType();
      assertNull(string0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L137 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L137 - false
   */
  @Test
  public void test29()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      List<AddressLine> list0 = largeMailUserType0.getAddressLine();
      List<AddressLine> list1 = largeMailUserType0.getAddressLine();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getLargeMailUserName()Ljava/util/List;: I4 Branch 2 IFNONNULL L166 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getLargeMailUserName()Ljava/util/List;: I4 Branch 2 IFNONNULL L166 - false
   */
  @Test
  public void test30()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      List<LargeMailUserType.LargeMailUserName> list0 = largeMailUserType0.getLargeMailUserName();
      List<LargeMailUserType.LargeMailUserName> list1 = largeMailUserType0.getLargeMailUserName();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 31
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getBuildingName()Ljava/util/List;: I4 Branch 3 IFNONNULL L219 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getBuildingName()Ljava/util/List;: I4 Branch 3 IFNONNULL L219 - false
   */
  @Test
  public void test31()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      List<BuildingNameType> list0 = largeMailUserType0.getBuildingName();
      List<BuildingNameType> list1 = largeMailUserType0.getBuildingName();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 32
  /*
   * 3 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getAny()Ljava/util/List;: I4 Branch 4 IFNONNULL L344 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.getAny()Ljava/util/List;: I4 Branch 4 IFNONNULL L344 - false
   * 3 oasis.names.tc.ciq.xsdschema.xal._2.LargeMailUserType.<init>()V: root-Branch
   */
  @Test
  public void test32()  throws Throwable  {
      LargeMailUserType largeMailUserType0 = new LargeMailUserType();
      List<Object> list0 = largeMailUserType0.getAny();
      List<Object> list1 = largeMailUserType0.getAny();
      assertSame(list1, list0);
      assertNotNull(list1);
  }
}