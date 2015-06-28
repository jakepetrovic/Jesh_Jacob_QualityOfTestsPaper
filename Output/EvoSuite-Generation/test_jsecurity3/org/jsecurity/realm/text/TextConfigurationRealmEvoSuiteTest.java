/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.util.Collection;
import java.util.Map;
import org.jsecurity.cache.Cache;
import org.jsecurity.cache.HashtableCache;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.realm.text.TextConfigurationRealm;
import org.jsecurity.subject.PrincipalCollection;

public class TextConfigurationRealmEvoSuiteTest {


  //Test case number: 0
  /*
   * 12 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I21 Branch 7 IFNULL L156 - true
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.setUserDefinitions(Ljava/lang/String;)V: root-Branch
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.getRoleDefinitions()Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.processDefinitions()V: root-Branch
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.<init>()V: root-Branch
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.getUserDefinitions()Ljava/lang/String;: root-Branch
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.accountAndRoleCachesCreated()V: root-Branch
   * 9 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - true
   * 10 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - false
   * 11 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - false
   * 12 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - false
   */
  @Test
  public void test0()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setUserDefinitions("");
      textConfigurationRealm0.afterAuthorizationCacheSet();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_0", textConfigurationRealm0.getName());
  }

  //Test case number: 1
  /*
   * 13 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I58 Branch 5 IFNONNULL L138 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I21 Branch 2 IFNULL L130 - false
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I24 Branch 3 IFLE L130 - true
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I37 Branch 4 IFEQ L134 - true
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I37 Branch 4 IFEQ L134 - false
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I58 Branch 5 IFNONNULL L138 - false
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.setRoleDefinitions(Ljava/lang/String;)V: root-Branch
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - false
   * 9 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - true
   * 10 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - true
   * 11 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - false
   * 12 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - false
   * 13 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - true
   */
  @Test
  public void test1()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setRoleDefinitions("q67%75*up=b3F");
      textConfigurationRealm0.afterAuthorizationCacheSet();
      textConfigurationRealm0.accountAndRoleCachesCreated();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_20", textConfigurationRealm0.getName());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.onLogout((PrincipalCollection) null);
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_75", textConfigurationRealm0.getName());
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I21 Branch 2 IFNULL L130 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - false
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.setRoleDefinitions(Ljava/lang/String;)V: root-Branch
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - false
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - true
   */
  @Test
  public void test3()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setRoleDefinitions("");
      textConfigurationRealm0.afterAuthorizationCacheSet();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_76", textConfigurationRealm0.getName());
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I21 Branch 7 IFNULL L156 - false
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I24 Branch 8 IFLE L156 - true
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I37 Branch 9 IFEQ L160 - true
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I37 Branch 9 IFEQ L160 - false
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I69 Branch 10 IFNONNULL L169 - false
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I95 Branch 11 IF_ICMPLE L175 - true
   */
  @Test
  public void test4()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setUserDefinitions("tO?TM7]=vwo+8");
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      HashtableCache hashtableCache0 = (HashtableCache)hashtableCacheManager0.getCache("tO?TM7]=vwo+8");
      textConfigurationRealm0.setAuthorizationCache((Cache) hashtableCache0);
      assertEquals(1, hashtableCache0.size());
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_96", textConfigurationRealm0.getName());
  }

  //Test case number: 5
  /*
   * 24 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I69 Branch 10 IFNONNULL L169 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I95 Branch 11 IF_ICMPLE L175 - false
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I104 Branch 12 IF_ICMPGE L176 - true
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I104 Branch 12 IF_ICMPGE L176 - false
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I125 Branch 13 IFNULL L181 - true
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.setUserDefinitions(Ljava/lang/String;)V: root-Branch
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.getRoleDefinitions()Ljava/lang/String;: root-Branch
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.processDefinitions()V: root-Branch
   * 9 org.jsecurity.realm.text.TextConfigurationRealm.<init>()V: root-Branch
   * 10 org.jsecurity.realm.text.TextConfigurationRealm.getUserDefinitions()Ljava/lang/String;: root-Branch
   * 11 org.jsecurity.realm.text.TextConfigurationRealm.accountAndRoleCachesCreated()V: root-Branch
   * 12 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - true
   * 13 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - false
   * 14 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - false
   * 15 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - true
   * 16 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - true
   * 17 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - false
   * 18 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - true
   * 19 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I21 Branch 7 IFNULL L156 - false
   * 20 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I24 Branch 8 IFLE L156 - true
   * 21 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I37 Branch 9 IFEQ L160 - true
   * 22 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I37 Branch 9 IFEQ L160 - false
   * 23 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I69 Branch 10 IFNONNULL L169 - false
   * 24 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - false
   */
  @Test
  public void test5()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setUserDefinitions("t~O?TM7]=vwo+,");
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      HashtableCache hashtableCache0 = (HashtableCache)hashtableCacheManager0.getCache("t~O?TM7]=vwo+,");
      textConfigurationRealm0.setAuthorizationCache((Cache) hashtableCache0);
      textConfigurationRealm0.accountAndRoleCachesCreated();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_156", textConfigurationRealm0.getName());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - true
   */
  @Test
  public void test6()  throws Throwable  {
      Map<String, String> map0 = TextConfigurationRealm.toMap((Collection<String>) null);
      assertNull(map0);
  }
}
