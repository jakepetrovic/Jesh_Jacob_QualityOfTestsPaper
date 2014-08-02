/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.subject;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class SimplePrincipalCollectionEvoSuiteTest {


  //Test case number: 0
  /*
   * 16 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.<init>(Lorg/jsecurity/subject/PrincipalCollection;)V: root-Branch
   * 2 org.jsecurity.subject.SimplePrincipalCollection.<init>(Ljava/lang/Object;Ljava/lang/String;)V: I8 Branch 1 IFEQ L41 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.getPrincipalsLazy(Ljava/lang/String;)Ljava/util/Collection;: I4 Branch 2 IFNONNULL L57 - false
   * 4 org.jsecurity.subject.SimplePrincipalCollection.getPrincipalsLazy(Ljava/lang/String;)Ljava/util/Collection;: I23 Branch 3 IFNONNULL L61 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.add(Ljava/lang/Object;Ljava/lang/String;)V: I3 Branch 4 IFNONNULL L69 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.add(Ljava/lang/Object;Ljava/lang/String;)V: I14 Branch 5 IFNONNULL L72 - true
   * 7 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I4 Branch 9 IFNULL L92 - false
   * 8 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I14 Branch 10 IFEQ L93 - true
   * 9 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I14 Branch 10 IFEQ L93 - false
   * 10 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I29 Branch 11 IFEQ L94 - true
   * 11 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I29 Branch 11 IFEQ L94 - false
   * 12 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I4 Branch 28 IFNULL L159 - false
   * 13 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I8 Branch 29 IFLE L159 - true
   * 14 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I24 Branch 30 IFNULL L163 - false
   * 15 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I27 Branch 31 IFLE L163 - true
   * 16 org.jsecurity.subject.SimplePrincipalCollection.getRealmNames()Ljava/util/Set;: I4 Branch 32 IFNONNULL L170 - true
   */
  @Test
  public void test0()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "[]", "[]");
      assertNotNull(simplePrincipalCollection0);
      
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(false, simplePrincipalCollection1.isEmpty());
      assertNotNull(simplePrincipalCollection1);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.<init>(Ljava/util/Collection;Ljava/lang/String;)V: root-Branch
   * 2 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I3 Branch 6 IFNONNULL L79 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I14 Branch 7 IFNONNULL L82 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I26 Branch 8 IFLE L85 - false
   */
  @Test
  public void test1()  throws Throwable  {
      HashSet<String> hashSet0 = new HashSet<String>();
      SimplePrincipalCollection simplePrincipalCollection0 = null;
      try {
        simplePrincipalCollection0 = new SimplePrincipalCollection((Collection) hashSet0, "principals argument cannot be null.");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * principals argument cannot be an empty collection.
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.<init>(Ljava/lang/Object;Ljava/lang/String;)V: I8 Branch 1 IFEQ L41 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I3 Branch 6 IFNONNULL L79 - false
   */
  @Test
  public void test2()  throws Throwable  {
      HashSet<Object> hashSet0 = new HashSet<Object>();
      SimplePrincipalCollection simplePrincipalCollection0 = null;
      try {
        simplePrincipalCollection0 = new SimplePrincipalCollection((Object) hashSet0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * realmName argument cannot be null.
         */
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.getPrincipalsLazy(Ljava/lang/String;)Ljava/util/Collection;: I4 Branch 2 IFNONNULL L57 - true
   * 2 org.jsecurity.subject.SimplePrincipalCollection.getPrincipalsLazy(Ljava/lang/String;)Ljava/util/Collection;: I23 Branch 3 IFNONNULL L61 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I26 Branch 8 IFLE L85 - true
   */
  @Test
  public void test3()  throws Throwable  {
      HashSet<String> hashSet0 = new HashSet<String>();
      hashSet0.add("[]");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Collection) hashSet0, "principals argument cannot be null.");
      assertNotNull(simplePrincipalCollection0);
      
      Collection<Object> collection0 = simplePrincipalCollection0.getPrincipalsLazy("principals argument cannot be null.");
      assertEquals(false, collection0.isEmpty());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.add(Ljava/lang/Object;Ljava/lang/String;)V: I3 Branch 4 IFNONNULL L69 - false
   */
  @Test
  public void test4()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = null;
      try {
        simplePrincipalCollection0 = new SimplePrincipalCollection((Object) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * realmName argument cannot be null.
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.add(Ljava/lang/Object;Ljava/lang/String;)V: I14 Branch 5 IFNONNULL L72 - false
   */
  @Test
  public void test5()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = null;
      try {
        simplePrincipalCollection0 = new SimplePrincipalCollection((Object) null, "6&?}");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * principal argument cannot be null.
         */
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I14 Branch 7 IFNONNULL L82 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      // Undeclared exception!
      try {
        simplePrincipalCollection0.addAll((Collection) null, "d&(`UcI6!kHnS[]m");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * principals argument cannot be null.
         */
      }
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I13 Branch 37 IFEQ L196 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I23 Branch 38 IFNULL L198 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I33 Branch 39 IFNONNULL L198 - false
   * 4 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I4 Branch 36 IF_ACMPNE L193 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.getRealmNames()Ljava/util/Set;: I4 Branch 32 IFNONNULL L170 - false
   * 6 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I4 Branch 9 IFNULL L92 - true
   */
  @Test
  public void test7()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection((PrincipalCollection) simplePrincipalCollection0);
      assertNotNull(simplePrincipalCollection1);
      
      boolean boolean0 = simplePrincipalCollection0.equals((Object) simplePrincipalCollection1);
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I4 Branch 12 IFNULL L102 - true
   */
  @Test
  public void test8()  throws Throwable  {
      Class<?> class0 = SimplePrincipalCollection.class;
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = simplePrincipalCollection0.oneByType((Class<SimplePrincipalCollection>) class0);
      assertNull(simplePrincipalCollection1);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I4 Branch 12 IFNULL L102 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I8 Branch 13 IFLE L102 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I27 Branch 14 IFEQ L106 - false
   * 4 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I40 Branch 15 IFEQ L107 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I50 Branch 16 IFEQ L108 - false
   */
  @Test
  public void test9()  throws Throwable  {
      HashSet<String> hashSet0 = new HashSet<String>();
      hashSet0.add("[]");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Collection) hashSet0, "principals argument cannot be null.");
      assertNotNull(simplePrincipalCollection0);
      
      Class<?> class0 = Object.class;
      Collection<Integer> collection0 = simplePrincipalCollection0.oneByType((Class<Collection<Integer>>) class0);
      assertNotNull(collection0);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 10
  /*
   * 7 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I27 Branch 14 IFEQ L106 - true
   * 2 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I40 Branch 15 IFEQ L107 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I50 Branch 16 IFEQ L108 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I4 Branch 12 IFNULL L102 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I8 Branch 13 IFLE L102 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I27 Branch 14 IFEQ L106 - false
   * 7 org.jsecurity.subject.SimplePrincipalCollection.oneByType(Ljava/lang/Class;)Ljava/lang/Object;: I40 Branch 15 IFEQ L107 - false
   */
  @Test
  public void test10()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "[]", "[]");
      assertNotNull(simplePrincipalCollection0);
      
      Class<?> class0 = SimplePrincipalCollection.class;
      Set<String> set0 = simplePrincipalCollection0.oneByType((Class<Set<String>>) class0);
      assertNull(set0);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I4 Branch 17 IFNULL L117 - true
   */
  @Test
  public void test11()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      Class<?> class0 = Object.class;
      Collection<String> collection0 = simplePrincipalCollection0.byType((Class<String>) class0);
      assertEquals(0, collection0.size());
  }

  //Test case number: 12
  /*
   * 8 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I4 Branch 17 IFNULL L117 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I8 Branch 18 IFLE L117 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I33 Branch 19 IFEQ L122 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I33 Branch 19 IFEQ L122 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I46 Branch 20 IFEQ L123 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I46 Branch 20 IFEQ L123 - false
   * 7 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I56 Branch 21 IFEQ L124 - true
   * 8 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I73 Branch 22 IFLE L129 - false
   */
  @Test
  public void test12()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "[]", "[]");
      assertNotNull(simplePrincipalCollection0);
      
      Class<?> class0 = SimplePrincipalCollection.class;
      Collection<Integer> collection0 = simplePrincipalCollection0.byType((Class<Integer>) class0);
      assertEquals(true, collection0.isEmpty());
      assertEquals(false, simplePrincipalCollection0.isEmpty());
      assertNotNull(collection0);
  }

  //Test case number: 13
  /*
   * 9 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I56 Branch 21 IFEQ L124 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I73 Branch 22 IFLE L129 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.hashCode()I: I4 Branch 40 IFNULL L204 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I4 Branch 17 IFNULL L117 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I8 Branch 18 IFLE L117 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I33 Branch 19 IFEQ L122 - true
   * 7 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I33 Branch 19 IFEQ L122 - false
   * 8 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I46 Branch 20 IFEQ L123 - true
   * 9 org.jsecurity.subject.SimplePrincipalCollection.byType(Ljava/lang/Class;)Ljava/util/Collection;: I46 Branch 20 IFEQ L123 - false
   */
  @Test
  public void test13()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection((Object) simplePrincipalCollection0, "|Sf+w:)]");
      assertNotNull(simplePrincipalCollection1);
      
      Class<?> class0 = SimplePrincipalCollection.class;
      Collection<Collection<Set<Object>>> collection0 = simplePrincipalCollection1.byType((Class<Collection<Set<Object>>>) class0);
      assertNotNull(collection0);
      assertEquals(false, collection0.isEmpty());
  }

  //Test case number: 14
  /*
   * 6 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.asList()Ljava/util/List;: I9 Branch 23 IFLE L137 - true
   * 2 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I4 Branch 24 IFNULL L144 - false
   * 3 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I8 Branch 25 IFLE L144 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I33 Branch 26 IFEQ L149 - true
   * 5 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I33 Branch 26 IFEQ L149 - false
   * 6 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I51 Branch 27 IFLE L152 - true
   */
  @Test
  public void test14()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "[]", "[]");
      assertNotNull(simplePrincipalCollection0);
      
      List<Object> list0 = simplePrincipalCollection0.asList();
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.asList()Ljava/util/List;: I9 Branch 23 IFLE L137 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I4 Branch 24 IFNULL L144 - true
   */
  @Test
  public void test15()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      List<Object> list0 = simplePrincipalCollection0.asList();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 16
  /*
   * 6 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I51 Branch 27 IFLE L152 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.iterator()Ljava/util/Iterator;: root-Branch
   * 3 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I4 Branch 24 IFNULL L144 - false
   * 4 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I8 Branch 25 IFLE L144 - true
   * 5 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I33 Branch 26 IFEQ L149 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.asSet()Ljava/util/Set;: I33 Branch 26 IFEQ L149 - false
   */
  @Test
  public void test16()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simplePrincipalCollection0.getPrincipalsLazy("principals argument cannot be null.");
      simplePrincipalCollection0.iterator();
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I4 Branch 28 IFNULL L159 - true
   */
  @Test
  public void test17()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      Collection<Object> collection0 = simplePrincipalCollection0.fromRealm("");
      assertEquals(true, collection0.isEmpty());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I24 Branch 30 IFNULL L163 - true
   */
  @Test
  public void test18()  throws Throwable  {
      HashSet<String> hashSet0 = new HashSet<String>();
      hashSet0.add("[]");
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Collection) hashSet0, "principals argument cannot be null.");
      assertNotNull(simplePrincipalCollection0);
      
      Collection<Object> collection0 = simplePrincipalCollection0.fromRealm("[]");
      assertNotNull(collection0);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 19
  /*
   * 9 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I27 Branch 31 IFLE L163 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I4 Branch 28 IFNULL L159 - false
   * 3 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I8 Branch 29 IFLE L159 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.fromRealm(Ljava/lang/String;)Ljava/util/Collection;: I24 Branch 30 IFNULL L163 - false
   * 5 org.jsecurity.subject.SimplePrincipalCollection.getRealmNames()Ljava/util/Set;: I4 Branch 32 IFNONNULL L170 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I4 Branch 9 IFNULL L92 - false
   * 7 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I14 Branch 10 IFEQ L93 - true
   * 8 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I14 Branch 10 IFEQ L93 - false
   * 9 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I29 Branch 11 IFEQ L94 - true
   */
  @Test
  public void test19()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simplePrincipalCollection0.getPrincipalsLazy("principals argument cannot be null.");
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.isEmpty()Z: I4 Branch 33 IFNULL L178 - true
   */
  @Test
  public void test20()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      boolean boolean0 = simplePrincipalCollection0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.isEmpty()Z: I4 Branch 33 IFNULL L178 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.isEmpty()Z: I8 Branch 34 IFLE L178 - true
   */
  @Test
  public void test21()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simplePrincipalCollection0.getPrincipalsLazy("Ba`_I");
      boolean boolean0 = simplePrincipalCollection0.isEmpty();
      assertEquals(false, simplePrincipalCollection0.isEmpty());
      assertEquals(false, boolean0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.clear()V: I4 Branch 35 IFNULL L182 - true
   */
  @Test
  public void test22()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simplePrincipalCollection0.clear();
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.clear()V: I4 Branch 35 IFNULL L182 - false
   */
  @Test
  public void test23()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      simplePrincipalCollection0.getPrincipalsLazy("");
      assertEquals(false, simplePrincipalCollection0.isEmpty());
      
      simplePrincipalCollection0.clear();
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 24
  /*
   * 6 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I4 Branch 36 IF_ACMPNE L193 - true
   * 2 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I13 Branch 37 IFEQ L196 - true
   * 3 org.jsecurity.subject.SimplePrincipalCollection.<init>(Ljava/util/Collection;Ljava/lang/String;)V: root-Branch
   * 4 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I3 Branch 6 IFNONNULL L79 - true
   * 5 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I14 Branch 7 IFNONNULL L82 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.addAll(Ljava/util/Collection;Ljava/lang/String;)V: I26 Branch 8 IFLE L85 - true
   */
  @Test
  public void test24()  throws Throwable  {
      HashSet<String> hashSet0 = new HashSet<String>();
      hashSet0.add("[]");
      HashSet<Object> hashSet1 = (HashSet<Object>)hashSet0.clone();
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Collection) hashSet0, "principals argument cannot be null.");
      assertNotNull(simplePrincipalCollection0);
      
      boolean boolean0 = simplePrincipalCollection0.equals((Object) hashSet1);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
      assertEquals(false, boolean0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I4 Branch 36 IF_ACMPNE L193 - false
   */
  @Test
  public void test25()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      boolean boolean0 = simplePrincipalCollection0.equals((Object) simplePrincipalCollection0);
      assertEquals(true, boolean0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I23 Branch 38 IFNULL L198 - false
   */
  @Test
  public void test26()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection((Object) "[]", "[]");
      assertNotNull(simplePrincipalCollection1);
      
      boolean boolean0 = simplePrincipalCollection1.equals((Object) simplePrincipalCollection0);
      assertEquals(false, simplePrincipalCollection1.isEmpty());
      assertEquals(false, boolean0);
  }

  //Test case number: 27
  /*
   * 8 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I33 Branch 39 IFNONNULL L198 - true
   * 2 org.jsecurity.subject.SimplePrincipalCollection.<init>(Lorg/jsecurity/subject/PrincipalCollection;)V: root-Branch
   * 3 org.jsecurity.subject.SimplePrincipalCollection.<init>()V: root-Branch
   * 4 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I4 Branch 36 IF_ACMPNE L193 - true
   * 5 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I13 Branch 37 IFEQ L196 - false
   * 6 org.jsecurity.subject.SimplePrincipalCollection.equals(Ljava/lang/Object;)Z: I23 Branch 38 IFNULL L198 - true
   * 7 org.jsecurity.subject.SimplePrincipalCollection.getRealmNames()Ljava/util/Set;: I4 Branch 32 IFNONNULL L170 - false
   * 8 org.jsecurity.subject.SimplePrincipalCollection.addAll(Lorg/jsecurity/subject/PrincipalCollection;)V: I4 Branch 9 IFNULL L92 - true
   */
  @Test
  public void test27()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection((PrincipalCollection) simplePrincipalCollection0);
      assertNotNull(simplePrincipalCollection1);
      
      simplePrincipalCollection1.getPrincipalsLazy("");
      boolean boolean0 = simplePrincipalCollection0.equals((Object) simplePrincipalCollection1);
      assertEquals(false, simplePrincipalCollection1.isEmpty());
      assertEquals(false, boolean0);
  }

  //Test case number: 28
  /*
   * 7 covered goals:
   * 1 org.jsecurity.subject.SimplePrincipalCollection.hashCode()I: I4 Branch 40 IFNULL L204 - false
   * 2 org.jsecurity.subject.SimplePrincipalCollection.hashCode()I: I8 Branch 41 IFGT L204 - false
   * 3 org.jsecurity.subject.SimplePrincipalCollection.<init>(Ljava/lang/Object;Ljava/lang/String;)V: I8 Branch 1 IFEQ L41 - true
   * 4 org.jsecurity.subject.SimplePrincipalCollection.add(Ljava/lang/Object;Ljava/lang/String;)V: I3 Branch 4 IFNONNULL L69 - true
   * 5 org.jsecurity.subject.SimplePrincipalCollection.add(Ljava/lang/Object;Ljava/lang/String;)V: I14 Branch 5 IFNONNULL L72 - true
   * 6 org.jsecurity.subject.SimplePrincipalCollection.getPrincipalsLazy(Ljava/lang/String;)Ljava/util/Collection;: I4 Branch 2 IFNONNULL L57 - false
   * 7 org.jsecurity.subject.SimplePrincipalCollection.getPrincipalsLazy(Ljava/lang/String;)Ljava/util/Collection;: I23 Branch 3 IFNONNULL L61 - false
   */
  @Test
  public void test28()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "[]", "[]");
      assertNotNull(simplePrincipalCollection0);
      
      int int0 = simplePrincipalCollection0.hashCode();
      assertEquals(0, int0);
  }
}
