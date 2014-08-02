/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.CST_IPI;

public class CST_IPIEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_IPI.getValue()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_04;
      String string0 = cST_IPI0.getValue();
      assertEquals("04", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_IPI.getDesc()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_53;
      String string0 = cST_IPI0.getDesc();
      assertEquals("Sa\u00EDda n\u00E3o-tributada", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_IPI.isIsento()Z: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_01;
      boolean boolean0 = cST_IPI0.isIsento();
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CST_IPI.getGroup()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      CST_IPI cST_IPI0 = CST_IPI.IPI_04;
      String string0 = cST_IPI0.getGroup();
      assertEquals("NT", string0);
  }
}
