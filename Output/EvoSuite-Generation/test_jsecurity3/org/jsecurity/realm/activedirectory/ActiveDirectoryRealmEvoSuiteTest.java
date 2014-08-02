/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm.activedirectory;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.SimpleAuthorizationInfo;
import org.jsecurity.realm.activedirectory.ActiveDirectoryRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class ActiveDirectoryRealmEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.queryForAuthenticationInfo(Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/realm/ldap/LdapContextFactory;)Lorg/jsecurity/authc/AuthenticationInfo;: root-Branch
   * 2 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("[BAD CL TREE] ", "[BAD CL TREE] ", true);
      // Undeclared exception!
      try {
        activeDirectoryRealm0.getAuthenticationInfo((AuthenticationToken) usernamePasswordToken0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.queryForAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/realm/ldap/LdapContextFactory;)Lorg/jsecurity/authz/AuthorizationInfo;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      // Undeclared exception!
      try {
        activeDirectoryRealm0.checkRoles((PrincipalCollection) simplePrincipalCollection0, (Collection<String>) treeSet0);
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.buildAuthorizationInfo(Ljava/util/Set;)Lorg/jsecurity/authz/AuthorizationInfo;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = (SimpleAuthorizationInfo)activeDirectoryRealm0.buildAuthorizationInfo((Set<String>) treeSet0);
      assertNotNull(simpleAuthorizationInfo0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.buildAuthenticationInfo(Ljava/lang/String;[C)Lorg/jsecurity/authc/AuthenticationInfo;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      char[] charArray0 = new char[6];
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = (SimpleAuthenticationInfo)activeDirectoryRealm0.buildAuthenticationInfo("|Gl", charArray0);
      assertNotNull(simpleAuthenticationInfo0);
      assertEquals("org.jsecurity.realm.activedirectory.ActiveDirectoryRealm_12", activeDirectoryRealm0.getName());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I12 Branch 8 IFNULL L219 - true
   */
  @Test
  public void test4()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      HashSet<String> hashSet0 = new HashSet<String>();
      activeDirectoryRealm0.getRoleNamesForGroups((Collection<String>) hashSet0);
      assertEquals("org.jsecurity.realm.activedirectory.ActiveDirectoryRealm_14", activeDirectoryRealm0.getName());
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I21 Branch 9 IFEQ L220 - false
   * 2 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I37 Branch 10 IFNULL L222 - true
   * 3 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.setGroupRolesMap(Ljava/util/Map;)V: root-Branch
   * 4 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I12 Branch 8 IFNULL L219 - false
   * 5 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I21 Branch 9 IFEQ L220 - true
   */
  @Test
  public void test5()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      activeDirectoryRealm0.setGroupRolesMap((Map<String, String>) hashMap0);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("$geg2|QAzo;p%Hp<75");
      activeDirectoryRealm0.getRoleNamesForGroups((Collection<String>) treeSet0);
      assertEquals("org.jsecurity.realm.activedirectory.ActiveDirectoryRealm_18", activeDirectoryRealm0.getName());
  }

  //Test case number: 6
  /*
   * 9 covered goals:
   * 1 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I37 Branch 10 IFNULL L222 - false
   * 2 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I54 Branch 11 IF_ICMPGE L223 - true
   * 3 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I54 Branch 11 IF_ICMPGE L223 - false
   * 4 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I63 Branch 12 IFEQ L225 - true
   * 5 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.<init>()V: root-Branch
   * 6 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.setGroupRolesMap(Ljava/util/Map;)V: root-Branch
   * 7 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I12 Branch 8 IFNULL L219 - false
   * 8 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I21 Branch 9 IFEQ L220 - true
   * 9 org.jsecurity.realm.activedirectory.ActiveDirectoryRealm.getRoleNamesForGroups(Ljava/util/Collection;)Ljava/util/Collection;: I21 Branch 9 IFEQ L220 - false
   */
  @Test
  public void test6()  throws Throwable  {
      ActiveDirectoryRealm activeDirectoryRealm0 = new ActiveDirectoryRealm();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      activeDirectoryRealm0.setGroupRolesMap((Map<String, String>) hashMap0);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("$geg2|QAzo;p%Hp<75");
      hashMap0.put("$geg2|QAzo;p%Hp<75", "$geg2|QAzo;p%Hp<75");
      Collection<String> collection0 = activeDirectoryRealm0.getRoleNamesForGroups((Collection<String>) treeSet0);
      assertEquals("org.jsecurity.realm.activedirectory.ActiveDirectoryRealm_30", activeDirectoryRealm0.getName());
      assertEquals(1, collection0.size());
  }
}
