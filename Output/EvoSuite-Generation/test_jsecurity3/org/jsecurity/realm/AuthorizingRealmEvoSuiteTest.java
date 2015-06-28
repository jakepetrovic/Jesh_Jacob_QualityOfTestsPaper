/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.AuthorizationInfo;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.SimpleAuthorizationInfo;
import org.jsecurity.authz.SimpleAuthorizingAccount;
import org.jsecurity.authz.UnauthorizedException;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermission;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.cache.Cache;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class AuthorizingRealmEvoSuiteTest {


  //Test case number: 0
  /*
   * 15 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)Z: root-Branch
   * 3 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I3 Branch 9 IFNONNULL L252 - true
   * 4 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I16 Branch 10 IFEQ L258 - true
   * 5 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I39 Branch 11 IFNULL L263 - true
   * 6 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I104 Branch 15 IFNONNULL L279 - false
   * 7 org.jsecurity.realm.AuthorizingRealm.getAuthorizationCache()Lorg/jsecurity/cache/Cache;: root-Branch
   * 8 org.jsecurity.realm.AuthorizingRealm.init()V: root-Branch
   * 9 org.jsecurity.realm.AuthorizingRealm.getPermissionResolver()Lorg/jsecurity/authz/permission/PermissionResolver;: root-Branch
   * 10 org.jsecurity.realm.AuthorizingRealm.<init>()V: root-Branch
   * 11 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I4 Branch 2 IFEQ L167 - true
   * 12 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I18 Branch 3 IFNONNULL L173 - false
   * 13 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I23 Branch 4 IFEQ L175 - true
   * 14 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I37 Branch 5 IFNULL L181 - true
   * 15 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I116 Branch 8 IFEQ L195 - false
   */
  @Test
  public void test0()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      // Undeclared exception!
      try {
        simpleAccountRealm0.isPermitted((PrincipalCollection) simplePrincipalCollection0, "8wEaj?");
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.AuthorizingRealm.setPermissionResolver(Lorg/jsecurity/authz/permission/PermissionResolver;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("R`+C");
      WildcardPermissionResolver wildcardPermissionResolver0 = new WildcardPermissionResolver();
      simpleAccountRealm0.setPermissionResolver((PermissionResolver) wildcardPermissionResolver0);
      assertEquals("R`+C", simpleAccountRealm0.getName());
  }

  //Test case number: 2
  /*
   * 10 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I39 Branch 11 IFNULL L263 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I44 Branch 12 IFEQ L264 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.afterCacheManagerSet()V: root-Branch
   * 4 org.jsecurity.realm.AuthorizingRealm.getAuthorizationCacheName()Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.realm.AuthorizingRealm.setAuthorizationCacheName(Ljava/lang/String;)V: root-Branch
   * 6 org.jsecurity.realm.AuthorizingRealm.setAuthorizationCache(Lorg/jsecurity/cache/Cache;)V: I9 Branch 1 IFNULL L106 - false
   * 7 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I37 Branch 5 IFNULL L181 - false
   * 8 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I46 Branch 6 IFNONNULL L183 - false
   * 9 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I77 Branch 7 IFEQ L188 - true
   * 10 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      simpleAccountRealm0.setCacheManager((CacheManager) hashtableCacheManager0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "org.jsecurity.realm.SimpleAccountRealm_7847", "org.jsecurity.realm.SimpleAccountRealm_7847");
      // Undeclared exception!
      try {
        simpleAccountRealm0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) null);
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.clearCachedAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)V: I3 Branch 19 IFNONNULL L314 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.clearCachedAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)V: I15 Branch 20 IFNULL L320 - true
   */
  @Test
  public void test3()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("S.jX?`*?a(/#MLc");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simpleAccountRealm0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 4
  /*
   * 14 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I3 Branch 9 IFNONNULL L252 - false
   * 3 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I9 Branch 21 IFNULL L341 - true
   * 4 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I61 Branch 25 IFLE L354 - false
   * 5 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I4 Branch 26 IFEQ L374 - true
   * 6 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I21 Branch 27 IFNULL L379 - false
   * 7 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I24 Branch 28 IFGT L379 - true
   * 8 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I22 Branch 31 IF_ICMPGE L391 - true
   * 9 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)[Z: I22 Branch 31 IF_ICMPGE L391 - false
   * 10 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I4 Branch 32 IFEQ L405 - true
   * 11 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I15 Branch 33 IFNULL L410 - false
   * 12 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I18 Branch 34 IFGT L410 - false
   * 13 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I41 Branch 35 IFEQ L414 - true
   * 14 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I41 Branch 35 IFEQ L414 - false
   */
  @Test
  public void test4()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("E@lks`!E6s");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "E@lks`!E6s";
      stringArray0[1] = "E@lks`!E6s";
      boolean[] booleanArray0 = simpleAccountRealm0.isPermitted((PrincipalCollection) null, stringArray0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.hasRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)Z: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.hasRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I4 Branch 54 IFEQ L514 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.hasRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I15 Branch 55 IFNULL L517 - true
   */
  @Test
  public void test5()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("E@lks`!E6s");
      assertNotNull(simpleAccountRealm0);
      
      boolean boolean0 = simpleAccountRealm0.hasRole((PrincipalCollection) null, "E@lks`!E6s");
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkRole(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)V: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.checkRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 71 IFEQ L580 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.checkRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)V: I18 Branch 72 IFNE L583 - false
   * 4 org.jsecurity.realm.AuthorizingRealm.hasRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I15 Branch 55 IFNULL L517 - true
   */
  @Test
  public void test6()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("R`+C");
      try {
        simpleAccountRealm0.checkRole((PrincipalCollection) null, "V[he6wz\".yPmTnHA7}l");
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * User does not have role [V[he6wz\".yPmTnHA7}l]
         */
      }
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I3 Branch 9 IFNONNULL L252 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I16 Branch 10 IFEQ L258 - true
   * 4 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I39 Branch 11 IFNULL L263 - true
   * 5 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I104 Branch 15 IFNONNULL L279 - false
   */
  @Test
  public void test7()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "org.jsecurity.realm.SimpleAccountRealm_7847", "org.jsecurity.realm.SimpleAccountRealm_7847");
      // Undeclared exception!
      try {
        simpleAccountRealm0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, (Collection<Permission>) null);
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.checkRoles(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 73 IFEQ L598 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.checkRoles(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I15 Branch 74 IFNULL L601 - true
   */
  @Test
  public void test8()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      simpleAccountRealm0.checkRoles((PrincipalCollection) null, (Collection<String>) null);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_248", simpleAccountRealm0.getName());
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkPermission(Lorg/jsecurity/subject/PrincipalCollection;Lorg/jsecurity/authz/Permission;)V: root-Branch
   * 2 org.jsecurity.realm.AuthorizingRealm.checkPermission(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 46 IFEQ L469 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.checkPermission(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)V: I18 Branch 47 IFNE L472 - false
   * 4 org.jsecurity.realm.AuthorizingRealm.checkPermission(Lorg/jsecurity/subject/PrincipalCollection;Ljava/lang/String;)V: root-Branch
   * 5 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I3 Branch 48 IFNULL L480 - false
   * 6 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I18 Branch 49 IF_ICMPGE L481 - false
   */
  @Test
  public void test9()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = " - trying the classloader associated with this LogFactory.";
      try {
        simpleAccountRealm0.checkPermissions((PrincipalCollection) null, stringArray0);
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * User is not permitted [org.jsecurity.authz.permission.WildcardPermission@21973d0b]
         */
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.AuthorizingRealm.setAuthorizationCache(Lorg/jsecurity/cache/Cache;)V: I9 Branch 1 IFNULL L106 - true
   */
  @Test
  public void test10()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("E@lks`!E6s");
      simpleAccountRealm0.setAuthorizationCache((Cache) null);
      assertEquals("E@lks`!E6s", simpleAccountRealm0.getName());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.AuthorizingRealm.clearCachedAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)V: I3 Branch 19 IFNONNULL L314 - false
   */
  @Test
  public void test11()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("E@lks`!E6s");
      simpleAccountRealm0.clearCachedAuthorizationInfo((PrincipalCollection) null);
      assertEquals("E@lks`!E6s", simpleAccountRealm0.getName());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I9 Branch 21 IFNULL L341 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I14 Branch 22 IFNULL L342 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I26 Branch 23 IFNULL L346 - true
   */
  @Test
  public void test12()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("");
      WildcardPermission wildcardPermission0 = new WildcardPermission("sY$qk7WQWh)");
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      // Undeclared exception!
      try {
        simpleAccountRealm0.checkPermission((Permission) wildcardPermission0, (AuthorizationInfo) simpleAuthorizationInfo0);
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * User is not permitted [org.jsecurity.authz.permission.WildcardPermission@30432789]
         */
      }
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I18 Branch 34 IFGT L410 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: root-Branch
   * 3 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I4 Branch 32 IFEQ L405 - true
   * 4 org.jsecurity.realm.AuthorizingRealm.isPermitted(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I15 Branch 33 IFNULL L410 - false
   */
  @Test
  public void test13()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      boolean[] booleanArray0 = simpleAccountRealm0.isPermitted((PrincipalCollection) null, (List<Permission>) linkedList0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 14
  /*
   * 6 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I29 Branch 38 IF_ICMPGE L426 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I9 Branch 39 IFNULL L436 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.getPermissionResolver()Lorg/jsecurity/authz/permission/PermissionResolver;: root-Branch
   * 4 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I3 Branch 36 IFNULL L424 - false
   * 5 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I6 Branch 37 IFLE L424 - false
   * 6 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)Z: I29 Branch 38 IF_ICMPGE L426 - false
   */
  @Test
  public void test14()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "this argument type to a byte[], you can 1) convert the argument to a byte[], char[] or String ";
      boolean boolean0 = simpleAccountRealm0.isPermittedAll((PrincipalCollection) null, stringArray0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_417", simpleAccountRealm0.getName());
      assertEquals(false, boolean0);
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I4 Branch 41 IFEQ L442 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I15 Branch 42 IFNULL L446 - false
   * 3 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I18 Branch 43 IFGT L446 - true
   */
  @Test
  public void test15()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      HashSet<Permission> hashSet0 = new HashSet<Permission>();
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      boolean boolean0 = simpleAccountRealm0.isPermittedAll((Collection<Permission>) hashSet0, (AuthorizationInfo) simpleAuthorizationInfo0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_462", simpleAccountRealm0.getName());
      assertEquals(true, boolean0);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I15 Branch 42 IFNULL L446 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.isPermittedAll(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I4 Branch 41 IFEQ L442 - true
   */
  @Test
  public void test16()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("UPm?jGdGLVg4-G");
      assertNotNull(simpleAccountRealm0);
      
      boolean boolean0 = simpleAccountRealm0.isPermittedAll((Collection<Permission>) null, (AuthorizationInfo) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Lorg/jsecurity/subject/PrincipalCollection;[Ljava/lang/String;)V: I3 Branch 48 IFNULL L480 - true
   */
  @Test
  public void test17()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      SimpleAuthorizingAccount simpleAuthorizingAccount0 = new SimpleAuthorizingAccount((Object) "localhost/127.0.0.1", (Object) "UTF-8", "|");
      SimplePrincipalCollection simplePrincipalCollection0 = (SimplePrincipalCollection)simpleAuthorizingAccount0.getPrincipals();
      simpleAccountRealm0.checkPermissions((PrincipalCollection) simplePrincipalCollection0, (String[]) null);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_498", simpleAccountRealm0.getName());
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 50 IFEQ L495 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I15 Branch 51 IFNULL L498 - true
   */
  @Test
  public void test18()  throws Throwable  {
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      simpleAccountRealm0.checkPermissions((Collection<Permission>) null, (AuthorizationInfo) simpleAuthorizationInfo0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_512", simpleAccountRealm0.getName());
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I15 Branch 51 IFNULL L498 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I18 Branch 52 IFGT L498 - true
   */
  @Test
  public void test19()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("E@lks`!E6s");
      TreeSet<Permission> treeSet0 = new TreeSet<Permission>();
      simpleAccountRealm0.checkPermissions((Collection<Permission>) treeSet0, (AuthorizationInfo) null);
      assertEquals("[]", treeSet0.toString());
  }

  //Test case number: 20
  /*
   * 11 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I18 Branch 52 IFGT L498 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I27 Branch 53 IFEQ L499 - false
   * 3 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I4 Branch 26 IFEQ L374 - true
   * 4 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I21 Branch 27 IFNULL L379 - false
   * 5 org.jsecurity.realm.AuthorizingRealm.isPermitted(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I24 Branch 28 IFGT L379 - true
   * 6 org.jsecurity.realm.AuthorizingRealm.checkPermission(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 46 IFEQ L469 - true
   * 7 org.jsecurity.realm.AuthorizingRealm.checkPermission(Lorg/jsecurity/authz/Permission;Lorg/jsecurity/authz/AuthorizationInfo;)V: I18 Branch 47 IFNE L472 - false
   * 8 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 50 IFEQ L495 - true
   * 9 org.jsecurity.realm.AuthorizingRealm.checkPermissions(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I15 Branch 51 IFNULL L498 - false
   * 10 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I9 Branch 21 IFNULL L341 - true
   * 11 org.jsecurity.realm.AuthorizingRealm.getPermissions(Lorg/jsecurity/authz/AuthorizationInfo;)Ljava/util/Collection;: I61 Branch 25 IFLE L354 - false
   */
  @Test
  public void test20()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("S.jX?`*?a(/#MLc");
      LinkedList<Permission> linkedList0 = new LinkedList<Permission>();
      WildcardPermission wildcardPermission0 = new WildcardPermission("S.jX?`*?a(/#MLc");
      linkedList0.add((Permission) wildcardPermission0);
      // Undeclared exception!
      try {
        simpleAccountRealm0.checkPermissions((Collection<Permission>) linkedList0, (AuthorizationInfo) null);
        fail("Expecting exception: UnauthorizedException");
      } catch(UnauthorizedException e) {
        /*
         * User is not permitted [org.jsecurity.authz.permission.WildcardPermission@9a8fd32]
         */
      }
  }

  //Test case number: 21
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.hasRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I15 Branch 55 IFNULL L517 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.hasRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I18 Branch 56 IFNULL L517 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.hasRole(Ljava/lang/String;Lorg/jsecurity/authz/AuthorizationInfo;)Z: I4 Branch 54 IFEQ L514 - true
   */
  @Test
  public void test21()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("\"RD");
      assertNotNull(simpleAccountRealm0);
      
      SimpleAccount simpleAccount0 = new SimpleAccount((Object) "\u0003\u0000", (Object) simpleAccountRealm0, "\u0003\u0000");
      boolean boolean0 = simpleAccountRealm0.hasRole((String) null, (AuthorizationInfo) simpleAccount0);
      assertEquals(false, boolean0);
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I9 Branch 58 IFNULL L522 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.hasRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/List;)[Z: I21 Branch 59 IFNULL L523 - true
   */
  @Test
  public void test22()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      simpleAccountRealm0.hasRoles((PrincipalCollection) null, (List<String>) linkedList0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_609", simpleAccountRealm0.getName());
  }

  //Test case number: 23
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.hasRoles(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I4 Branch 60 IFEQ L532 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.hasRoles(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I15 Branch 61 IFNULL L537 - false
   * 3 org.jsecurity.realm.AuthorizingRealm.hasRoles(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I18 Branch 62 IFGT L537 - true
   */
  @Test
  public void test23()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("\"RD");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleAccount simpleAccount0 = new SimpleAccount((Object) "\u0003\u0000", (Object) simpleAccountRealm0, "\u0003\u0000");
      boolean[] booleanArray0 = simpleAccountRealm0.hasRoles((List<String>) linkedList0, (AuthorizationInfo) simpleAccount0);
      assertNotNull(booleanArray0);
  }

  //Test case number: 24
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.hasRoles(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I15 Branch 61 IFNULL L537 - true
   * 2 org.jsecurity.realm.AuthorizingRealm.hasRoles(Ljava/util/List;Lorg/jsecurity/authz/AuthorizationInfo;)[Z: I4 Branch 60 IFEQ L532 - true
   */
  @Test
  public void test24()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      SimpleAuthorizationInfo simpleAuthorizationInfo0 = new SimpleAuthorizationInfo();
      simpleAccountRealm0.hasRoles((List<String>) null, (AuthorizationInfo) simpleAuthorizationInfo0);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_647", simpleAccountRealm0.getName());
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.AuthorizingRealm.hasAllRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)Z: I9 Branch 64 IFNULL L552 - true
   */
  @Test
  public void test25()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      assertNotNull(simpleAccountRealm0);
      
      boolean boolean0 = simpleAccountRealm0.hasAllRoles((PrincipalCollection) null, (Collection<String>) null);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_663", simpleAccountRealm0.getName());
      assertEquals(false, boolean0);
  }

  //Test case number: 26
  /*
   * 13 covered goals:
   * 1 org.jsecurity.realm.AuthorizingRealm.checkRoles(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I15 Branch 74 IFNULL L601 - false
   * 2 org.jsecurity.realm.AuthorizingRealm.checkRoles(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I18 Branch 75 IFGT L601 - true
   * 3 org.jsecurity.realm.AuthorizingRealm.getAuthorizationCache()Lorg/jsecurity/cache/Cache;: root-Branch
   * 4 org.jsecurity.realm.AuthorizingRealm.init()V: root-Branch
   * 5 org.jsecurity.realm.AuthorizingRealm.<init>()V: root-Branch
   * 6 org.jsecurity.realm.AuthorizingRealm.checkRoles(Lorg/jsecurity/subject/PrincipalCollection;Ljava/util/Collection;)V: root-Branch
   * 7 org.jsecurity.realm.AuthorizingRealm.getAuthorizationInfo(Lorg/jsecurity/subject/PrincipalCollection;)Lorg/jsecurity/authz/AuthorizationInfo;: I3 Branch 9 IFNONNULL L252 - false
   * 8 org.jsecurity.realm.AuthorizingRealm.checkRoles(Ljava/util/Collection;Lorg/jsecurity/authz/AuthorizationInfo;)V: I4 Branch 73 IFEQ L598 - true
   * 9 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I4 Branch 2 IFEQ L167 - true
   * 10 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I18 Branch 3 IFNONNULL L173 - false
   * 11 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I23 Branch 4 IFEQ L175 - true
   * 12 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I37 Branch 5 IFNULL L181 - true
   * 13 org.jsecurity.realm.AuthorizingRealm.initAuthorizationCache()V: I116 Branch 8 IFEQ L195 - false
   */
  @Test
  public void test26()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      simpleAccountRealm0.checkRoles((PrincipalCollection) null, (Collection<String>) linkedList0);
      assertNull(simpleAccountRealm0.getAuthorizationCacheName());
  }
}
