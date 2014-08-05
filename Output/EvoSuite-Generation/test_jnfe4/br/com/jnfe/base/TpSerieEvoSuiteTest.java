/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.TpSerie;

public class TpSerieEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 br.com.jnfe.base.TpSerie.getSerieIni()I: root-Branch
   * 2 br.com.jnfe.base.TpSerie.getSerieFin()I: root-Branch
   * 3 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I14 Branch 1 IF_ICMPGE L67 - false
   * 4 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I24 Branch 2 IF_ICMPLT L68 - false
   * 5 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I28 Branch 3 IF_ICMPGE L68 - false
   */
  @Test
  public void test0()  throws Throwable  {
      TpSerie tpSerie0 = TpSerie.getTpSerie(0);
      assertEquals(1, tpSerie0.getSerieFin());
      assertEquals(0, tpSerie0.getSerieIni());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I14 Branch 1 IF_ICMPGE L67 - true
   * 2 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I24 Branch 2 IF_ICMPLT L68 - true
   */
  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        TpSerie.getTpSerie((-7));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * N\u00E3o h\u00E1 tipo de s\u00E9rie para esta s\u00E9rie: -7.
         */
      }
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * 1 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I28 Branch 3 IF_ICMPGE L68 - true
   * 2 br.com.jnfe.base.TpSerie.getSerieIni()I: root-Branch
   * 3 br.com.jnfe.base.TpSerie.getSerieFin()I: root-Branch
   * 4 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I14 Branch 1 IF_ICMPGE L67 - true
   * 5 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I14 Branch 1 IF_ICMPGE L67 - false
   * 6 br.com.jnfe.base.TpSerie.getTpSerie(I)Lbr/com/jnfe/base/TpSerie;: I24 Branch 2 IF_ICMPLT L68 - false
   */
  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        TpSerie.getTpSerie(1789);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * N\u00E3o h\u00E1 tipo de s\u00E9rie para esta s\u00E9rie: 1789.
         */
      }
  }
}