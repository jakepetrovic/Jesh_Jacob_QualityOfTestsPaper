/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix;

public class PremiseNumberPrefixEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.setType(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      premiseNumberPrefix0.setType("LnHt<m");
      assertEquals("LnHt<m", premiseNumberPrefix0.getType());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      String string0 = premiseNumberPrefix0.getType();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.getNumberPrefixSeparator()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      String string0 = premiseNumberPrefix0.getNumberPrefixSeparator();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.setNumberPrefixSeparator(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      premiseNumberPrefix0.setNumberPrefixSeparator((String) null);
      assertNull(premiseNumberPrefix0.getNumberPrefixSeparator());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      Map<QName, String> map0 = premiseNumberPrefix0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.getValue()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      String string0 = premiseNumberPrefix0.getValue();
      assertNull(string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      premiseNumberPrefix0.setCode("");
      assertNull(premiseNumberPrefix0.getType());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      String string0 = premiseNumberPrefix0.getCode();
      assertNull(string0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.setValue(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberPrefix.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      PremiseNumberPrefix premiseNumberPrefix0 = new PremiseNumberPrefix();
      premiseNumberPrefix0.setValue((String) null);
      assertNull(premiseNumberPrefix0.getCode());
  }
}