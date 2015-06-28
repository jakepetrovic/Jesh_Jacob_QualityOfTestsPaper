/*
 * This file was automatically generated by EvoSuite
 */

package ch.bluepenguin.email.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import ch.bluepenguin.email.client.AbstractUniqueID;
import ch.bluepenguin.email.client.Person;

public class PersonEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 ch.bluepenguin.email.client.Person.getNickname()Ljava/lang/String;: root-Branch
   * 2 ch.bluepenguin.email.client.Person.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Person person0 = new Person();
      String string0 = person0.getNickname();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.getReserve()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Person person0 = new Person();
      String string0 = person0.getReserve();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.setLastname(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Person person0 = new Person();
      person0.setLastname((String) null);
      assertNull(person0.getFirstname());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.setNickname(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Person person0 = new Person();
      person0.setNickname((String) null);
      assertNull(person0.getLastname());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.setReserve(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Person person0 = new Person();
      person0.setReserve((String) null);
      assertNull(person0.getNickname());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.setFirstname(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      Person person0 = new Person();
      person0.setFirstname((String) null);
      assertNull(person0.getFirstname());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.getLastname()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      Person person0 = new Person();
      String string0 = person0.getLastname();
      assertNull(string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.Person.getFirstname()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      Person person0 = new Person();
      String string0 = person0.getFirstname();
      assertNull(string0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 ch.bluepenguin.email.client.Person.getUniqueID()Lch/bluepenguin/email/client/AbstractUniqueID;: root-Branch
   * 2 ch.bluepenguin.email.client.Person.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      Person person0 = new Person();
      AbstractUniqueID abstractUniqueID0 = person0.getUniqueID();
      assertNotNull(abstractUniqueID0);
  }
}
