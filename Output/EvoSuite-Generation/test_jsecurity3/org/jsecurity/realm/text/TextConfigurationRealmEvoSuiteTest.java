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
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.realm.text.TextConfigurationRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class TextConfigurationRealmEvoSuiteTest {


  //Test case number: 0
  /*
   * 8 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I21 Branch 7 IFNULL L156 - true
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.setUserDefinitions(Ljava/lang/String;)V: root-Branch
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.<init>()V: root-Branch
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.getUserDefinitions()Ljava/lang/String;: root-Branch
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - true
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - false
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - false
   */
  @Test
  public void test0()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setUserDefinitions("");
      textConfigurationRealm0.processUserDefinitions();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_0", textConfigurationRealm0.getName());
  }

  //Test case number: 1
  /*
   * 10 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I21 Branch 2 IFNULL L130 - true
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - true
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - false
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - false
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.getRoleDefinitions()Ljava/lang/String;: root-Branch
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.processDefinitions()V: root-Branch
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.setRoleDefinitions(Ljava/lang/String;)V: root-Branch
   * 9 org.jsecurity.realm.text.TextConfigurationRealm.accountAndRoleCachesCreated()V: root-Branch
   * 10 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - false
   */
  @Test
  public void test1()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setRoleDefinitions("");
      textConfigurationRealm0.afterAuthorizationCacheSet();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_14", textConfigurationRealm0.getName());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      textConfigurationRealm0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertNull(textConfigurationRealm0.getAuthorizationCacheName());
  }

  //Test case number: 3
  /*
   * 13 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I58 Branch 5 IFNONNULL L138 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.setRoleDefinitions(Ljava/lang/String;)V: root-Branch
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - false
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - true
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I21 Branch 2 IFNULL L130 - false
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I24 Branch 3 IFLE L130 - true
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I37 Branch 4 IFEQ L134 - true
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I37 Branch 4 IFEQ L134 - false
   * 9 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I58 Branch 5 IFNONNULL L138 - false
   * 10 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - false
   * 11 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - true
   * 12 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - true
   * 13 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - false
   */
  @Test
  public void test3()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setRoleDefinitions("oI(=Qh0H");
      textConfigurationRealm0.afterAuthorizationCacheSet();
      textConfigurationRealm0.accountAndRoleCachesCreated();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_35", textConfigurationRealm0.getName());
  }

  //Test case number: 4
  /*
   * 21 covered goals:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I69 Branch 10 IFNONNULL L169 - true
   * 2 org.jsecurity.realm.text.TextConfigurationRealm.setUserDefinitions(Ljava/lang/String;)V: root-Branch
   * 3 org.jsecurity.realm.text.TextConfigurationRealm.getRoleDefinitions()Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.realm.text.TextConfigurationRealm.processDefinitions()V: root-Branch
   * 5 org.jsecurity.realm.text.TextConfigurationRealm.<init>()V: root-Branch
   * 6 org.jsecurity.realm.text.TextConfigurationRealm.getUserDefinitions()Ljava/lang/String;: root-Branch
   * 7 org.jsecurity.realm.text.TextConfigurationRealm.accountAndRoleCachesCreated()V: root-Branch
   * 8 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - true
   * 9 org.jsecurity.realm.text.TextConfigurationRealm.toLines(Ljava/lang/String;)Ljava/util/Set;: I17 Branch 14 IFEQ L194 - false
   * 10 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - false
   * 11 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I6 Branch 16 IFLE L201 - true
   * 12 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - true
   * 13 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I25 Branch 17 IFEQ L206 - false
   * 14 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I8 Branch 6 IFNONNULL L151 - true
   * 15 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I21 Branch 7 IFNULL L156 - false
   * 16 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I24 Branch 8 IFLE L156 - true
   * 17 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I37 Branch 9 IFEQ L160 - true
   * 18 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I37 Branch 9 IFEQ L160 - false
   * 19 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I69 Branch 10 IFNONNULL L169 - false
   * 20 org.jsecurity.realm.text.TextConfigurationRealm.processUserDefinitions()V: I95 Branch 11 IF_ICMPLE L175 - true
   * 21 org.jsecurity.realm.text.TextConfigurationRealm.processRoleDefinitions()V: I8 Branch 1 IFNONNULL L126 - false
   */
  @Test
  public void test4()  throws Throwable  {
      TextConfigurationRealm textConfigurationRealm0 = new TextConfigurationRealm();
      textConfigurationRealm0.setUserDefinitions("Found method setLogFactory(LogFactory) in '");
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      textConfigurationRealm0.setCacheManager((CacheManager) hashtableCacheManager0);
      textConfigurationRealm0.processUserDefinitions();
      assertEquals("org.jsecurity.realm.text.TextConfigurationRealm_90", textConfigurationRealm0.getName());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.text.TextConfigurationRealm.toMap(Ljava/util/Collection;)Ljava/util/Map;: I3 Branch 15 IFNULL L201 - true
   */
  @Test
  public void test5()  throws Throwable  {
      Map<String, String> map0 = TextConfigurationRealm.toMap((Collection<String>) null);
      assertNull(map0);
  }
}