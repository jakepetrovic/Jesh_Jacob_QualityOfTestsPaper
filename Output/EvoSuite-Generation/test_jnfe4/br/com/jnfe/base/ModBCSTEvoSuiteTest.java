/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.ModBCST;

public class ModBCSTEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.ModBCST.getValue()C: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ModBCST modBCST0 = ModBCST.valueOf("LISTA_NEUTRA");
      char char0 = modBCST0.getValue();
      assertEquals('3', char0);
  }
}
