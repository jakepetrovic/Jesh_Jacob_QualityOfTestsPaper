/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authz;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.SimpleAuthorizationInfo;
import org.jsecurity.authz.permission.WildcardPermission;

public class SimpleAuthorizationInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.setObjectPermissions(Ljava/util/Set;)V: root-Branch
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      simpleAuthorizationInfo0.setObjectPermissions((Set<Permission>) null);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.getObjectPermissions()Ljava/util/Set;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      Set<Permission> set0 = (Set<Permission>)simpleAuthorizationInfo0.getObjectPermissions();
      assertNull(set0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addStringPermissions(Ljava/util/Collection;)V: I4 Branch 4 IFNONNULL L134 - true
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.setStringPermissions(Ljava/util/Set;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      simpleAuthorizationInfo0.setStringPermissions((Set<String>) treeSet0);
      simpleAuthorizationInfo0.addStringPermissions((Collection<String>) treeSet0);
      assertEquals(true, treeSet0.isEmpty());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.setRoles(Ljava/util/Set;)V: root-Branch
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.<init>(Ljava/util/Set;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo((Set<String>) null);
      simpleAuthorizationInfo0.setRoles((Set<String>) null);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.getRoles()Ljava/util/Set;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      Set<String> set0 = (Set<String>)simpleAuthorizationInfo0.getRoles();
      assertNull(set0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.getStringPermissions()Ljava/util/Set;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      Set<String> set0 = (Set<String>)simpleAuthorizationInfo0.getStringPermissions();
      assertNull(set0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addRole(Ljava/lang/String;)V: I4 Branch 1 IFNONNULL L83 - true
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.addRoles(Ljava/util/Collection;)V: I4 Branch 2 IFNONNULL L95 - false
   */
  @Test
  public void test6()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      simpleAuthorizationInfo0.addRoles((Collection<String>) linkedHashSet0);
      simpleAuthorizationInfo0.addRole("Wildcard string cannot contain parts with only dividers. Make sure permission strings are properly formatted.");
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addRole(Ljava/lang/String;)V: I4 Branch 1 IFNONNULL L83 - false
   */
  @Test
  public void test7()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      simpleAuthorizationInfo0.addRole("");
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addRoles(Ljava/util/Collection;)V: I4 Branch 2 IFNONNULL L95 - true
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.addRoles(Ljava/util/Collection;)V: I4 Branch 2 IFNONNULL L95 - false
   */
  @Test
  public void test8()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      simpleAuthorizationInfo0.addRoles((Collection<String>) linkedHashSet0);
      // Undeclared exception!
      try {
        simpleAuthorizationInfo0.addRoles((Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addStringPermission(Ljava/lang/String;)V: I4 Branch 3 IFNONNULL L122 - true
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.addStringPermission(Ljava/lang/String;)V: I4 Branch 3 IFNONNULL L122 - false
   */
  @Test
  public void test9()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      simpleAuthorizationInfo0.addStringPermission("U");
      simpleAuthorizationInfo0.addStringPermission("");
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addStringPermissions(Ljava/util/Collection;)V: I4 Branch 4 IFNONNULL L134 - false
   */
  @Test
  public void test10()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      simpleAuthorizationInfo0.addStringPermissions((Collection<String>) linkedHashSet0);
      assertEquals(true, linkedHashSet0.isEmpty());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addObjectPermission(Lorg/jsecurity/authz/Permission;)V: I4 Branch 5 IFNONNULL L161 - true
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.addObjectPermission(Lorg/jsecurity/authz/Permission;)V: I4 Branch 5 IFNONNULL L161 - false
   */
  @Test
  public void test11()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      WildcardPermission wildcardPermission0 = new WildcardPermission("(Z&eS'bOfz(");
      simpleAuthorizationInfo0.addObjectPermission((Permission) wildcardPermission0);
      simpleAuthorizationInfo0.addObjectPermission((Permission) wildcardPermission0);
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addObjectPermissions(Ljava/util/Collection;)V: I4 Branch 6 IFNONNULL L174 - true
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.<init>()V: root-Branch
   * 3 org.jsecurity.authz.SimpleAuthorizationInfo.addObjectPermission(Lorg/jsecurity/authz/Permission;)V: I4 Branch 5 IFNONNULL L161 - false
   */
  @Test
  public void test12()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      simpleAuthorizationInfo0.addObjectPermission((Permission) null);
      // Undeclared exception!
      try {
        simpleAuthorizationInfo0.addObjectPermissions((Collection<Permission>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.SimpleAuthorizationInfo.addObjectPermissions(Ljava/util/Collection;)V: I4 Branch 6 IFNONNULL L174 - false
   * 2 org.jsecurity.authz.SimpleAuthorizationInfo.<init>(Ljava/util/Set;)V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo((Set<String>) null);
      HashSet<Permission> hashSet0 = new HashSet<Permission>();
      simpleAuthorizationInfo0.addObjectPermissions((Collection<Permission>) hashSet0);
      assertEquals(0, hashSet0.size());
  }
}
