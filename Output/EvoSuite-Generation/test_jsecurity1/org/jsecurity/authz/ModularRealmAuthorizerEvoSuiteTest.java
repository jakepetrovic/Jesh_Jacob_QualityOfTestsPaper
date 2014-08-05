/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authz;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.ModularRealmAuthorizer;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.UnauthorizedException;
import org.jsecurity.authz.permission.AllPermission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class ModularRealmAuthorizerEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.getRealms()Ljava/util/Collection;: root-Branch
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.<init>()V: root-Branch
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - true
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I3 Branch 27 IFNULL L228 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I6 Branch 28 IFLE L228 - false
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I21 Branch 29 IF_ICMPGE L229 - false
   */
  @Test
  public void test0()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, stringArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I8 Branch 3 IFNULL L98 - true
   */
  @Test
  public void test1()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      modularRealmAuthorizer0.setPermissionResolver((PermissionResolver) null);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I8 Branch 3 IFNULL L98 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I11 Branch 4 IFGT L98 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.setRealms(Ljava/util/Collection;)V: root-Branch
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.<init>(Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      WildcardPermissionResolver wildcardPermissionResolver0 = (WildcardPermissionResolver)simpleAccountRealm0.getPermissionResolver();
      modularRealmAuthorizer0.setPermissionResolver((PermissionResolver) wildcardPermissionResolver0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_0", simpleAccountRealm0.getName());
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I11 Branch 4 IFGT L98 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I20 Branch 5 IFEQ L99 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I20 Branch 5 IFEQ L99 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I29 Branch 6 IFEQ L100 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: I8 Branch 3 IFNULL L98 - false
   */
  @Test
  public void test3()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      WildcardPermissionResolver wildcardPermissionResolver0 = (WildcardPermissionResolver)simpleAccountRealm0.getPermissionResolver();
      modularRealmAuthorizer0.setPermissionResolver((PermissionResolver) wildcardPermissionResolver0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_9", simpleAccountRealm0.getName());
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 7 IFEQ L114 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 7 IFEQ L114 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 8 IFEQ L115 - true
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.checkPermission(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)V: I6 Branch 25 IFNE L208 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - false
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - true
   */
  @Test
  public void test4()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      try {
        modularRealmAuthorizer0.checkPermission((PrincipalCollection) null, "a&|$vlo/z$u)epLeN");
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * Subject does not have permission [a&|$vlo/z$u)epLeN]
         */
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I21 Branch 13 IF_ICMPGE L145 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I3 Branch 11 IFNULL L143 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I6 Branch 12 IFLE L143 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I21 Branch 13 IF_ICMPGE L145 - false
   */
  @Test
  public void test5()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "'. ";
      stringArray0[1] = "U#zF'c";
      stringArray0[2] = "U#zF'c";
      stringArray0[3] = "U#zF'c";
      stringArray0[4] = "U#zF'c";
      stringArray0[5] = "U#zF'c";
      boolean[] booleanArray0 = modularRealmAuthorizer0.isPermitted((PrincipalCollection) null, stringArray0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 14 IFNULL L159 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 15 IFGT L159 - true
   */
  @Test
  public void test6()  throws Throwable  {
      TreeSet<Realm> treeSet0 = new TreeSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) treeSet0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      boolean[] booleanArray0 = modularRealmAuthorizer0.isPermitted((PrincipalCollection) simplePrincipalCollection0, (List<Permission>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 7
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
  public void test7()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_86", simpleAccountRealm0.getName());
      
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "'. ";
      boolean boolean0 = modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) null, stringArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I3 Branch 21 IFNULL L193 - true
   */
  @Test
  public void test8()  throws Throwable  {
      TreeSet<Realm> treeSet0 = new TreeSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) treeSet0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      boolean boolean0 = modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I3 Branch 21 IFNULL L193 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I6 Branch 22 IFGT L193 - true
   */
  @Test
  public void test9()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      LinkedHashSet<Permission> linkedHashSet0 = new LinkedHashSet<Permission>();
      boolean boolean0 = modularRealmAuthorizer0.isPermittedAll((PrincipalCollection) null, (Collection<Permission>) linkedHashSet0);
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkPermission(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)V: I6 Branch 26 IFNE L218 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: I13 Branch 9 IFEQ L129 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: I13 Branch 9 IFEQ L129 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: I24 Branch 10 IFEQ L130 - true
   */
  @Test
  public void test10()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      AllPermission allPermission0 = new AllPermission();
      try {
        modularRealmAuthorizer0.checkPermission((PrincipalCollection) null, (Permission) allPermission0);
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * Subject does not have permission [org.jsecurity.authz.permission.AllPermission@63f3a140]
         */
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 30 IFNULL L241 - true
   */
  @Test
  public void test11()  throws Throwable  {
      TreeSet<Realm> treeSet0 = new TreeSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) treeSet0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      modularRealmAuthorizer0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) null);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 30 IFNULL L241 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I12 Branch 31 IFEQ L242 - true
   */
  @Test
  public void test12()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedList0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      LinkedHashSet<Permission> linkedHashSet0 = new LinkedHashSet<Permission>();
      modularRealmAuthorizer0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) linkedHashSet0);
      assertEquals(true, linkedHashSet0.isEmpty());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 34 IFNULL L268 - true
   */
  @Test
  public void test13()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      boolean[] booleanArray0 = modularRealmAuthorizer0.hasRoles((PrincipalCollection) null, (List<String>) null);
      assertNotNull(booleanArray0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 34 IFNULL L268 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 35 IFGT L268 - true
   */
  @Test
  public void test14()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean[] booleanArray0 = modularRealmAuthorizer0.hasRoles((PrincipalCollection) null, (List<String>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 15
  /*
   * 7 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I25 Branch 36 IFEQ L271 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I3 Branch 34 IFNULL L268 - false
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I6 Branch 35 IFGT L268 - false
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I25 Branch 36 IFEQ L271 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - true
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - false
   * 7 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 33 IFEQ L256 - true
   */
  @Test
  public void test15()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("U#zF'c");
      boolean[] booleanArray0 = modularRealmAuthorizer0.hasRoles((PrincipalCollection) null, (List<String>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I8 Branch 37 IFEQ L286 - true
   */
  @Test
  public void test16()  throws Throwable  {
      TreeSet<Realm> treeSet0 = new TreeSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) treeSet0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = modularRealmAuthorizer0.hasAllRoles((PrincipalCollection) simplePrincipalCollection0, (Collection<String>) linkedHashSet0);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I8 Branch 37 IFEQ L286 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - false
   */
  @Test
  public void test17()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("U#zF'c");
      // Undeclared exception!
      try {
        modularRealmAuthorizer0.hasAllRoles((PrincipalCollection) null, (Collection<String>) linkedList0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authorization operation.
         */
      }
  }

  //Test case number: 18
  /*
   * 8 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I19 Branch 38 IFNE L287 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.getRealms()Ljava/util/Collection;: root-Branch
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - true
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I13 Branch 32 IFEQ L255 - false
   * 5 org.jsecurity.authz.ModularRealmAuthorizer.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: I24 Branch 33 IFEQ L256 - true
   * 6 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I8 Branch 1 IFNULL L82 - false
   * 7 org.jsecurity.authz.ModularRealmAuthorizer.assertRealmsConfigured()V: I11 Branch 2 IFLE L82 - true
   * 8 org.jsecurity.authz.ModularRealmAuthorizer.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I8 Branch 37 IFEQ L286 - false
   */
  @Test
  public void test18()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_188", simpleAccountRealm0.getName());
      
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("U#zF'c");
      boolean boolean0 = modularRealmAuthorizer0.hasAllRoles((PrincipalCollection) null, (Collection<String>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 40 IFNULL L308 - true
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.<init>()V: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      modularRealmAuthorizer0.checkRoles((PrincipalCollection) simplePrincipalCollection0, (Collection<String>) null);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 20
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I3 Branch 40 IFNULL L308 - false
   * 2 org.jsecurity.authz.ModularRealmAuthorizer.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: I12 Branch 41 IFEQ L309 - true
   * 3 org.jsecurity.authz.ModularRealmAuthorizer.setRealms(Ljava/util/Collection;)V: root-Branch
   * 4 org.jsecurity.authz.ModularRealmAuthorizer.<init>(Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedHashSet0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthorizer modularRealmAuthorizer0 = new ModularRealmAuthorizer((Collection<Realm>) linkedHashSet0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Collection) linkedHashSet0, "Wyfi!l'.I]-");
      LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
      modularRealmAuthorizer0.checkRoles((PrincipalCollection) simplePrincipalCollection0, (Collection<String>) linkedHashSet1);
      assertEquals("[]", linkedHashSet1.toString());
  }
}