/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.ConsReciNFe;

public class ConsReciNFeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 br.com.jnfe.base.ConsReciNFe.getVersao()Ljava/lang/String;: root-Branch
   * 2 br.com.jnfe.base.ConsReciNFe.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ConsReciNFe consReciNFe0 = new ConsReciNFe();
      String string0 = consReciNFe0.getVersao();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.ConsReciNFe.getNRec()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ConsReciNFe consReciNFe0 = new ConsReciNFe();
      String string0 = consReciNFe0.getNRec();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.ConsReciNFe.getTpAmb()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ConsReciNFe consReciNFe0 = new ConsReciNFe();
      String string0 = consReciNFe0.getTpAmb();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.ConsReciNFe.setNRec(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ConsReciNFe consReciNFe0 = new ConsReciNFe();
      consReciNFe0.setNRec("");
      assertNull(consReciNFe0.getTpAmb());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.ConsReciNFe.setVersao(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ConsReciNFe consReciNFe0 = new ConsReciNFe();
      consReciNFe0.setVersao("?=&8]fO4");
      assertNull(consReciNFe0.getNRec());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 br.com.jnfe.base.ConsReciNFe.setTpAmb(Ljava/lang/String;)V: root-Branch
   * 2 br.com.jnfe.base.ConsReciNFe.<init>()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ConsReciNFe consReciNFe0 = new ConsReciNFe();
      consReciNFe0.setTpAmb("");
      assertNull(consReciNFe0.getVersao());
  }
}
