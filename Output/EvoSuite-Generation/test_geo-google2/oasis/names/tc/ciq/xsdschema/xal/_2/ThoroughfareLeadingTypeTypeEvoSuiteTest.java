/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType;

public class ThoroughfareLeadingTypeTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.getContent()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      String string0 = thoroughfareLeadingTypeType0.getContent();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      thoroughfareLeadingTypeType0.setType((String) null);
      assertNull(thoroughfareLeadingTypeType0.getContent());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      thoroughfareLeadingTypeType0.setCode((String) null);
      assertNull(thoroughfareLeadingTypeType0.getType());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      Map<QName, String> map0 = thoroughfareLeadingTypeType0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      String string0 = thoroughfareLeadingTypeType0.getType();
      assertNull(string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      String string0 = thoroughfareLeadingTypeType0.getCode();
      assertNull(string0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.setContent(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareLeadingTypeType.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ThoroughfareLeadingTypeType thoroughfareLeadingTypeType0 = new ThoroughfareLeadingTypeType();
      thoroughfareLeadingTypeType0.setContent((String) null);
      assertNull(thoroughfareLeadingTypeType0.getContent());
  }
}
