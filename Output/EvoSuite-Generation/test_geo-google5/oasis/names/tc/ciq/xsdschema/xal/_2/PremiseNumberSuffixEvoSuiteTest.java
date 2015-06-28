/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix;

public class PremiseNumberSuffixEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.setNumberSuffixSeparator(Ljava/lang/String;)V: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      premiseNumberSuffix0.setNumberSuffixSeparator("");
      assertEquals("", premiseNumberSuffix0.getNumberSuffixSeparator());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.getNumberSuffixSeparator()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      String string0 = premiseNumberSuffix0.getNumberSuffixSeparator();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.setContent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      premiseNumberSuffix0.setContent("");
      assertNull(premiseNumberSuffix0.getNumberSuffixSeparator());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.getContent()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      String string0 = premiseNumberSuffix0.getContent();
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.getOtherAttributes()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      Map<QName, String> map0 = premiseNumberSuffix0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.setCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      premiseNumberSuffix0.setCode("");
      assertNull(premiseNumberSuffix0.getNumberSuffixSeparator());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.getCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      String string0 = premiseNumberSuffix0.getCode();
      assertNull(string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      premiseNumberSuffix0.setType("");
      assertNull(premiseNumberSuffix0.getNumberSuffixSeparator());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.getType()Ljava/lang/String;: root-Branch
   * 2 oasis.names.tc.ciq.xsdschema.xal._2.PremiseNumberSuffix.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      PremiseNumberSuffix premiseNumberSuffix0 = new PremiseNumberSuffix();
      String string0 = premiseNumberSuffix0.getType();
      assertNull(string0);
  }
}
