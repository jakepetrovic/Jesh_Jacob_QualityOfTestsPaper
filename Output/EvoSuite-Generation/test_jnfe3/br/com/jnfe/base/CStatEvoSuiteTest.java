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
      CStat cStat0 = CStat._290;
      SitNFe sitNFe0 = cStat0.getSitNFe();
      assertEquals("REJEITADA", sitNFe0.name());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CStat.getMotivo()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CStat cStat0 = CStat._290;
      String string0 = cStat0.getMotivo();
      assertEquals("Certificado Assinatura inv\u00E1lido", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CStat.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      CStat cStat0 = CStat._290;
      String string0 = cStat0.toString();
      assertNotNull(string0);
      assertEquals("290", string0);
  }
}
