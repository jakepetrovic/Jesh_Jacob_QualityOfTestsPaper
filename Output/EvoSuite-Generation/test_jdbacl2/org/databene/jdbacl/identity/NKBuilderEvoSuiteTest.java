/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.identity;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.databene.jdbacl.identity.NKBuilder;

public class NKBuilderEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.databene.jdbacl.identity.NKBuilder.toString()Ljava/lang/String;: root-Branch
   * 2 org.databene.jdbacl.identity.NKBuilder.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      NKBuilder nKBuilder0 = new NKBuilder();
      String string0 = nKBuilder0.toString();
      assertEquals(true, nKBuilder0.empty);
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.databene.jdbacl.identity.NKBuilder.addComponent(Ljava/lang/Object;)V: I4 Branch 1 IFNE L42 - false
   * 2 org.databene.jdbacl.identity.NKBuilder.addComponent(Ljava/lang/Object;)V: I17 Branch 2 IFNULL L44 - false
   * 3 org.databene.jdbacl.identity.NKBuilder.<init>()V: root-Branch
   * 4 org.databene.jdbacl.identity.NKBuilder.addComponent(Ljava/lang/Object;)V: I4 Branch 1 IFNE L42 - true
   * 5 org.databene.jdbacl.identity.NKBuilder.addComponent(Ljava/lang/Object;)V: I17 Branch 2 IFNULL L44 - true
   */
  @Test
  public void test1()  throws Throwable  {
      NKBuilder nKBuilder0 = new NKBuilder();
      nKBuilder0.addComponent((Object) null);
      nKBuilder0.addComponent((Object) "h*p3");
      assertEquals("|h*p3", nKBuilder0.toString());
  }
}
