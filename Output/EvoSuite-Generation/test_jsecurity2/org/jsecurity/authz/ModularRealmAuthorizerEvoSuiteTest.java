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
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.ModularRealmAuthorizer;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.UnauthorizedException;
import org.jsecurity.authz.permission.AllPermission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermission;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class ModularRealmAuthorizerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I8 Branch 3 IFNULL L98 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.getRealms()Ljava/util/Collection;: root-Branch
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("] did not math the expectdcredentials.");
      WildcardPermissionResolver wildcardPermissionResolver0 = (WildcardPermissionResolver)simpleAccountRealm0.getPermissionResolver();
      modularRealmAuthorizer0.setPermissionResolver((PermissionResolver) wildcardPermissionResolver0);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I3 Branch 21 IFNULL L193 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I6 Branch 22 IFGT L193 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I15 Branch 23 IFEQ L194 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.setRealms(Ljava/util/Collection;)V: root-Branch
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.<init>(Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      WildcardPermission wildcardPermission0 = new WildcardPermission("zHU%l`i:_6n");
      linkedList0.add((Permission) wildcardPermission0);
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) null, (Collection<Permission>) linkedList0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 2
  /*
   * 9 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 33 IFEQ L256 - true
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I25 Branch 36 IFEQ L271 - true
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 35 IFGT L268 - false
   * 7 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I25 Branch 36 IFEQ L271 - false
   * 8 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - false
   * 9 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 34 IFNULL L268 - false
   */
  @Test
  public void test2()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      hashSet0.add((Realm) simpleAccountRealm0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      boolean[] booleanArray0 = modularRealmAuthorizer0.hasRoles((PrincipalCollection) null, (List<String>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I8 Branch 3 IFNULL L98 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I11 Branch 4 IFGT L98 - true
   */
  @Test
  public void test3()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("k2n+5i9#=");
      WildcardPermissionResolver wildcardPermissionResolver0 = (WildcardPermissionResolver)simpleAccountRealm0.getPermissionResolver();
      modularRealmAuthorizer0.setPermissionResolver((PermissionResolver) wildcardPermissionResolver0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I11 Branch 4 IFGT L98 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I20 Branch 5 IFEQ L99 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I20 Branch 5 IFEQ L99 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I29 Branch 6 IFEQ L100 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I8 Branch 3 IFNULL L98 - false
   */
  @Test
  public void test4()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      hashSet0.add((Realm) simpleAccountRealm0);
      WildcardPermissionResolver wildcardPermissionResolver0 = new WildcardPermissionResolver();
      modularRealmAuthorizer0.setPermissionResolver((PermissionResolver) wildcardPermissionResolver0);
  }

  //Test case number: 5
  /*
   * 7 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 7 IFEQ L114 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 7 IFEQ L114 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 8 IFEQ L115 - true
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.checkPermission(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)V: I6 Branch 25 IFNE L208 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I3 Branch 27 IFNULL L228 - false
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I6 Branch 28 IFLE L228 - false
   * 7 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I21 Branch 29 IF_ICMPGE L229 - false
   */
  @Test
  public void test5()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      hashSet0.add((Realm) simpleAccountRealm0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "%mK~b?+pD;";
      try {
        modularRealmAuthorizer0.checkPermissions((PrincipalCollection) null, stringArray0);
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * Subject does not have permission [%mK~b?+pD;]
         */
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I3 Branch 11 IFNULL L143 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I6 Branch 12 IFLE L143 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I21 Branch 13 IF_ICMPGE L145 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - false
   */
  @Test
  public void test6()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.isPermitted((PrincipalCollection) null, stringArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 14 IFNULL L159 - true
   */
  @Test
  public void test7()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      boolean[] booleanArray0 = modularRealmAuthorizer0.isPermitted((PrincipalCollection) null, (List<Permission>) null);
      assertNotNull(booleanArray0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 14 IFNULL L159 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 15 IFGT L159 - true
   */
  @Test
  public void test8()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      WildcardPermission wildcardPermission0 = new WildcardPermission("zHU%l`i:_6n");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) wildcardPermission0, "zHU%l`i:_6n");
      boolean[] booleanArray0 = modularRealmAuthorizer0.isPermitted((PrincipalCollection) simplePrincipalCollection0, (List<Permission>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 15 IFGT L159 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I25 Branch 16 IFEQ L162 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 14 IFNULL L159 - false
   */
  @Test
  public void test9()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      WildcardPermission wildcardPermission0 = new WildcardPermission("zHU%l`i:_6n");
      linkedList0.add((Permission) wildcardPermission0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) wildcardPermission0, "zHU%l`i:_6n");
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.isPermitted((PrincipalCollection) simplePrincipalCollection0, (List<Permission>) linkedList0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I3 Branch 17 IFNULL L177 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I6 Branch 18 IFLE L177 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I21 Branch 19 IF_ICMPGE L178 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - false
   */
  @Test
  public void test10()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) null, stringArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 11
  /*
   * 7 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I32 Branch 20 IFNE L179 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I3 Branch 17 IFNULL L177 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I6 Branch 18 IFLE L177 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I21 Branch 19 IF_ICMPGE L178 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 7 IFEQ L114 - true
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 7 IFEQ L114 - false
   * 7 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 8 IFEQ L115 - true
   */
  @Test
  public void test11()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      hashSet0.add((Realm) simpleAccountRealm0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_110", simpleAccountRealm0.getName());
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "O0/$yX~=1_fsj";
      boolean boolean0 = modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) null, stringArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I3 Branch 21 IFNULL L193 - true
   */
  @Test
  public void test12()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      boolean boolean0 = modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I6 Branch 22 IFGT L193 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I3 Branch 21 IFNULL L193 - false
   */
  @Test
  public void test13()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      PrincipalCollection principalCollection0 = simpleAuthenticationInfo0.getPrincipals();
      TreeSet<Permission> treeSet0 = new TreeSet<Permission>();
      boolean boolean0 = modularRealmAuthorizer0.isPermittedAll(principalCollection0, (Collection<Permission>) treeSet0);
      assertEquals(true, boolean0);
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkPermission(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)V: I6 Branch 26 IFNE L218 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: I13 Branch 9 IFEQ L129 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: I13 Branch 9 IFEQ L129 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: I24 Branch 10 IFEQ L130 - true
   */
  @Test
  public void test14()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      hashSet0.add((Realm) simpleAccountRealm0);
      AllPermission allPermission0 = new AllPermission();
      try {
        modularRealmAuthorizer0.checkPermission((PrincipalCollection) null, (Permission) allPermission0);
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * Subject does not have permission [org.jsecurity.authz.permission.AllPermission@6a46aa87]
         */
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 30 IFNULL L241 - true
   */
  @Test
  public void test15()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      modularRealmAuthorizer0.checkPermissions((PrincipalCollection) null, (Collection<Permission>) null);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 30 IFNULL L241 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I12 Branch 31 IFEQ L242 - true
   */
  @Test
  public void test16()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      TreeSet<Permission> treeSet0 = new TreeSet<Permission>();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      modularRealmAuthorizer0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) treeSet0);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 34 IFNULL L268 - true
   */
  @Test
  public void test17()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      boolean[] booleanArray0 = modularRealmAuthorizer0.hasRoles((PrincipalCollection) null, (List<String>) null);
      assertNotNull(booleanArray0);
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 35 IFGT L268 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 34 IFNULL L268 - false
   */
  @Test
  public void test18()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean[] booleanArray0 = modularRealmAuthorizer0.hasRoles((PrincipalCollection) null, (List<String>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I8 Branch 37 IFEQ L286 - true
   */
  @Test
  public void test19()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      PrincipalCollection principalCollection0 = simpleAuthenticationInfo0.getPrincipals();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      boolean boolean0 = modularRealmAuthorizer0.hasAllRoles(principalCollection0, (Collection<String>) treeSet0);
      assertEquals(true, boolean0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I8 Branch 37 IFEQ L286 - false
   */
  @Test
  public void test20()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      WildcardPermission wildcardPermission0 = new WildcardPermission("zHU%l`i:_6n", true);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) wildcardPermission0, "zHU%l`i:_6n");
      Set<String> set0 = simplePrincipalCollection0.getRealmNames();
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.hasAllRoles((PrincipalCollection) null, (Collection<String>) set0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 21
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)V: I6 Branch 39 IFNE L299 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 33 IFEQ L256 - true
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - false
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - true
   */
  @Test
  public void test21()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      hashSet0.add((Realm) simpleAccountRealm0);
      try {
        modularRealmAuthorizer0.checkRole((PrincipalCollection) null, "8.;&e=1J");
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * Subject does not have role [8.;&e=1J]
         */
      }
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 40 IFNULL L308 - true
   */
  @Test
  public void test22()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) null);
      modularRealmAuthorizer0.checkRoles((PrincipalCollection) null, (Collection<String>) null);
  }

  //Test case number: 23
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 40 IFNULL L308 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I12 Branch 41 IFEQ L309 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.setRealms(Ljava/util/Collection;)V: root-Branch
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.<init>(Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      HashSet<Realm> hashSet0 = new HashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) hashSet0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      modularRealmAuthorizer0.checkRoles((PrincipalCollection) null, (Collection<String>) linkedHashSet0);
      assertEquals(true, linkedHashSet0.isEmpty());
  }

  //Test case number: 24
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I12 Branch 41 IFEQ L309 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.getRealms()Ljava/util/Collection;: root-Branch
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.<init>()V: root-Branch
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - true
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 40 IFNULL L308 - false
   */
  @Test
  public void test24()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "UTF-8", "UTF-8");
      Set<String> set0 = simplePrincipalCollection0.getRealmNames();
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.checkRoles((PrincipalCollection) simplePrincipalCollection0, (Collection<String>) set0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }
}
