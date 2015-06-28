/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.realm.text.PropertiesRealm;

public class PropertiesRealmEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.text.PropertiesRealm.setUseXmlFormat(Z)V: root-Branch
   * 2 org.jsecurity.realm.text.PropertiesRealm.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PropertiesRealm propertiesRealm0 = new PropertiesRealm();
      propertiesRealm0.setUseXmlFormat(false);
      assertEquals("org.jsecurity.realm.text.PropertiesRealm_0", propertiesRealm0.getName());
  }

  //Test case number: 1
  /*
   * 24 covered goals:
   * 1 org.jsecurity.realm.text.PropertiesRealm.destroy()V: I4 Branch 5 IFNULL L151 - true
   * 2 org.jsecurity.realm.text.PropertiesRealm.getName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.realm.text.PropertiesRealm.getRolename(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.realm.text.PropertiesRealm.getUsername(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.realm.text.PropertiesRealm.afterRoleCacheSet()V: I14 Branch 2 IFEQ L135 - false
   * 6 org.jsecurity.realm.text.PropertiesRealm.afterRoleCacheSet()V: I48 Branch 3 IFLE L144 - true
   * 7 org.jsecurity.realm.text.PropertiesRealm.loadProperties(Ljava/lang/String;)Ljava/util/Properties;: I14 Branch 12 IFEQ L240 - true
   * 8 org.jsecurity.realm.text.PropertiesRealm.loadProperties(Ljava/lang/String;)Ljava/util/Properties;: I38 Branch 13 IFEQ L245 - true
   * 9 org.jsecurity.realm.text.PropertiesRealm.loadProperties(Ljava/lang/String;)Ljava/util/Properties;: I68 Branch 15 IFEQ L254 - true
   * 10 org.jsecurity.realm.text.PropertiesRealm.isRolename(Ljava/lang/String;)Z: I3 Branch 29 IFNULL L356 - false
   * 11 org.jsecurity.realm.text.PropertiesRealm.isRolename(Ljava/lang/String;)Z: I8 Branch 30 IFLE L356 - false
   * 12 org.jsecurity.realm.text.PropertiesRealm.<init>(Lorg/jsecurity/cache/CacheManager;)V: I27 Branch 1 IFNONNULL L124 - true
   * 13 org.jsecurity.realm.text.PropertiesRealm.isUsername(Ljava/lang/String;)Z: I3 Branch 27 IFNULL L352 - false
   * 14 org.jsecurity.realm.text.PropertiesRealm.isUsername(Ljava/lang/String;)Z: I8 Branch 28 IFLE L352 - true
   * 15 org.jsecurity.realm.text.PropertiesRealm.isUsername(Ljava/lang/String;)Z: I8 Branch 28 IFLE L352 - false
   * 16 org.jsecurity.realm.text.PropertiesRealm.loadProperties()V: I4 Branch 9 IFNULL L221 - false
   * 17 org.jsecurity.realm.text.PropertiesRealm.loadProperties()V: I8 Branch 10 IFNE L221 - true
   * 18 org.jsecurity.realm.text.PropertiesRealm.loadProperties()V: I20 Branch 11 IFEQ L226 - true
   * 19 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I21 Branch 23 IFEQ L321 - true
   * 20 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I21 Branch 23 IFEQ L321 - false
   * 21 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I40 Branch 24 IFEQ L325 - true
   * 22 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I64 Branch 25 IFEQ L329 - true
   * 23 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I64 Branch 25 IFEQ L329 - false
   * 24 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I90 Branch 26 IFEQ L332 - false
   */
  @Test
  public void test1()  throws Throwable  {
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      PropertiesRealm propertiesRealm0 = new PropertiesRealm((CacheManager) hashtableCacheManager0);
      assertNotNull(propertiesRealm0);
      
      propertiesRealm0.destroy();
      assertEquals("org.jsecurity.realm.text.PropertiesRealm_12", propertiesRealm0.getName());
      assertEquals("org.jsecurity.realm.text.PropertiesRealm-0-authorization", propertiesRealm0.getAuthorizationCacheName());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.text.PropertiesRealm.<init>(Lorg/jsecurity/cache/CacheManager;)V: I27 Branch 1 IFNONNULL L124 - false
   */
  @Test
  public void test2()  throws Throwable  {
      PropertiesRealm propertiesRealm0 = null;
      try {
        propertiesRealm0 = new PropertiesRealm((CacheManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * cacheManager argument cannot be null.
         */
      }
  }

  //Test case number: 3
  /*
   * 25 covered goals:
   * 1 org.jsecurity.realm.text.PropertiesRealm.reloadPropertiesIfNecessary()V: I4 Branch 16 IFEQ L273 - true
   * 2 org.jsecurity.realm.text.PropertiesRealm.isSourceModified()Z: I7 Branch 17 IFLE L280 - true
   * 3 org.jsecurity.realm.text.PropertiesRealm.getName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.realm.text.PropertiesRealm.getRolename(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.realm.text.PropertiesRealm.getUsername(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 6 org.jsecurity.realm.text.PropertiesRealm.afterRoleCacheSet()V: I14 Branch 2 IFEQ L135 - false
   * 7 org.jsecurity.realm.text.PropertiesRealm.afterRoleCacheSet()V: I48 Branch 3 IFLE L144 - true
   * 8 org.jsecurity.realm.text.PropertiesRealm.loadProperties(Ljava/lang/String;)Ljava/util/Properties;: I14 Branch 12 IFEQ L240 - true
   * 9 org.jsecurity.realm.text.PropertiesRealm.loadProperties(Ljava/lang/String;)Ljava/util/Properties;: I38 Branch 13 IFEQ L245 - true
   * 10 org.jsecurity.realm.text.PropertiesRealm.loadProperties(Ljava/lang/String;)Ljava/util/Properties;: I68 Branch 15 IFEQ L254 - true
   * 11 org.jsecurity.realm.text.PropertiesRealm.isRolename(Ljava/lang/String;)Z: I3 Branch 29 IFNULL L356 - false
   * 12 org.jsecurity.realm.text.PropertiesRealm.isRolename(Ljava/lang/String;)Z: I8 Branch 30 IFLE L356 - false
   * 13 org.jsecurity.realm.text.PropertiesRealm.<init>(Lorg/jsecurity/cache/CacheManager;)V: I27 Branch 1 IFNONNULL L124 - true
   * 14 org.jsecurity.realm.text.PropertiesRealm.isUsername(Ljava/lang/String;)Z: I3 Branch 27 IFNULL L352 - false
   * 15 org.jsecurity.realm.text.PropertiesRealm.isUsername(Ljava/lang/String;)Z: I8 Branch 28 IFLE L352 - true
   * 16 org.jsecurity.realm.text.PropertiesRealm.isUsername(Ljava/lang/String;)Z: I8 Branch 28 IFLE L352 - false
   * 17 org.jsecurity.realm.text.PropertiesRealm.loadProperties()V: I4 Branch 9 IFNULL L221 - false
   * 18 org.jsecurity.realm.text.PropertiesRealm.loadProperties()V: I8 Branch 10 IFNE L221 - true
   * 19 org.jsecurity.realm.text.PropertiesRealm.loadProperties()V: I20 Branch 11 IFEQ L226 - true
   * 20 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I21 Branch 23 IFEQ L321 - true
   * 21 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I21 Branch 23 IFEQ L321 - false
   * 22 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I40 Branch 24 IFEQ L325 - true
   * 23 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I64 Branch 25 IFEQ L329 - true
   * 24 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I64 Branch 25 IFEQ L329 - false
   * 25 org.jsecurity.realm.text.PropertiesRealm.createRealmEntitiesFromProperties(Ljava/util/Properties;)V: I90 Branch 26 IFEQ L332 - false
   */
  @Test
  public void test3()  throws Throwable  {
      HashtableCacheManager hashtableCacheManager0 = new HashtableCacheManager();
      PropertiesRealm propertiesRealm0 = new PropertiesRealm((CacheManager) hashtableCacheManager0);
      assertNotNull(propertiesRealm0);
      
      propertiesRealm0.run();
      assertEquals("org.jsecurity.realm.text.PropertiesRealm_123", propertiesRealm0.getName());
  }
}
