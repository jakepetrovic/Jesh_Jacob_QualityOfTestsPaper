/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.SitNFe;

public class SitNFeEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.SitNFe.isUsar()Z: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SitNFe sitNFe0 = SitNFe.PENDENTE;
      boolean boolean0 = sitNFe0.isUsar();
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.SitNFe.isReenviar()Z: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SitNFe sitNFe0 = SitNFe.PENDENTE;
      boolean boolean0 = sitNFe0.isReenviar();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.SitNFe.getValue()C: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SitNFe sitNFe0 = SitNFe.PENDENTE;
      char char0 = sitNFe0.getValue();
      assertEquals('P', char0);
  }
}