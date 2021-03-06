/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.Orig;

public class OrigEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.Orig.isNacional()Z: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Orig orig0 = Orig.ESTRANGEIRA_IMPDIR;
      boolean boolean0 = orig0.isNacional();
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.Orig.getDesc()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Orig orig0 = Orig.ESTRANGEIRA_IMPDIR;
      String string0 = orig0.getDesc();
      assertEquals("Estrangeira, importa\u00E7\u00E3o direta", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.Orig.getValue()C: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Orig orig0 = Orig.ESTRANGEIRA_IMPDIR;
      char char0 = orig0.getValue();
      assertEquals('1', char0);
  }
}
