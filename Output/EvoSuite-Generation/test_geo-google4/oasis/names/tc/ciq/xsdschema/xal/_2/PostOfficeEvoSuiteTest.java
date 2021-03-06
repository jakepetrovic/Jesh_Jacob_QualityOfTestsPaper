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
import oasis.names.tc.ciq.xsdschema.xal._2.PostBox;
import oasis.names.tc.ciq.xsdschema.xal._2.PostOffice;
import oasis.names.tc.ciq.xsdschema.xal._2.PostalCode;
import oasis.names.tc.ciq.xsdschema.xal._2.PostalRouteType;

public class PostOfficeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.setPostalRoute(Loasis/names/tc/ciq/xsdschema/xal/_2/PostalRouteType;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      postOffice0.setPostalRoute((PostalRouteType) null);
      assertNull(postOffice0.getIndicator());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getPostBox()Loasis/names/tc/ciq/xsdschema/xal/_2/PostBox;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      PostBox postBox0 = postOffice0.getPostBox();
      assertNull(postBox0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getPostalRoute()Loasis/names/tc/ciq/xsdschema/xal/_2/PostalRouteType;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      PostalRouteType postalRouteType0 = postOffice0.getPostalRoute();
      assertNull(postalRouteType0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.setPostBox(Loasis/names/tc/ciq/xsdschema/xal/_2/PostBox;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      postOffice0.setPostBox((PostBox) null);
      assertNull(postOffice0.getType());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      Map<QName, String> map0 = postOffice0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.setPostalCode(Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      postOffice0.setPostalCode((PostalCode) null);
      assertNull(postOffice0.getIndicator());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getIndicator()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      String string0 = postOffice0.getIndicator();
      assertNull(string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.setIndicator(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      postOffice0.setIndicator((String) null);
      assertNull(postOffice0.getIndicator());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.setPostOfficeNumber(Loasis/names/tc/ciq/xsdschema/xal/_2/PostOffice$PostOfficeNumber;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      postOffice0.setPostOfficeNumber(postOffice_PostOfficeNumber0);
      assertNull(postOffice_PostOfficeNumber0.getCode());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getPostOfficeNumber()Loasis/names/tc/ciq/xsdschema/xal/_2/PostOffice$PostOfficeNumber;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = postOffice0.getPostOfficeNumber();
      assertNull(postOffice_PostOfficeNumber0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      postOffice0.setType((String) null);
      assertNull(postOffice0.getIndicator());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getPostalCode()Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      PostalCode postalCode0 = postOffice0.getPostalCode();
      assertNull(postalCode0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      String string0 = postOffice0.getType();
      assertNull(string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.setIndicator(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      postOffice_PostOfficeNumber0.setIndicator("");
      assertNull(postOffice_PostOfficeNumber0.getIndicatorOccurrence());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      Map<QName, String> map0 = postOffice_PostOfficeNumber0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.setIndicatorOccurrence(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      postOffice_PostOfficeNumber0.setIndicatorOccurrence((String) null);
      assertNull(postOffice_PostOfficeNumber0.getIndicator());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.getIndicator()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      String string0 = postOffice_PostOfficeNumber0.getIndicator();
      assertNull(string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      postOffice_PostOfficeNumber0.setContent((String) null);
      assertNull(postOffice_PostOfficeNumber0.getIndicatorOccurrence());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.getIndicatorOccurrence()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      String string0 = postOffice_PostOfficeNumber0.getIndicatorOccurrence();
      assertNull(string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      String string0 = postOffice_PostOfficeNumber0.getContent();
      assertNull(string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      String string0 = postOffice_PostOfficeNumber0.getCode();
      assertNull(string0);
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.setCode(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeNumber.<init>()V: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      PostOffice.PostOfficeNumber postOffice_PostOfficeNumber0 = new PostOffice.PostOfficeNumber();
      postOffice_PostOfficeNumber0.setCode((String) null);
      assertNull(postOffice_PostOfficeNumber0.getContent());
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.getOtherAttributes()Ljava/util/Map;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.<init>()V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      Map<QName, String> map0 = postOffice_PostOfficeName0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      postOffice_PostOfficeName0.setType("7d1S]nhm");
      assertEquals("7d1S]nhm", postOffice_PostOfficeName0.getType());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test24()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      postOffice_PostOfficeName0.setCode((String) null);
      assertNull(postOffice_PostOfficeName0.getType());
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test25()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      String string0 = postOffice_PostOfficeName0.getType();
      assertNull(string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test26()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      postOffice_PostOfficeName0.setContent((String) null);
      assertNull(postOffice_PostOfficeName0.getType());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test27()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      String string0 = postOffice_PostOfficeName0.getCode();
      assertNull(string0);
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.getContent()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice$PostOfficeName.<init>()V: root-Branch
   */
  @Test
  public void test28()  throws Throwable  {
      PostOffice.PostOfficeName postOffice_PostOfficeName0 = new PostOffice.PostOfficeName();
      String string0 = postOffice_PostOfficeName0.getContent();
      assertNull(string0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L147 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L147 - false
   */
  @Test
  public void test29()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      List<AddressLine> list0 = postOffice0.getAddressLine();
      List<AddressLine> list1 = postOffice0.getAddressLine();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getPostOfficeName()Ljava/util/List;: I4 Branch 2 IFNONNULL L176 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getPostOfficeName()Ljava/util/List;: I4 Branch 2 IFNONNULL L176 - false
   */
  @Test
  public void test30()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      List<PostOffice.PostOfficeName> list0 = postOffice0.getPostOfficeName();
      List<PostOffice.PostOfficeName> list1 = postOffice0.getPostOfficeName();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 31
  /*
   * 3 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getAny()Ljava/util/List;: I4 Branch 3 IFNONNULL L301 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.getAny()Ljava/util/List;: I4 Branch 3 IFNONNULL L301 - false
   * 3 oasis.names.tc.ciq.xsdschema.xal._2.PostOffice.<init>()V: root-Branch
   */
  @Test
  public void test31()  throws Throwable  {
      PostOffice postOffice0 = new PostOffice();
      List<Object> list0 = postOffice0.getAny();
      List<Object> list1 = postOffice0.getAny();
      assertNotNull(list1);
      assertSame(list1, list0);
  }
}
