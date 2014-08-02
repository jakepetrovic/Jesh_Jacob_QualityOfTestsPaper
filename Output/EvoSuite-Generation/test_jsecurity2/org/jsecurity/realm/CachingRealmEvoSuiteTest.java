/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.realm.SimpleAccountRealm;

public class CachingRealmEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.jsecurity.realm.CachingRealm.getName()Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.realm.CachingRealm.getCacheManager()Lorg/jsecurity/cache/CacheManager;: root-Branch
   * 3 org.jsecurity.realm.CachingRealm.setName(Ljava/lang/String;)V: root-Branch
   * 4 org.jsecurity.realm.CachingRealm.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("]8");
      String string0 = simpleAccountRealm0.getName();
      assertEquals("]8", string0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.jsecurity.realm.CachingRealm.setCacheManager(Lorg/jsecurity/cache/CacheManager;)V: root-Branch
   * 2 org.jsecurity.realm.CachingRealm.getCacheManager()Lorg/jsecurity/cache/CacheManager;: root-Branch
   * 3 org.jsecurity.realm.CachingRealm.setName(Ljava/lang/String;)V: root-Branch
   * 4 org.jsecurity.realm.CachingRealm.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("]8");
      simpleAccountRealm0.setCacheManager((CacheManager) null);
      assertEquals("]8", simpleAccountRealm0.getName());
  }
}
