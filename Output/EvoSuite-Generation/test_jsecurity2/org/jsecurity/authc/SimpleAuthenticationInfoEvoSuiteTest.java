/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class SimpleAuthenticationInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 15 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I83 Branch 8 IFNE L140 - true
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I111 Branch 9 IFEQ L148 - false
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.setCredentials(Ljava/lang/Object;)V: root-Branch
   * 4 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I70 Branch 7 IFNONNULL L135 - true
   * 5 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I83 Branch 8 IFNE L140 - false
   * 6 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I111 Branch 9 IFEQ L148 - true
   * 7 org.jsecurity.authc.SimpleAuthenticationInfo.getCredentials()Ljava/lang/Object;: root-Branch
   * 8 org.jsecurity.authc.SimpleAuthenticationInfo.getPrincipals()Lorg/jsecurity/subject/PrincipalCollection;: root-Branch
   * 9 org.jsecurity.authc.SimpleAuthenticationInfo.<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V: root-Branch
   * 10 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I3 Branch 1 IFNULL L114 - false
   * 11 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I6 Branch 2 IFNULL L114 - false
   * 12 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I10 Branch 3 IFEQ L114 - true
   * 13 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I18 Branch 4 IFNONNULL L118 - true
   * 14 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I31 Branch 5 IFEQ L121 - false
   * 15 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I63 Branch 6 IFNONNULL L131 - true
   */
  @Test
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo(object0, object0, "a!]_4k/?jby5");
      simpleAuthenticationInfo0.merge((AuthenticationInfo) simpleAuthenticationInfo0);
      simpleAuthenticationInfo0.merge((AuthenticationInfo) simpleAuthenticationInfo0);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I34 Branch 14 IFNULL L168 - false
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.<init>(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/Object;)V: root-Branch
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.<init>()V: root-Branch
   * 4 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I4 Branch 10 IF_ACMPNE L163 - true
   * 5 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I11 Branch 11 IFNE L164 - true
   * 6 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I23 Branch 12 IFNULL L168 - true
   */
  @Test
  public void test1()  throws Throwable  {
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimpleAuthenticationInfo simpleAuthenticationInfo1 = new SimpleAuthenticationInfo((PrincipalCollection) simplePrincipalCollection0, (Object) simpleAuthenticationInfo0);
      boolean boolean0 = simpleAuthenticationInfo0.equals((Object) simpleAuthenticationInfo1);
      assertEquals(false, boolean0);
      assertFalse(simpleAuthenticationInfo1.equals(simpleAuthenticationInfo0));
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.setPrincipals(Lorg/jsecurity/subject/PrincipalCollection;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((PrincipalCollection) simplePrincipalCollection0, (Object) "principals argument cannot be an empty collection.");
      simpleAuthenticationInfo0.setPrincipals((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo(object0, object0, "a!]_4k/?jby5");
      String string0 = simpleAuthenticationInfo0.toString();
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I3 Branch 1 IFNULL L114 - true
   */
  @Test
  public void test4()  throws Throwable  {
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      simpleAuthenticationInfo0.merge((AuthenticationInfo) null);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I6 Branch 2 IFNULL L114 - true
   */
  @Test
  public void test5()  throws Throwable  {
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      simpleAuthenticationInfo0.merge((AuthenticationInfo) simpleAuthenticationInfo0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I10 Branch 3 IFEQ L114 - false
   */
  @Test
  public void test6()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((PrincipalCollection) simplePrincipalCollection0, (Object) "principals argument cannot be an empty collection.");
      simpleAuthenticationInfo0.merge((AuthenticationInfo) simpleAuthenticationInfo0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I18 Branch 4 IFNONNULL L118 - false
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I70 Branch 7 IFNONNULL L135 - false
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I63 Branch 6 IFNONNULL L131 - true
   */
  @Test
  public void test7()  throws Throwable  {
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      SimpleAuthenticationInfo simpleAuthenticationInfo1 = new SimpleAuthenticationInfo((Object) "[]", (Object) "[]", "[]");
      simpleAuthenticationInfo0.merge((AuthenticationInfo) simpleAuthenticationInfo1);
      assertTrue(simpleAuthenticationInfo1.equals(simpleAuthenticationInfo0));
      assertTrue(simpleAuthenticationInfo0.equals(simpleAuthenticationInfo1));
  }

  //Test case number: 8
  /*
   * 9 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I63 Branch 6 IFNONNULL L131 - false
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.hashCode()I: I4 Branch 15 IFNULL L178 - false
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.getCredentials()Ljava/lang/Object;: root-Branch
   * 4 org.jsecurity.authc.SimpleAuthenticationInfo.getPrincipals()Lorg/jsecurity/subject/PrincipalCollection;: root-Branch
   * 5 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I3 Branch 1 IFNULL L114 - false
   * 6 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I6 Branch 2 IFNULL L114 - false
   * 7 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I10 Branch 3 IFEQ L114 - true
   * 8 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I18 Branch 4 IFNONNULL L118 - true
   * 9 org.jsecurity.authc.SimpleAuthenticationInfo.merge(Lorg/jsecurity/authc/AuthenticationInfo;)V: I31 Branch 5 IFEQ L121 - false
   */
  @Test
  public void test8()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      Set<Object> set0 = simplePrincipalCollection0.asSet();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((PrincipalCollection) simplePrincipalCollection0, (Object) set0);
      SimpleAccount simpleAccount0 = new SimpleAccount((Object) simpleAuthenticationInfo0, (Object) null, "empty");
      simpleAuthenticationInfo0.merge((AuthenticationInfo) simpleAccount0);
      assertEquals(false, simpleAccount0.isCredentialsExpired());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I4 Branch 10 IF_ACMPNE L163 - true
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I11 Branch 11 IFNE L164 - false
   */
  @Test
  public void test9()  throws Throwable  {
      Object object0 = new Object();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo(object0, object0, "a!]_4k/?jby5");
      boolean boolean0 = simpleAuthenticationInfo0.equals(object0);
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I4 Branch 10 IF_ACMPNE L163 - false
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I11 Branch 11 IFNE L164 - true
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I23 Branch 12 IFNULL L168 - false
   * 4 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I29 Branch 13 IFNE L168 - true
   * 5 org.jsecurity.authc.SimpleAuthenticationInfo.<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V: root-Branch
   * 6 org.jsecurity.authc.SimpleAuthenticationInfo.hashCode()I: I4 Branch 15 IFNULL L178 - false
   */
  @Test
  public void test10()  throws Throwable  {
      LinkedHashSet<SimpleAuthenticationInfo> linkedHashSet0 = new LinkedHashSet<SimpleAuthenticationInfo>();
      LinkedList<SimpleAuthenticationInfo> linkedList0 = new LinkedList<SimpleAuthenticationInfo>();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "[]", "[]");
      Set<Object> set0 = simplePrincipalCollection0.asSet();
      Set<String> set1 = simplePrincipalCollection0.getRealmNames();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((Object) set0, (Object) set1, "[]");
      linkedHashSet0.add(simpleAuthenticationInfo0);
      SimpleAuthenticationInfo simpleAuthenticationInfo1 = new SimpleAuthenticationInfo((Object) "[]", (Object) linkedList0, "[]");
      boolean boolean0 = linkedHashSet0.add(simpleAuthenticationInfo1);
      assertEquals(1, linkedHashSet0.size());
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I23 Branch 12 IFNULL L168 - true
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I34 Branch 14 IFNULL L168 - true
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I4 Branch 10 IF_ACMPNE L163 - false
   */
  @Test
  public void test11()  throws Throwable  {
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      SimpleAuthenticationInfo simpleAuthenticationInfo1 = new SimpleAuthenticationInfo();
      boolean boolean0 = simpleAuthenticationInfo0.equals((Object) simpleAuthenticationInfo1);
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I29 Branch 13 IFNE L168 - false
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.<init>(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/Object;)V: root-Branch
   * 3 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I4 Branch 10 IF_ACMPNE L163 - true
   * 4 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I11 Branch 11 IFNE L164 - true
   * 5 org.jsecurity.authc.SimpleAuthenticationInfo.equals(Ljava/lang/Object;)Z: I23 Branch 12 IFNULL L168 - false
   */
  @Test
  public void test12()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((PrincipalCollection) simplePrincipalCollection0, (Object) "principals argument cannot be an empty collection.");
      SimpleAuthenticationInfo simpleAuthenticationInfo1 = new SimpleAuthenticationInfo();
      boolean boolean0 = simpleAuthenticationInfo0.equals((Object) simpleAuthenticationInfo1);
      assertEquals(false, boolean0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.SimpleAuthenticationInfo.hashCode()I: I4 Branch 15 IFNULL L178 - true
   * 2 org.jsecurity.authc.SimpleAuthenticationInfo.<init>()V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      int int0 = simpleAuthenticationInfo0.hashCode();
      assertEquals(0, int0);
  }
}
