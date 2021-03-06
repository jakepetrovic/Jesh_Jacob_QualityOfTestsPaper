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
import oasis.names.tc.ciq.xsdschema.xal._2.PostalCode;

public class PostalCodeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.getCode()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      String string0 = postalCode_PostalCodeNumber0.getCode();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      Map<QName, String> map0 = postalCode_PostalCodeNumber0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      String string0 = postalCode_PostalCodeNumber0.getType();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      String string0 = postalCode_PostalCodeNumber0.getContent();
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      postalCode_PostalCodeNumber0.setCode((String) null);
      assertNull(postalCode_PostalCodeNumber0.getContent());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      postalCode_PostalCodeNumber0.setType((String) null);
      assertNull(postalCode_PostalCodeNumber0.getContent());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.setContent(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      postalCode_PostalCodeNumber0.setContent((String) null);
      assertNull(postalCode_PostalCodeNumber0.getContent());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getType()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.<init>()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      String string0 = postalCode0.getType();
      assertNull(string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      Map<QName, String> map0 = postalCode0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      postalCode0.setType((String) null);
      assertNull(postalCode0.getType());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.setPostTown(Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode$PostTown;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      postalCode0.setPostTown((PostalCode.PostTown) null);
      assertNull(postalCode0.getType());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getPostTown()Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode$PostTown;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      PostalCode.PostTown postalCode_PostTown0 = postalCode0.getPostTown();
      assertNull(postalCode_PostTown0);
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.setPostTownSuffix(Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode$PostTown$PostTownSuffix;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.<init>()V: root-Branch
   * 3 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.<init>()V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      postalCode_PostTown0.setPostTownSuffix(postalCode_PostTown_PostTownSuffix0);
      assertNull(postalCode_PostTown0.getType());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      Map<QName, String> map0 = postalCode_PostTown0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getPostTownSuffix()Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode$PostTown$PostTownSuffix;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = postalCode_PostTown0.getPostTownSuffix();
      assertNull(postalCode_PostTown_PostTownSuffix0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      postalCode_PostTown0.setType("_o:+");
      assertEquals("_o:+", postalCode_PostTown0.getType());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      String string0 = postalCode_PostTown0.getType();
      assertNull(string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      String string0 = postalCode_PostTown_PostTownSuffix0.getContent();
      assertNull(string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      String string0 = postalCode_PostTown_PostTownSuffix0.getCode();
      assertNull(string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      postalCode_PostTown_PostTownSuffix0.setContent((String) null);
      assertNull(postalCode_PostTown_PostTownSuffix0.getContent());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      postalCode_PostTown_PostTownSuffix0.setCode("");
      assertEquals("", postalCode_PostTown_PostTownSuffix0.getCode());
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.getOtherAttributes()Ljava/util/Map;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown$PostTownSuffix.<init>()V: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      Map<QName, String> map0 = postalCode_PostTown_PostTownSuffix0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.setType(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.<init>()V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setType((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getType());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setContent((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getNumberExtensionSeparator());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test24()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getType();
      assertNull(string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.getNumberExtensionSeparator()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test25()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getNumberExtensionSeparator();
      assertNull(string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test26()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setCode((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getNumberExtensionSeparator());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test27()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getContent();
      assertNull(string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test28()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getCode();
      assertNull(string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.setNumberExtensionSeparator(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test29()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setNumberExtensionSeparator("_o:+");
      assertEquals("_o:+", postalCode_PostalCodeNumberExtension0.getNumberExtensionSeparator());
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.getOtherAttributes()Ljava/util/Map;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumberExtension.<init>()V: root-Branch
   */
  @Test
  public void test30()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      Map<QName, String> map0 = postalCode_PostalCodeNumberExtension0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 31
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L157 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L157 - false
   */
  @Test
  public void test31()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<AddressLine> list0 = postalCode0.getAddressLine();
      List<AddressLine> list1 = postalCode0.getAddressLine();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  //Test case number: 32
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getPostalCodeNumber()Ljava/util/List;: I4 Branch 2 IFNONNULL L186 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getPostalCodeNumber()Ljava/util/List;: I4 Branch 2 IFNONNULL L186 - false
   */
  @Test
  public void test32()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<PostalCode.PostalCodeNumber> list0 = postalCode0.getPostalCodeNumber();
      List<PostalCode.PostalCodeNumber> list1 = postalCode0.getPostalCodeNumber();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 33
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getPostalCodeNumberExtension()Ljava/util/List;: I4 Branch 3 IFNONNULL L215 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getPostalCodeNumberExtension()Ljava/util/List;: I4 Branch 3 IFNONNULL L215 - false
   */
  @Test
  public void test33()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<PostalCode.PostalCodeNumberExtension> list0 = postalCode0.getPostalCodeNumberExtension();
      List<PostalCode.PostalCodeNumberExtension> list1 = postalCode0.getPostalCodeNumberExtension();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  //Test case number: 34
  /*
   * 3 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getAny()Ljava/util/List;: I4 Branch 4 IFNONNULL L268 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.getAny()Ljava/util/List;: I4 Branch 4 IFNONNULL L268 - false
   * 3 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode.<init>()V: root-Branch
   */
  @Test
  public void test34()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<Object> list0 = postalCode0.getAny();
      List<Object> list1 = postalCode0.getAny();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  //Test case number: 35
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getAddressLine()Ljava/util/List;: I4 Branch 5 IFNONNULL L688 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getAddressLine()Ljava/util/List;: I4 Branch 5 IFNONNULL L688 - false
   */
  @Test
  public void test35()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      List<AddressLine> list0 = postalCode_PostTown0.getAddressLine();
      List<AddressLine> list1 = postalCode_PostTown0.getAddressLine();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 36
  /*
   * 3 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getPostTownName()Ljava/util/List;: I4 Branch 6 IFNONNULL L717 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.getPostTownName()Ljava/util/List;: I4 Branch 6 IFNONNULL L717 - false
   * 3 oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostTown.<init>()V: root-Branch
   */
  @Test
  public void test36()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      List<PostalCode.PostTown.PostTownName> list0 = postalCode_PostTown0.getPostTownName();
      List<PostalCode.PostTown.PostTownName> list1 = postalCode_PostTown0.getPostTownName();
      assertSame(list1, list0);
      assertNotNull(list1);
  }
}
