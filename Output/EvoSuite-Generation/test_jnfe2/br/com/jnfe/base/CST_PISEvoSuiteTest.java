/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.CST_PIS;

public class CST_PISEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_PIS.getGroup()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CST_PIS cST_PIS0 = CST_PIS.PIS_01;
      String string0 = cST_PIS0.getGroup();
      assertEquals("Aliq", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_PIS.isIsento()Z: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CST_PIS cST_PIS0 = CST_PIS.PIS_01;
      boolean boolean0 = cST_PIS0.isIsento();
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_PIS.getDesc()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      CST_PIS cST_PIS0 = CST_PIS.PIS_01;
      String string0 = cST_PIS0.getDesc();
      assertEquals("Al\u00EDquota normal", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_PIS.getValue()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      CST_PIS cST_PIS0 = CST_PIS.PIS_01;
      String string0 = cST_PIS0.getValue();
      assertEquals("01", string0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 br.com.jnfe.base.CST_PIS.isRequiredTag(Ljava/lang/String;)Z: I15 Branch 1 IF_ICMPGE L113 - true
   * 2 br.com.jnfe.base.CST_PIS.isRequiredTag(Ljava/lang/String;)Z: I15 Branch 1 IF_ICMPGE L113 - false
   * 3 br.com.jnfe.base.CST_PIS.isRequiredTag(Ljava/lang/String;)Z: I25 Branch 2 IFLE L114 - true
   */
  @Test
  public void test4()  throws Throwable  {
      CST_PIS cST_PIS0 = CST_PIS.PIS_01;
      boolean boolean0 = cST_PIS0.isRequiredTag("");
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 br.com.jnfe.base.CST_PIS.isRequiredTag(Ljava/lang/String;)Z: I25 Branch 2 IFLE L114 - false
   * 2 br.com.jnfe.base.CST_PIS.isRequiredTag(Ljava/lang/String;)Z: I15 Branch 1 IF_ICMPGE L113 - false
   * 3 br.com.jnfe.base.CST_PIS.isRequiredTag(Ljava/lang/String;)Z: I25 Branch 2 IFLE L114 - true
   */
  @Test
  public void test5()  throws Throwable  {
      CST_PIS cST_PIS0 = CST_PIS.PIS_01;
      boolean boolean0 = cST_PIS0.isRequiredTag("vPIS");
      assertEquals(true, boolean0);
  }
}
