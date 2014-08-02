/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.properties.Off;

public class OffEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.properties.Off.setEnd(Ljava/lang/String;)V: root-Branch
   * 2 net.sf.lavalamp.properties.Off.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Off off0 = new Off();
      assertEquals("[start=00:00, end=00:00]", off0.toString());
      
      off0.setEnd("");
      assertEquals("00:00", off0.getStart());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.properties.Off.setStart(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Off off0 = new Off();
      off0.setStart("00:00");
      assertEquals("[start=00:00, end=00:00]", off0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.properties.Off.getEnd()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Off off0 = new Off();
      String string0 = off0.getEnd();
      assertNotNull(string0);
      assertEquals("[start=00:00, end=00:00]", off0.toString());
      assertEquals("00:00", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.properties.Off.getStart()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Off off0 = new Off();
      String string0 = off0.getStart();
      assertNotNull(string0);
      assertEquals("[start=00:00, end=00:00]", off0.toString());
      assertEquals("00:00", string0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.properties.Off.toString()Ljava/lang/String;: root-Branch
   * 2 net.sf.lavalamp.properties.Off.<init>()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Off off0 = new Off();
      String string0 = off0.toString();
      assertEquals("[start=00:00, end=00:00]", string0);
      assertNotNull(string0);
  }
}
