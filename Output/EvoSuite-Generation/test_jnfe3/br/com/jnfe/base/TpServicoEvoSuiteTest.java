/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.TpServico;

public class TpServicoEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.TpServico.getOrigemDoServico()C: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TpServico tpServico0 = TpServico.CONSULTA_SIT;
      char char0 = tpServico0.getOrigemDoServico();
      assertEquals('E', char0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.TpServico.getNome()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      TpServico tpServico0 = TpServico.CONSULTA_SIT;
      String string0 = tpServico0.getNome();
      assertEquals("Consulta situa\u00E7\u00E3o", string0);
  }
}
