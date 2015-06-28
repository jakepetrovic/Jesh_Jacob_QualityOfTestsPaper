/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressLine;

public class AddressLineEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.getCode()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      String string0 = addressLine0.getCode();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      Map<QName, String> map0 = addressLine0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      String string0 = addressLine0.getType();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      addressLine0.setType("");
      assertNull(addressLine0.getContent());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      addressLine0.setContent((String) null);
      assertNull(addressLine0.getContent());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      addressLine0.setCode("");
      assertNull(addressLine0.getType());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.getContent()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.AddressLine.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      AddressLine addressLine0 = new AddressLine();
      String string0 = addressLine0.getContent();
      assertNull(string0);
  }
}
