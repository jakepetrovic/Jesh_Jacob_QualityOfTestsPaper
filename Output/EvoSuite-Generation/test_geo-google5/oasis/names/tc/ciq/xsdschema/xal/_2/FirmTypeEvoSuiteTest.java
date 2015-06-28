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
import oasis.names.tc.ciq.xsdschema.xal._2.Department;
import oasis.names.tc.ciq.xsdschema.xal._2.FirmType;
import oasis.names.tc.ciq.xsdschema.xal._2.MailStopType;
import oasis.names.tc.ciq.xsdschema.xal._2.PostalCode;

public class FirmTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getOtherAttributes()Ljava/util/Map;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      Map<QName, String> map0 = firmType0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.setMailStop(Loasis/names/tc/ciq/xsdschema/xal/_2/MailStopType;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      firmType0.setMailStop((MailStopType) null);
      assertNull(firmType0.getType());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      String string0 = firmType0.getType();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.setPostalCode(Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      PostalCode postalCode0 = new PostalCode();
      firmType0.setPostalCode(postalCode0);
      assertNull(firmType0.getType());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getPostalCode()Loasis/names/tc/ciq/xsdschema/xal/_2/PostalCode;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      PostalCode postalCode0 = firmType0.getPostalCode();
      assertNull(postalCode0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      firmType0.setType((String) null);
      assertNull(firmType0.getType());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getMailStop()Loasis/names/tc/ciq/xsdschema/xal/_2/MailStopType;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      MailStopType mailStopType0 = firmType0.getMailStop();
      assertNull(mailStopType0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.getOtherAttributes()Ljava/util/Map;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.<init>()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      Map<QName, String> map0 = firmType_FirmName0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      firmType_FirmName0.setContent((String) null);
      assertNull(firmType_FirmName0.getContent());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      firmType_FirmName0.setCode("\"dnktX^");
      assertEquals("\"dnktX^", firmType_FirmName0.getCode());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      firmType_FirmName0.setType((String) null);
      assertNull(firmType_FirmName0.getType());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      String string0 = firmType_FirmName0.getType();
      assertNull(string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      String string0 = firmType_FirmName0.getCode();
      assertNull(string0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.getContent()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType$FirmName.<init>()V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      FirmType.FirmName firmType_FirmName0 = new FirmType.FirmName();
      String string0 = firmType_FirmName0.getContent();
      assertNull(string0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L115 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getAddressLine()Ljava/util/List;: I4 Branch 1 IFNONNULL L115 - false
   */
  @Test
  public void test14()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      List<AddressLine> list0 = firmType0.getAddressLine();
      List<AddressLine> list1 = firmType0.getAddressLine();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getFirmName()Ljava/util/List;: I4 Branch 2 IFNONNULL L144 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getFirmName()Ljava/util/List;: I4 Branch 2 IFNONNULL L144 - false
   */
  @Test
  public void test15()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      List<FirmType.FirmName> list0 = firmType0.getFirmName();
      List<FirmType.FirmName> list1 = firmType0.getFirmName();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getDepartment()Ljava/util/List;: I4 Branch 3 IFNONNULL L173 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getDepartment()Ljava/util/List;: I4 Branch 3 IFNONNULL L173 - false
   */
  @Test
  public void test16()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      List<Department> list0 = firmType0.getDepartment();
      List<Department> list1 = firmType0.getDepartment();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getAny()Ljava/util/List;: I4 Branch 4 IFNONNULL L250 - true
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.getAny()Ljava/util/List;: I4 Branch 4 IFNONNULL L250 - false
   * 3 oasis.names.tc.ciq.xsdschema.xal._2.FirmType.<init>()V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      FirmType firmType0 = new FirmType();
      List<Object> list0 = firmType0.getAny();
      List<Object> list1 = firmType0.getAny();
      assertSame(list1, list0);
      assertNotNull(list1);
  }
}