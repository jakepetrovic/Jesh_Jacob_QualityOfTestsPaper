/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.TpNF;

public class TpNFEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.TpNF.getValue()C: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TpNF tpNF0 = TpNF.SAIDA;
      char char0 = tpNF0.getValue();
      assertEquals('1', char0);
  }
}
