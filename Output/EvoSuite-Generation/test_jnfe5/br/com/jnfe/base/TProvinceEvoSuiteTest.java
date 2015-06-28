/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.TProvince;

public class TProvinceEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 br.com.jnfe.base.TProvince.toString()Ljava/lang/String;: root-Branch
   * 2 br.com.jnfe.base.TProvince.getProvinceCode()Ljava/lang/String;: root-Branch
   * 3 br.com.jnfe.base.TProvince.<init>()V: root-Branch
   * 4 br.com.jnfe.base.TProvince.getProvinceName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TProvince tProvince0 = new TProvince();
      String string0 = tProvince0.toString();
      assertNotNull(string0);
      assertEquals("provinceCode=null, provinceName=null", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.TProvince.setProvinceName(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      TProvince tProvince0 = new TProvince();
      tProvince0.setProvinceName("");
      assertNull(tProvince0.getProvinceCode());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 br.com.jnfe.base.TProvince.setProvinceCode(Ljava/lang/String;)V: root-Branch
   * 2 br.com.jnfe.base.TProvince.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TProvince tProvince0 = new TProvince();
      tProvince0.setProvinceCode("aE");
      assertEquals("aE", tProvince0.getProvinceCode());
  }
}
