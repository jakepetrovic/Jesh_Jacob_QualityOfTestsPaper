/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.jsecurity.config.ConfigurationException;
import org.jsecurity.config.ReflectionBuilder;
import org.jsecurity.config.UnresolveableReferenceException;

public class ReflectionBuilderEvoSuiteTest {


  //Test case number: 0
  /*
   * 10 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.getId(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.config.ReflectionBuilder.isReference(Ljava/lang/String;)Z: I3 Branch 16 IFNULL L179 - false
   * 3 org.jsecurity.config.ReflectionBuilder.isReference(Ljava/lang/String;)Z: I8 Branch 17 IFLE L179 - false
   * 4 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I4 Branch 18 IFNULL L187 - false
   * 5 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I8 Branch 19 IFGT L187 - true
   * 6 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I21 Branch 20 IFNONNULL L188 - false
   * 7 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V: I5 Branch 23 IFEQ L208 - false
   * 8 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V: I16 Branch 24 IFEQ L210 - true
   * 9 org.jsecurity.config.ReflectionBuilder.setObjects(Ljava/util/Map;)V: root-Branch
   * 10 org.jsecurity.config.ReflectionBuilder.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      Object object0 = new Object();
      // Undeclared exception!
      try {
        reflectionBuilder0.applyProperty(object0, "$~:", "$~:");
        fail("Expecting exception: UnresolveableReferenceException");
      } catch(UnresolveableReferenceException e) {
        /*
         * The object with id [~:] has not yet been defined and therefore cannot be referenced.  Please ensure objects are defined in the order in which they should be created and made avaialable for future reference.
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I3 Branch 1 IFNULL L73 - true
   * 2 org.jsecurity.config.ReflectionBuilder.<init>(Ljava/util/Map;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder((Map) hashMap0);
      Map<Object, Object> map0 = reflectionBuilder0.buildObjects((Map<String, String>) null);
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I3 Branch 1 IFNULL L73 - false
   * 2 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I6 Branch 2 IFGT L73 - true
   */
  @Test
  public void test2()  throws Throwable  {
      HashMap<String, ReflectionBuilder> hashMap0 = new HashMap<String, ReflectionBuilder>();
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder((Map) hashMap0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Map<Object, Object> map0 = reflectionBuilder0.buildObjects((Map<String, String>) hashMap1);
      assertEquals(0, map0.size());
  }

  //Test case number: 3
  /*
   * 11 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I6 Branch 2 IFGT L73 - false
   * 2 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I28 Branch 3 IFEQ L79 - true
   * 3 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I28 Branch 3 IFEQ L79 - false
   * 4 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I40 Branch 4 IFLT L80 - false
   * 5 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I46 Branch 5 IFLE L80 - true
   * 6 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I78 Branch 6 IFEQ L88 - true
   * 7 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I107 Branch 7 IFEQ L93 - false
   * 8 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V: I9 Branch 10 IFLT L127 - false
   * 9 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V: I32 Branch 11 IFLE L131 - true
   * 10 org.jsecurity.config.ReflectionBuilder.applySingleProperty(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I11 Branch 14 IFLE L162 - true
   * 11 org.jsecurity.config.ReflectionBuilder.applySingleProperty(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I22 Branch 15 IFNONNULL L166 - false
   */
  @Test
  public void test3()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("java.lang.Thread", "java.lang.Thread");
      // Undeclared exception!
      try {
        reflectionBuilder0.buildObjects((Map<String, String>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Configuration error.  Specified object [java] with property [lang.Thread] without first defining that object's class.  Please first specify the class property first, e.g. myObject.class = fully_qualified_class_name and then define additional properties.
         */
      }
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I40 Branch 4 IFLT L80 - true
   * 2 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I78 Branch 6 IFEQ L88 - false
   * 3 org.jsecurity.config.ReflectionBuilder.createNewInstance(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 8 IFNULL L104 - true
   * 4 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I3 Branch 1 IFNULL L73 - false
   * 5 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I6 Branch 2 IFGT L73 - false
   * 6 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I28 Branch 3 IFEQ L79 - true
   * 7 org.jsecurity.config.ReflectionBuilder.buildObjects(Ljava/util/Map;)Ljava/util/Map;: I28 Branch 3 IFEQ L79 - false
   */
  @Test
  public void test4()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>(100);
      hashMap0.put("", "");
      // Undeclared exception!
      try {
        reflectionBuilder0.buildObjects((Map<String, String>) hashMap0);
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * Unable to instantiate class [] for object named ''.  Please ensure you've specified the fully qualified class name correctly.
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.config.ReflectionBuilder.createNewInstance(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 8 IFNULL L104 - false
   */
  @Test
  public void test5()  throws Throwable  {
      HashMap<String, ReflectionBuilder> hashMap0 = new HashMap<String, ReflectionBuilder>();
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder((Map) hashMap0);
      hashMap0.put("r", reflectionBuilder0);
      // Undeclared exception!
      try {
        reflectionBuilder0.createNewInstance((Map) hashMap0, "r", "r");
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * Unable to instantiate class [r] for object named 'r'.  Please ensure you've specified the fully qualified class name correctly.
         */
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.applyGlobalProperty(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFEQ L145 - false
   * 2 org.jsecurity.config.ReflectionBuilder.getObjects()Ljava/util/Map;: root-Branch
   * 3 org.jsecurity.config.ReflectionBuilder.createNewInstance(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 8 IFNULL L104 - true
   * 4 org.jsecurity.config.ReflectionBuilder.createNewInstance(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V: I39 Branch 9 IFEQ L112 - true
   */
  @Test
  public void test6()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      Map<Object, Object> map0 = reflectionBuilder0.getObjects();
      assertNotNull(map0);
      
      reflectionBuilder0.createNewInstance((Map) map0, "]o access allowed to system property 'org.apache.commons.logging.log' - ", "java.lang.Thread");
      // Undeclared exception!
      try {
        reflectionBuilder0.applyGlobalProperty((Map) map0, "java.lang.Thread", "g+miBjmH8-M(");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/beanutils/PropertyUtils
         */
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V: I9 Branch 10 IFLT L127 - true
   */
  @Test
  public void test7()  throws Throwable  {
      HashMap<Object, Map.Entry<Object, ReflectionBuilder>> hashMap0 = new HashMap<Object, Map.Entry<Object, ReflectionBuilder>>();
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      // Undeclared exception!
      try {
        reflectionBuilder0.applyProperty("4fO4LCeqlyp;5", "?<99l3pTaW$(k?oeSQ", (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * All property keys must contain a '.' character. (e.g. myBean.property = value)  These should already be separated out by buildObjects().
         */
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.jsecurity.config.ReflectionBuilder.applyGlobalProperty(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFEQ L145 - true
   */
  @Test
  public void test8()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      reflectionBuilder0.applyGlobalProperty((Map) hashMap0, "{}", "{}");
      assertEquals(true, hashMap0.isEmpty());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.jsecurity.config.ReflectionBuilder.isReference(Ljava/lang/String;)Z: I3 Branch 16 IFNULL L179 - true
   */
  @Test
  public void test9()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      boolean boolean0 = reflectionBuilder0.isReference((String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.isReference(Ljava/lang/String;)Z: I8 Branch 17 IFLE L179 - true
   * 2 org.jsecurity.config.ReflectionBuilder.unescapeIfNecessary(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 21 IFNULL L198 - false
   * 3 org.jsecurity.config.ReflectionBuilder.unescapeIfNecessary(Ljava/lang/String;)Ljava/lang/String;: I8 Branch 22 IFLE L198 - true
   * 4 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V: I5 Branch 23 IFEQ L208 - true
   * 5 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V: I56 Branch 25 IFEQ L220 - true
   */
  @Test
  public void test10()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      // Undeclared exception!
      try {
        reflectionBuilder0.applyProperty((Object) reflectionBuilder0, "b(miDTkw1V/", "b(miDTkw1V/");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/beanutils/BeanUtils
         */
      }
  }

  //Test case number: 11
  /*
   * 7 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I4 Branch 18 IFNULL L187 - true
   * 2 org.jsecurity.config.ReflectionBuilder.getId(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I21 Branch 20 IFNONNULL L188 - false
   * 4 org.jsecurity.config.ReflectionBuilder.isReference(Ljava/lang/String;)Z: I3 Branch 16 IFNULL L179 - false
   * 5 org.jsecurity.config.ReflectionBuilder.isReference(Ljava/lang/String;)Z: I8 Branch 17 IFLE L179 - false
   * 6 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V: I5 Branch 23 IFEQ L208 - false
   * 7 org.jsecurity.config.ReflectionBuilder.applyProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V: I16 Branch 24 IFEQ L210 - true
   */
  @Test
  public void test11()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder((Map) null);
      Object object0 = new Object();
      // Undeclared exception!
      try {
        reflectionBuilder0.applyProperty(object0, "$~:", "$~:");
        fail("Expecting exception: UnresolveableReferenceException");
      } catch(UnresolveableReferenceException e) {
        /*
         * The object with id [~:] has not yet been defined and therefore cannot be referenced.  Please ensure objects are defined in the order in which they should be created and made avaialable for future reference.
         */
      }
  }

  //Test case number: 12
  /*
   * 4 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I8 Branch 19 IFGT L187 - false
   * 2 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I21 Branch 20 IFNONNULL L188 - true
   * 3 org.jsecurity.config.ReflectionBuilder.<init>(Ljava/util/Map;)V: root-Branch
   * 4 org.jsecurity.config.ReflectionBuilder.getReferencedObject(Ljava/lang/String;)Ljava/lang/Object;: I4 Branch 18 IFNULL L187 - false
   */
  @Test
  public void test12()  throws Throwable  {
      HashMap<String, ReflectionBuilder> hashMap0 = new HashMap<String, ReflectionBuilder>();
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder((Map) hashMap0);
      hashMap0.put("r", reflectionBuilder0);
      ReflectionBuilder reflectionBuilder1 = (ReflectionBuilder)reflectionBuilder0.getReferencedObject("r");
      assertSame(reflectionBuilder0, reflectionBuilder1);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 org.jsecurity.config.ReflectionBuilder.unescapeIfNecessary(Ljava/lang/String;)Ljava/lang/String;: I3 Branch 21 IFNULL L198 - true
   * 2 org.jsecurity.config.ReflectionBuilder.setObjects(Ljava/util/Map;)V: root-Branch
   * 3 org.jsecurity.config.ReflectionBuilder.<init>()V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      ReflectionBuilder reflectionBuilder0 = new ReflectionBuilder();
      String string0 = reflectionBuilder0.unescapeIfNecessary((String) null);
      assertNull(string0);
  }
}
