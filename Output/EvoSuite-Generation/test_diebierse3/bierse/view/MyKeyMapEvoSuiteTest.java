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
   * 3 covered goals:
   * 1 bierse.view.MyKeyMap.getText()Ljava/lang/String;: root-Branch
   * 2 bierse.view.MyKeyMap.<init>(Ljava/lang/String;I)V: root-Branch
   * 3 bierse.view.MyKeyMap.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MyKeyMap myKeyMap0 = new MyKeyMap("hr)]^", (-1));
      String string0 = myKeyMap0.toString();
      assertEquals(-1, myKeyMap0.getCode());
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 bierse.view.MyKeyMap.getCode()I: root-Branch
   * 2 bierse.view.MyKeyMap.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      MyKeyMap myKeyMap0 = new MyKeyMap("hr)]^", (-1));
      int int0 = myKeyMap0.getCode();
      assertEquals((-1), int0);
  }
}
