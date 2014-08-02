/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.CST_COFINS;

public class CST_COFINSEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_COFINS.isIsento()Z: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_03;
      boolean boolean0 = cST_COFINS0.isIsento();
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_COFINS.getDesc()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_08;
      String string0 = cST_COFINS0.getDesc();
      assertEquals("Sem Incid\u00EAncia da contribui\u00E7\u00E3o", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_COFINS.getGroup()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_03;
      String string0 = cST_COFINS0.getGroup();
      assertEquals("Qtde", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_COFINS.getValue()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_03;
      String string0 = cST_COFINS0.getValue();
      assertEquals("03", string0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 br.com.jnfe.base.CST_COFINS.isRequiredTag(Ljava/lang/String;)Z: I15 Branch 1 IF_ICMPGE L113 - true
   * 2 br.com.jnfe.base.CST_COFINS.isRequiredTag(Ljava/lang/String;)Z: I15 Branch 1 IF_ICMPGE L113 - false
   * 3 br.com.jnfe.base.CST_COFINS.isRequiredTag(Ljava/lang/String;)Z: I25 Branch 2 IFLE L114 - true
   */
  @Test
  public void test4()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_03;
      boolean boolean0 = cST_COFINS0.isRequiredTag("");
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 br.com.jnfe.base.CST_COFINS.isRequiredTag(Ljava/lang/String;)Z: I25 Branch 2 IFLE L114 - false
   * 2 br.com.jnfe.base.CST_COFINS.isRequiredTag(Ljava/lang/String;)Z: I15 Branch 1 IF_ICMPGE L113 - false
   * 3 br.com.jnfe.base.CST_COFINS.isRequiredTag(Ljava/lang/String;)Z: I25 Branch 2 IFLE L114 - true
   */
  @Test
  public void test5()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_03;
      boolean boolean0 = cST_COFINS0.isRequiredTag("vAliqProd");
      assertEquals(true, boolean0);
  }
}
