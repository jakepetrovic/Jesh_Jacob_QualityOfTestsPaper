/*
 * This file was automatically generated by EvoSuite
 */

package bierse.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.view.MyKeyMap;

public class MyKeyMapEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 bierse.view.MyKeyMap.getCode()I: root-Branch
   * 2 bierse.view.MyKeyMap.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MyKeyMap myKeyMap0 = new MyKeyMap("", 1);
      int int0 = myKeyMap0.getCode();
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 bierse.view.MyKeyMap.toString()Ljava/lang/String;: root-Branch
   * 2 bierse.view.MyKeyMap.getText()Ljava/lang/String;: root-Branch
   * 3 bierse.view.MyKeyMap.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      MyKeyMap myKeyMap0 = new MyKeyMap("", 1);
      String string0 = myKeyMap0.toString();
      assertNotNull(string0);
      assertEquals(1, myKeyMap0.getCode());
  }
}
