/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.CStat;
import br.com.jnfe.base.SitNFe;

public class CStatEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CStat.getSitNFe()Lbr/com/jnfe/base/SitNFe;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CStat cStat0 = CStat._257;
      SitNFe sitNFe0 = cStat0.getSitNFe();
      assertEquals(4, sitNFe0.ordinal());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CStat.getMotivo()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CStat cStat0 = CStat._257;
      String string0 = cStat0.getMotivo();
      assertEquals("Solicitante n\u00E3o habilitado para emiss\u00E3o da NF-e", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CStat.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      CStat cStat0 = CStat._257;
      String string0 = cStat0.toString();
      assertEquals("257", string0);
      assertNotNull(string0);
  }
}
