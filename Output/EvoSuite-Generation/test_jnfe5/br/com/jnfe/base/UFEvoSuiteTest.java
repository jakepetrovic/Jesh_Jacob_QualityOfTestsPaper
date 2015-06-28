/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.UF;

public class UFEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.UF.getNomeUF()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      UF uF0 = UF.RO;
      String string0 = uF0.getNomeUF();
      assertEquals("Rond\u00F4nia", string0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 br.com.jnfe.base.UF.getUF(Ljava/lang/String;)Lbr/com/jnfe/base/UF;: I14 Branch 1 IF_ICMPGE L94 - true
   * 2 br.com.jnfe.base.UF.getUF(Ljava/lang/String;)Lbr/com/jnfe/base/UF;: I14 Branch 1 IF_ICMPGE L94 - false
   * 3 br.com.jnfe.base.UF.getUF(Ljava/lang/String;)Lbr/com/jnfe/base/UF;: I25 Branch 2 IFLE L95 - true
   * 4 br.com.jnfe.base.UF.getCUF()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      UF.getUF("ID{3vjGYG !");
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 br.com.jnfe.base.UF.getUF(Ljava/lang/String;)Lbr/com/jnfe/base/UF;: I25 Branch 2 IFLE L95 - false
   * 2 br.com.jnfe.base.UF.getCUF()Ljava/lang/String;: root-Branch
   * 3 br.com.jnfe.base.UF.getUF(Ljava/lang/String;)Lbr/com/jnfe/base/UF;: I14 Branch 1 IF_ICMPGE L94 - false
   * 4 br.com.jnfe.base.UF.getUF(Ljava/lang/String;)Lbr/com/jnfe/base/UF;: I25 Branch 2 IFLE L95 - true
   */
  @Test
  public void test2()  throws Throwable  {
      UF uF0 = UF.getUF("41");
      assertEquals(UF.PR, uF0);
  }
}
