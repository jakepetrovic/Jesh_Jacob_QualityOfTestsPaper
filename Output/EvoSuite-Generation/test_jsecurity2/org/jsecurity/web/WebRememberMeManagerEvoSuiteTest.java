/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.evosuite.testcase.CodeUnderTestException;
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.attr.RequestParamAttribute;

public class WebRememberMeManagerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jsecurity.web.WebRememberMeManager.getCookieMaxAge()I: root-Branch
   * 2 org.jsecurity.web.WebRememberMeManager.<init>()V: root-Branch
   * 3 org.jsecurity.web.WebRememberMeManager.assertCookieAttribute()V: I5 Branch 1 IFNE L88 - true
   */
  @Test
  public void test0()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      int int0 = webRememberMeManager0.getCookieMaxAge();
      assertEquals(94608000, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.getIdentityAttribute()Lorg/jsecurity/web/attr/WebAttribute;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.getIdentityAttribute();
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.setCookieSecure(Z)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCookieSecure(true);
      assertNull(webRememberMeManager0.getCookiePath());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.forgetIdentity()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      // Undeclared exception!
      try {
        webRememberMeManager0.forgetIdentity();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.jsecurity.web.WebUtils
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.getCookiePath()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      String string0 = webRememberMeManager0.getCookiePath();
      assertNull(string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.rememberSerializedIdentity([B)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      byte[] byteArray0 = new byte[42];
      // Undeclared exception!
      try {
        webRememberMeManager0.rememberSerializedIdentity(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.jsecurity.web.WebUtils
         */
      }
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 org.jsecurity.web.WebRememberMeManager.assertCookieAttribute()V: I5 Branch 1 IFNE L88 - false
   * 2 org.jsecurity.web.WebRememberMeManager.isCookieSecure()Z: root-Branch
   * 3 org.jsecurity.web.WebRememberMeManager.setIdentityAttribute(Lorg/jsecurity/web/attr/WebAttribute;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      RequestParamAttribute<String> requestParamAttribute0 = new RequestParamAttribute<String>("<");
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.setCookiePath(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCookiePath("}S1n~h$O 7");
      assertEquals("}S1n~h$O 7", webRememberMeManager0.getCookiePath());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.getCookieName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      String string0 = webRememberMeManager0.getCookieName();
      assertEquals("rememberMe", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.jsecurity.web.WebRememberMeManager.setCookieName(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCookieName("d?:D");
      assertEquals(94608000, webRememberMeManager0.getCookieMaxAge());
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 org.jsecurity.web.WebRememberMeManager.setCookieMaxAge(I)V: root-Branch
   * 2 org.jsecurity.web.WebRememberMeManager.<init>()V: root-Branch
   * 3 org.jsecurity.web.WebRememberMeManager.assertCookieAttribute()V: I5 Branch 1 IFNE L88 - true
   */
  @Test
  public void test10()  throws Throwable  {
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      webRememberMeManager0.setCookieMaxAge(94608000);
      assertEquals(94608000, webRememberMeManager0.getCookieMaxAge());
  }
}
