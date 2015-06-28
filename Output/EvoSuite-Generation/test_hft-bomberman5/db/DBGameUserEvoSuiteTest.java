/*
 * This file was automatically generated by EvoSuite
 */

package db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import db.DBGameUser;

@RunWith(EvoSuiteRunner.class)
public class DBGameUserEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 db.DBGameUser.getPassword()Ljava/lang/String;: root-Branch
   * 2 db.DBGameUser.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      String string0 = dBGameUser0.getPassword();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 db.DBGameUser.getName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      String string0 = dBGameUser0.getName();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 db.DBGameUser.setPassword(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      dBGameUser0.setPassword("");
      assertNull(dBGameUser0.getName());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 db.DBGameUser.setScore(Ljava/lang/Integer;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      Integer integer0 = new Integer((-759));
      dBGameUser0.setScore(integer0);
      assertEquals((-759L), integer0.longValue());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 db.DBGameUser.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      String string0 = dBGameUser0.toString();
      assertNotNull(string0);
      assertEquals("DBGameUser: null \tScore: null", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 db.DBGameUser.setName(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      dBGameUser0.setName("");
      assertEquals("", dBGameUser0.getName());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 db.DBGameUser.getScore()Ljava/lang/Integer;: root-Branch
   * 2 db.DBGameUser.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      DBGameUser dBGameUser0 = new DBGameUser();
      dBGameUser0.getScore();
  }
}
